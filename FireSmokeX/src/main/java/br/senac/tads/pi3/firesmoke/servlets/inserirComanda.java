/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ComandaDAO;
import br.senac.tads.pi3.firesmoke.DAO.ComandaProdutoDAO;
import br.senac.tads.pi3.firesmoke.DAO.ProdutoDAO;
import br.senac.tads.pi3.firesmoke.Model.Comanda;
import br.senac.tads.pi3.firesmoke.Model.ComandaProduto;
import br.senac.tads.pi3.firesmoke.Model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
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
@WebServlet(name = "inserirComanda", urlPatterns = {"/inserirComanda"})
public class inserirComanda extends HttpServlet {

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

        //PESQUISAR COMANDA
        int pesquisa = Integer.parseInt(request.getParameter("buscar"));
        
        ComandaDAO comandadados = new ComandaDAO();
        if (pesquisa != 0) {
            comanda = new Comanda();
            comandaProduto = new ComandaProduto();
            
            comanda = comandadados.pesquisar(pesquisa);
            comandaProduto.setIdcomandaCom(comanda.getIdcomanda());
            
            request.setAttribute("comandaProduto", comandaProduto);
            System.out.println(comandaProduto.getIdcomandaCom());
            
            if (comandaProduto.getIdcomandaCom()== 0) {
                request.getRequestDispatcher("inserirComanda.jsp").forward(request, response);
                
            } else {
                HttpSession sessao = request.getSession();
                sessao.setAttribute("idcomanda", comanda);
                request.getRequestDispatcher("inserirComandaResult.jsp").forward(request, response);
            }
        }
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
}
