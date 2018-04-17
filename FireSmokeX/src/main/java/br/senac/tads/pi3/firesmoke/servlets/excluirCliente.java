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

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "excluirCliente", urlPatterns = {"/excluirCliente"})
public class excluirCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    Cliente cliente;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //PESQUISAR CLIENTES
        String pesquisa = request.getParameter("pesquisa");

        ClienteDAO clientedados = new ClienteDAO();
        if (!pesquisa.equalsIgnoreCase("") && pesquisa != null) {
            cliente = new Cliente();
            cliente = clientedados.pesquisar(pesquisa);
            request.setAttribute("cliente", cliente);
            if (cliente.getNome() != null) {
                request.getRequestDispatcher("excluirClienteResult.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("naosei.jsp").forward(request, response);
            }
        }
        //DELETAR CLIENTES
        cliente.setNome(request.getParameter("nome"));
        cliente.setEmail(request.getParameter("email"));
        cliente.setCpf(request.getParameter("cpf"));
        cliente.setFone(request.getParameter("fone"));
        cliente.setDtnascimento(request.getParameter("dtnascimento"));
        cliente.setEndereco(request.getParameter("endereco"));
        cliente.setSexo(request.getParameter("sexo"));

        clientedados.deletar(cliente);
        if (cliente.getNome() != null) {
            request.getRequestDispatcher("excluirClienteResult.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("naosei.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
