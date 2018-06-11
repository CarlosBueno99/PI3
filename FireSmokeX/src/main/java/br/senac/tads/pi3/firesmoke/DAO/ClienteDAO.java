/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.DAO;

import br.senac.tads.pi3.firesmoke.Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Feitosa
 */
public class ClienteDAO {

    private Connection conexao;

    public String inserir(Cliente cliente) {
        String message = "";
        try {
            String sql = "INSERT INTO tbclientes(nome, cpf, email, fone, dtnascimento) VALUES(?,?,?,?,?)";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getFone());
            stmt.setString(5, cliente.getDtnascimento());
            stmt.execute();
            stmt.close();
            message = "Cliente " + cliente.getNome() + " criado com sucesso";
        } catch (SQLException e) {
            message = "Cliente " + cliente.getNome() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }

    public void alterar(Cliente cliente) {
        try {
            String sql = "UPDATE tbclientes SET nome= ?, email= ?, fone= ?, dtnascimento= ? WHERE tbclientes.cpf = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getFone());
            stmt.setString(4, cliente.getDtnascimento());
            stmt.setString(5, cliente.getCpf());
            stmt.execute();
            stmt.close();
            System.out.println("Cliente " + cliente.getNome() + " alterado com sucesso");
        } catch (SQLException e) {
            System.out.println("Cliente " + cliente.getNome() + " não foi alterado com sucesso" + e.getMessage());
        }
    }

    public Cliente pesquisar(String pesquisa) {

        Cliente cliente = new Cliente();

        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT * FROM tbclientes where cpf = '" + pesquisa + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setFone(rs.getString("fone"));
                cliente.setEmail(rs.getString("email"));
                cliente.setDtnascimento(rs.getString("dtnascimento"));
                System.out.println(cliente.getNome());

            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {

        }
        return cliente;
    }

    public ResultSet consulta() {
        
        ArrayList <Cliente> listacliente = new ArrayList();
        String message = "";
        ResultSet rs = null;
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbclientes";
             rs = stmt.executeQuery(sql);
           // while (rs.next()) {
                //Cliente cliente = new Cliente();
                
                //cliente.setNome(rs.getString("nome"));
                //cliente.setCpf(rs.getString("cpf"));
                //cliente.setFone(rs.getString("fone"));
                //cliente.setEmail(rs.getString("email"));
                //cliente.setDtnascimento(rs.getString("dtnascimento"));
                //listacliente.add(cliente);
            
           // rs.close();
           // stmt.close();

        } catch (SQLException e) {

        } 
        return rs;
    }

    public void deletar(Cliente cliente) {
        String message = "";
        try {
            String sql = "DELETE FROM tbclientes WHERE cpf = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getCpf());
            stmt.execute();
            stmt.close();
            System.out.println("Cliente " + cliente.getNome() + " excluído com sucesso");
        } catch (SQLException e) {
            System.out.println("Cliente " + cliente.getNome() + "não foi excluído com sucesso" + e.getMessage());
        }
    }
}