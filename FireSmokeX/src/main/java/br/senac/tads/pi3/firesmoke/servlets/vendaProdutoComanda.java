/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ComandaProdutoDAO;
import br.senac.tads.pi3.firesmoke.Model.Cliente;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "vendaProdutoComanda", urlPatterns = {"/vendaProdutoComanda"})
public class vendaProdutoComanda extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Produto produto = new Produto();
        Comanda comanda = new Comanda();
        Cliente cliente = new Cliente();
        ComandaProduto comandaproduto = new ComandaProduto();
        int quantidade = Integer.parseInt(request.getParameter("qtde"));
        HttpSession sessao = request.getSession();
        String pesquisa = (String) sessao.getAttribute("idcomanda");
        String busca = (String) sessao.getAttribute("skuprod");
        String nome = (String) sessao.getAttribute("nomecliente");

        comanda.setIdcomanda(Integer.parseInt(pesquisa));
        produto.setSku(busca);
        cliente.setNome(nome);
        comandaproduto.setQuantidade(quantidade);
        sessao.setAttribute("quantidade", quantidade);
        ComandaProdutoDAO comandaprodutodados = new ComandaProdutoDAO();

        String msg = comandaprodutodados.inserir(comanda, produto, quantidade);
        
        System.out.println("Salvou " + msg);
        request.getRequestDispatcher("venderResult.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
