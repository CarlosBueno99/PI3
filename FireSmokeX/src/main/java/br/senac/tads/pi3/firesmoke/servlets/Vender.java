/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.VendaDAO;
import br.senac.tads.pi3.firesmoke.Model.Venda;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
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
@WebServlet(name = "Vender", urlPatterns = {"/Vender"})
public class Vender extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao = request.getSession();

        String idcomanda = (String) sessao.getAttribute("idcomanda");
        String nomecliente = (String) sessao.getAttribute("nomecliente");
        Double valortotal = (Double) sessao.getAttribute("valortotal");

        Venda venda = new Venda();
        VendaDAO vendadados = new VendaDAO();

        venda.setValorvenda(valortotal);
        vendadados.inserir(Integer.parseInt(idcomanda), nomecliente, valortotal);
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
