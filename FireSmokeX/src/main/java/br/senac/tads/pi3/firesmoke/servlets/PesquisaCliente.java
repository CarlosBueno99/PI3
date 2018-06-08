/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ClienteDAO;
import br.senac.tads.pi3.firesmoke.Model.Cliente;
import br.senac.tads.pi3.firesmoke.Model.ComandaProduto;
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
@WebServlet(name = "PesquisaCliente", urlPatterns = {"/PesquisaCliente"})
public class PesquisaCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    Cliente cliente;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        ComandaProduto comandaProduto = new ComandaProduto();
        //PESQUISAR CLIENTES
        
        String idComanda = (String)sessao.getAttribute("idcomanda");
        String pesquisa = request.getParameter("pesqcliente");
        

        ClienteDAO clientedados = new ClienteDAO();
        if (!pesquisa.equalsIgnoreCase("") && pesquisa != null) {
            comandaProduto.setIdcomandaCom(Integer.parseInt(idComanda));
            cliente = new Cliente();
            cliente = clientedados.pesquisar(pesquisa);
            request.setAttribute("cliente", cliente);
            String nomeCliente = cliente.getNome(); 
            request.setAttribute("comandaProduto", comandaProduto);
            sessao.setAttribute("nomecliente", nomeCliente);
            if (cliente.getNome() != null) {
                request.getRequestDispatcher("venderResult.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("vender.jsp").forward(request, response);
            }

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
