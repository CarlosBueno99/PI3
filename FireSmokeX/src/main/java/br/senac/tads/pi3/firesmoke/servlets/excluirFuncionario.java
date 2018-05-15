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
@WebServlet(name = "excluirFuncionario", urlPatterns = {"/excluirFuncionario"})
public class excluirFuncionario extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    Funcionario funcionario;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //PESQUISAR PRODUTOS
        String pesquisa = request.getParameter("pesquisa");

        FuncionarioDAO funcionariodados = new FuncionarioDAO();
        if (!pesquisa.equalsIgnoreCase("") && pesquisa != null) {
            funcionario = new Funcionario();
            funcionario = funcionariodados.pesquisar(pesquisa);
            request.setAttribute("funcionario", funcionario);
            if (funcionario.getNome() != null) {
                request.getRequestDispatcher("excluirFuncResult.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("naosei.jsp").forward(request, response);
            }
        }
        //DELETAR CLIENTES
        funcionario.setNome(request.getParameter("nomeFunc"));
        funcionario.setCargo(request.getParameter("cargo"));
        funcionario.setCpf(request.getParameter("cpfFunc"));
        funcionario.setEndereco(request.getParameter("endereco"));
        funcionario.setDtnascimento(request.getParameter("dataFunc"));
        funcionario.setSexo(request.getParameter("sexo"));
        

        funcionariodados.deletar(funcionario);
        if (funcionario.getNome() != null) {
            request.getRequestDispatcher("excluirFuncResult.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("naosei.jsp").forward(request, response);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}