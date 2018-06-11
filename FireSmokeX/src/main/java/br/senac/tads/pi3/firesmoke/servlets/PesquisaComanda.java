/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ComandaDAO;
import br.senac.tads.pi3.firesmoke.DAO.ComandaProdutoDAO;
import br.senac.tads.pi3.firesmoke.Model.Comanda;
import br.senac.tads.pi3.firesmoke.Model.ComandaProduto;
import br.senac.tads.pi3.firesmoke.Model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "PesquisaComanda", urlPatterns = {"/PesquisaComanda"})
public class PesquisaComanda extends HttpServlet {

    Comanda comanda;
    Produto produto;
    ComandaProduto comandaProduto;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        comanda = new Comanda();
        produto = new Produto();
        comandaProduto = new ComandaProduto();
        HttpSession sessao = request.getSession();
        
        //PESQUISAR COMANDA
        String pesquisa = request.getParameter("buscarComanda");

        sessao.setAttribute("idcomanda", pesquisa);
        ComandaDAO comandadados = new ComandaDAO();
        ComandaProdutoDAO comandaprodutodados = new ComandaProdutoDAO();
        if (pesquisa != null) {

            comanda = comandadados.pesquisar(Integer.parseInt(pesquisa));

            comandaProduto.setIdcomandaCom(comanda.getIdcomanda());

            request.setAttribute("comandaProduto", comandaProduto);
            System.out.println(comandaProduto.getIdcomandaCom());

            if (comandaProduto.getIdcomandaCom()== 0) {
                request.getRequestDispatcher("vender.jsp").forward(request, response);

            } else {
                ResultSet lista = comandaprodutodados.pesquisacomandaproduto(Integer.parseInt(pesquisa));
                
                request.setAttribute("lista", lista);
                
                request.getRequestDispatcher("venderResult.jsp").forward(request, response);
            }
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
