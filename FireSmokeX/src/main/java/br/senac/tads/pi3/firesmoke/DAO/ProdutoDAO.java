/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.DAO;

import br.senac.tads.pi3.firesmoke.Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Feitosa
 */
public class ProdutoDAO {

    private Connection conexao;

     public String inserir(Produto produto) {
        String message = "";
        try {
            String sql = "INSERT INTO tbprodutos(nome, tipo, marca, sku, precovenda) VALUES(?,?,?,?,?)";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getTipo());
            stmt.setString(3, produto.getMarca());
            stmt.setString(4, produto.getSku());
            stmt.setString(5, produto.getPrecovenda());
            stmt.execute();
            stmt.close();
            message = "Produto " + produto.getNome() + " criado com sucesso";
        } catch (SQLException e) {
            message = "Produto " + produto.getNome() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }
      public void alterar(Produto produto) {
        try {
            String sql = "UPDATE tbprodutos SET nome= ?, tipo= ?, marca= ?, precovenda= ? WHERE tbprodutos.sku = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getTipo());
            stmt.setString(3, produto.getMarca());
            stmt.setString(4, produto.getPrecovenda());
            stmt.setString(6, produto.getSku());
            stmt.execute();
            stmt.close();
            System.out.println("Produto " + produto.getNome() + " alterado com sucesso");
        } catch (SQLException e) {
            System.out.println("Produto " + produto.getNome() + " não foi alterado com sucesso" + e.getMessage());
        }
    }

    public Produto pesquisar(String pesquisa) {

        Produto produto = new Produto();

        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT * FROM tbprodutos where sku = '" + pesquisa + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                produto.setNome(rs.getString("nome"));
                produto.setSku(rs.getString("sku"));
                produto.setTipo(rs.getString("tipo"));
                produto.setMarca(rs.getString("marca"));
                produto.setPrecovenda(rs.getString("precovenda"));

            }
            rs.close();
            stmt.close();
            
        } catch (SQLException e) {
            return null; 
        }
                    return produto;
    }

    public void consulta(String pesquisa) {
        Produto produto = new Produto();
        String message = "";
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbprodutos";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                produto.setNome(rs.getString("nome"));
                produto.setTipo(rs.getString("tipo"));
                produto.setMarca(rs.getString("marca"));
                produto.setSku(rs.getString("sku"));
                produto.setPrecovenda(rs.getString("precovenda"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {

        }
    }

    public void deletar(Produto produto) {
        String message = "";
        try {
            String sql = "DELETE FROM tbprodutos WHERE sku = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getSku());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Produto " + produto.getNome() + "não foi excluído com sucesso" + e.getMessage());
        }
    }
}
    
    

