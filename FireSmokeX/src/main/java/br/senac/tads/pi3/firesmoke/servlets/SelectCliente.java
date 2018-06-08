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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "SelectCliente", urlPatterns = {"/SelectCliente"})
public class SelectCliente extends HttpServlet {

    Cliente cliente;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        cliente = new Cliente();
        ClienteDAO clientedados = new ClienteDAO();

        ArrayList<Cliente> listacliente = clientedados.consulta();
        System.out.println(listacliente);
        request.setAttribute("listacliente", listacliente);
        request.getRequestDispatcher("relatorioClienteResult.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
