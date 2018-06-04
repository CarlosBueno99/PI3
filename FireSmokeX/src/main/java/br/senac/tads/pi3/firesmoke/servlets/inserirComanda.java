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

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "inserirComanda", urlPatterns = {"/inserirComanda"})
public class inserirComanda extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    Comanda comanda;
    Produto produto;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //PESQUISAR COMANDA
        int pesquisa = Integer.parseInt(request.getParameter("buscar"));

        ComandaDAO comandadados = new ComandaDAO();
        if (pesquisa != 0) {
            comanda = new Comanda();
            comanda = comandadados.pesquisar(pesquisa);
            request.setAttribute("comanda", comanda);
            System.out.println(comanda.getIdcomanda());
            if (comanda.getIdcomanda() == 0) {
                request.getRequestDispatcher("inserirComanda.jsp").forward(request, response);

            } else {
                request.getRequestDispatcher("inserirComandaResult.jsp").forward(request, response);
            }
        }
        
    
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
