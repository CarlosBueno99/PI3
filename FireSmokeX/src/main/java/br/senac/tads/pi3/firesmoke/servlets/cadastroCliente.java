/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ClienteDAO;
import br.senac.tads.pi3.firesmoke.Model.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import br.senac.tads.pi3.firesmoke.DAO.ModuloConexao;

/**
 *
 * @author Marcos
 */
@WebServlet(name = "cadastroCliente", urlPatterns = {"/cadastroCliente"})
public class cadastroCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cliente = new Cliente();

        cliente.setNome(request.getParameter("nome"));
        cliente.setEmail(request.getParameter("email"));
        cliente.setCpf(request.getParameter("cpf"));
        cliente.setFone(request.getParameter("fone"));
        cliente.setDtnascimento(request.getParameter("dtnascimento"));
        ClienteDAO dao = new ClienteDAO();
        String msg = dao.inserir(cliente);
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
