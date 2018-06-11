/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.FuncionarioDAO;
import br.senac.tads.pi3.firesmoke.Model.Funcionario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "SelectFuncionario", urlPatterns = {"/SelectFuncionario"})
public class SelectFuncionario extends HttpServlet {

    Funcionario funcionario;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        funcionario = new Funcionario();
        FuncionarioDAO funcionariodados = new FuncionarioDAO();

        ResultSet listafuncionarios = funcionariodados.consulta();
        System.out.println(listafuncionarios);
        request.setAttribute("listafuncionarios", listafuncionarios);
        request.getRequestDispatcher("relatorioFunc.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
