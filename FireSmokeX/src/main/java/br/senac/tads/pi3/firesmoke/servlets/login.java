/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ModuloConexao;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Marcos
 */
@WebServlet(name = "home", urlPatterns = {"/home"})
public class login extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        if(username.equals("guimfeitosa@hotmail.com") && password.equals("123")){
            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
        else {
            System.out.println("Usuário não encontrado");
        }
            
      
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
