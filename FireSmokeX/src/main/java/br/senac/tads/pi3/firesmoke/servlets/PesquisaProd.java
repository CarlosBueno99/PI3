/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ProdutoDAO;
import br.senac.tads.pi3.firesmoke.Model.Cliente;
import br.senac.tads.pi3.firesmoke.Model.Comanda;
import br.senac.tads.pi3.firesmoke.Model.ComandaProduto;
import br.senac.tads.pi3.firesmoke.Model.Produto;
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
@WebServlet(name = "PesquisaProd", urlPatterns = {"/PesquisaProd"})
public class PesquisaProd extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    ComandaProduto comandaProduto;
    Produto produto;
    Comanda comanda;
    Cliente cliente;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        cliente = new Cliente();
        //PESQUISAR PRODUTOS
        HttpSession sessao = request.getSession();

        String idComanda = (String) sessao.getAttribute("idcomanda");
        String nomeCliente = (String) sessao.getAttribute("nomecliente");

        System.out.println("aqui chegou" + idComanda);

        String pesquisa = request.getParameter("skuProd");

        sessao.setAttribute("skuprod", pesquisa);
        ProdutoDAO produtodados = new ProdutoDAO();
        if (!pesquisa.equalsIgnoreCase("") && pesquisa != null) {

            comandaProduto = new ComandaProduto();
            produto = new Produto();

            produto = produtodados.pesquisar(pesquisa);
            comandaProduto.setIdcomandaCom(Integer.parseInt(idComanda));
            cliente.setNome(nomeCliente);
            comandaProduto.setSkuProd(produto.getSku());
            comandaProduto.setNomeProd(produto.getNome());
            comandaProduto.setMarcaProd(produto.getMarca());
            comandaProduto.setTipoProd(produto.getTipo());
            comandaProduto.setPrecovendaProd(Double.parseDouble(produto.getPrecovenda()));

            request.setAttribute("comandaProduto", comandaProduto);
            request.setAttribute("cliente", cliente);
            if (comandaProduto.getNomeProd() != null) {
                request.getRequestDispatcher("venderResult.jsp").forward(request, response);
            }// else {
            //request.getRequestDispatcher("inserirComanda.jsp").forward(request, response);
            // }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
