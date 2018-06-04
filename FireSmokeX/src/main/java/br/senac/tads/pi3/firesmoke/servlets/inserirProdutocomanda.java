/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ComandaProdutoDAO;
import br.senac.tads.pi3.firesmoke.Model.Comanda;
import br.senac.tads.pi3.firesmoke.Model.ComandaProduto;
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
@WebServlet(name = "inserirProdutocomanda", urlPatterns = {"/inserirProdutocomanda"})
public class inserirProdutocomanda extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    Produto produto;
    Comanda comanda;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int quantidade = Integer.parseInt(request.getParameter("qtde"));
        int pesquisa = Integer.parseInt(request.getParameter("buscar"));
        String busca = request.getParameter("buscaProd");

        comanda.setIdcomanda(pesquisa);
        
        produto.setSku(busca);
        ComandaProdutoDAO comandaprodutodados = new ComandaProdutoDAO();
        ComandaProduto comandaproduto = new ComandaProduto();
        String msg = comandaprodutodados.inserir(comanda, produto);
        request.getRequestDispatcher("inserirComandaResult.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
