/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.servlets;

import br.senac.tads.pi3.firesmoke.DAO.ProdutoDAO;
import br.senac.tads.pi3.firesmoke.Model.Comanda;
import br.senac.tads.pi3.firesmoke.Model.ComandaProduto;
import br.senac.tads.pi3.firesmoke.Model.Produto;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
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
@WebServlet(name = "pesquisaProduto", urlPatterns = {"/pesquisaProduto"})
public class pesquisaProduto extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    ComandaProduto comandaProduto;
    Produto produto;
    Comanda comanda;
    
     String idComanda;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //PESQUISAR PRODUTOS
        HttpSession sessao = request.getSession();
        
        
        
        
        idComanda = request.getParameter("idcomandaCom");
        
        System.out.println("aqui chegou"+idComanda);
        
                
        

        
        
        String pesquisa = request.getParameter("buscaProd");
        
        sessao.setAttribute("buscaProd", pesquisa);
        ProdutoDAO produtodados = new ProdutoDAO();
        if (!pesquisa.equalsIgnoreCase("") && pesquisa != null) {
            
            comandaProduto = new ComandaProduto();
            produto = new Produto();

            produto = produtodados.pesquisar(pesquisa);
            comandaProduto.setIdcomandaCom(Integer.parseInt(idComanda));
            comandaProduto.setSkuProd(produto.getSku());
            comandaProduto.setNomeProd(produto.getNome());
            comandaProduto.setMarcaProd(produto.getMarca());
            comandaProduto.setTipoProd(produto.getTipo());
            comandaProduto.setPrecovendaProd(produto.getPrecovenda());
            System.out.println(comandaProduto.getIdcomandaCom()+" sgdyagsy");
            

            request.setAttribute("comandaProduto", comandaProduto);
            
            
            if (comandaProduto.getNomeProd() != null) {
                System.out.println("entrou aqui inserirComandaResult");
                sessao.setAttribute("idcomandaCom", idComanda);

                request.getRequestDispatcher("inserirComandaResult.jsp").forward(request, response);
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
