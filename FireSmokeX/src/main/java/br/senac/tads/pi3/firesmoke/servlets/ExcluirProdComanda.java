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
@WebServlet(name = "ExcluirProdComanda", urlPatterns = {"/ExcluirProdComanda"})
public class ExcluirProdComanda extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Produto produto = new Produto();
        Comanda comanda = new Comanda();
        Cliente cliente1 = new Cliente();
        ComandaProduto comandaproduto1 = new ComandaProduto();
        String quantidade = request.getParameter("qtde");
        HttpSession sessao = request.getSession();
        String pesquisa = (String) sessao.getAttribute("idcomanda");
        String busca = (String) sessao.getAttribute("skuprod");

        String quant = (String) sessao.getAttribute("quantidade");
        ComandaProdutoDAO comandaprodutodados1 = new ComandaProdutoDAO();

        if (Integer.parseInt(quant) < Integer.parseInt(quantidade)) {
            String msg = comandaprodutodados1.alterar(Integer.parseInt(quantidade), Integer.parseInt(pesquisa), busca);
        } else {
            String msg = comandaprodutodados1.deletar(Integer.parseInt(pesquisa), busca);
        }
        request.getRequestDispatcher("venderResult.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
