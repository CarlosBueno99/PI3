/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.DAO;

import br.senac.tads.pi3.firesmoke.Model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Feitosa
 */
public class FuncionarioDAO {

   private Connection conexao;

    public String inserir(Funcionario funcionario) {
        String message = "";
        try {
            String sql = "INSERT INTO tbfuncionarios (nome, cpf, cargo, endereco, dtnascimento) VALUES(?,?,?,?,?)";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getCargo());
            stmt.setString(4, funcionario.getEndereco());
            stmt.setString(5, funcionario.getDtnascimento());
            stmt.execute();
            stmt.close();
            message = "Funcionario " + funcionario.getNome() + " criado com sucesso";
        } catch (SQLException e) {
            message = "Funcionario " + funcionario.getNome() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }

    public void alterar(Funcionario funcionario) {
        try {
            String sql = "UPDATE tbfuncionarios SET nome= ?, cargo= ?, endereco= ?, dtnascimento= ? WHERE tbfuncionarios.cpf = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getEndereco());
            stmt.setString(4, funcionario.getDtnascimento());
            stmt.setString(5, funcionario.getCpf());
            stmt.execute();
            stmt.close();
            System.out.println("Funcionario " + funcionario.getNome() + " alterado com sucesso");
        } catch (SQLException e) {
            System.out.println("Funcionario " + funcionario.getNome() + " não foi alterado com sucesso" + e.getMessage());
        }
    }

    public Funcionario pesquisar(String pesquisa) {

        Funcionario funcionario = new Funcionario();

        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT * FROM tbfuncionarios where cpf = '" + pesquisa + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                funcionario.setNome(rs.getString("nomeFunc"));
                funcionario.setCpf(rs.getString("cpfFunc"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setDtnascimento(rs.getString("dataFunc"));
                System.out.println(funcionario.getNome());

            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {

        }
        return funcionario;
    }

    public void consulta(String pesquisa) {
        Funcionario funcionario = new Funcionario();
        String message = "";
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbfuncionarios";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setEndereco(rs.getString("endereco"));
                funcionario.setDtnascimento(rs.getString("dtnascimento"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {

        }
    }

    public void deletar(Funcionario funcionario) {
        String message = "";
        try {
            String sql = "DELETE FROM tbfuncionarios WHERE cpf = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getCpf());
            stmt.execute();
            stmt.close();
            System.out.println("Funcionario " + funcionario.getNome() + " excluído com sucesso");
        } catch (SQLException e) {
            System.out.println("Cliente " + funcionario.getNome() + "não foi excluído com sucesso" + e.getMessage());
        }
    }
}