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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Guilherme Feitosa
 */
@WebServlet(name = "cadastroFuncionario", urlPatterns = {"/cadastroFuncionario"})
public class cadastroFuncionario extends HttpServlet {

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome(request.getParameter("nomeFunc"));
        funcionario.setCargo(request.getParameter("cargo"));
        funcionario.setCpf(request.getParameter("cpfFunc"));
        funcionario.setEndereco(request.getParameter("endereco"));
        funcionario.setDtnascimento(request.getParameter("dataFunc"));
        funcionario.setSexo(request.getParameter("sexo"));
        FuncionarioDAO dao = new FuncionarioDAO();
        String msg = dao.inserir(funcionario);
        request.getRequestDispatcher("cadastroFunc.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
