/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ProdutoDAO;
import br.senac.tads.pi3.firesmoke.Model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "pesquisaProduto", urlPatterns = {"/pesquisaProduto"})
public class pesquisaProduto extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    Produto produto;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //PESQUISAR PRODUTOS
        String pesquisa = request.getParameter("buscaProd");

        ProdutoDAO produtodados = new ProdutoDAO();
        if (!pesquisa.equalsIgnoreCase("") && pesquisa != null) {
            produto = new Produto();
            produto = produtodados.pesquisar(pesquisa);
            request.setAttribute("produto", produto);
            if (produto.getNome() != null) {
                request.getRequestDispatcher("inserirComandaResult.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("inserirComanda.jsp").forward(request, response);
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
