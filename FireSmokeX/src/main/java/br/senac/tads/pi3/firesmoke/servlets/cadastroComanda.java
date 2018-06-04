/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ComandaDAO;
import br.senac.tads.pi3.firesmoke.Model.Comanda;
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
@WebServlet(name = "cadastroComanda", urlPatterns = {"/cadastroComanda"})
public class cadastroComanda extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Comanda comanda = new Comanda();

        comanda.setValortotal(0.00);
        comanda.setStatuspagamento(false);
        ComandaDAO dao = new ComandaDAO();
        String msg = dao.inserir(comanda);
        dao.pesquisaid(comanda);
        request.setAttribute("comanda", comanda);
        request.getRequestDispatcher("cadastroComandaResult.jsp").forward(request, response);

    }

}

