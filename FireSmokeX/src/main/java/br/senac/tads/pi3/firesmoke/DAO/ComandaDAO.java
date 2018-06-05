/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.DAO;

import br.senac.tads.pi3.firesmoke.Model.Comanda;
import br.senac.tads.pi3.firesmoke.Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Feitosa
 */
public class ComandaDAO {

    private Connection conexao;

    public String inserir(Comanda comanda) {
        String message = "";
        try {
            String sql = "INSERT INTO tbcomanda(valortotal, statuspagamento) VALUES(?,?)";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setDouble(1, comanda.getValortotal());
            stmt.setBoolean(2, comanda.isStatuspagamento());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            message = "Comanda " + comanda.getIdcomanda() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }

    public void pesquisaid(Comanda comanda) {
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "Select idcomanda from tbcomanda order by idcomanda desc limit 1";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                comanda.setIdcomanda(rs.getString("idcomanda"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {

        }
    }

    public void alterar(Comanda comanda) {
        try {
            String sql = "UPDATE tbcomanda SET valortotal= ?, statuspagamento= ? WHERE tbcomanda.idcomanda = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setDouble(1, comanda.getValortotal());
            stmt.setBoolean(2, comanda.isStatuspagamento());
            stmt.setString(3, comanda.getIdcomanda());
            stmt.execute();
            stmt.close();
            System.out.println("Comanda " + comanda.getIdcomanda() + " alterado com sucesso");
        } catch (SQLException e) {
            System.out.println("Comanda " + comanda.getIdcomanda() + " não foi alterado com sucesso" + e.getMessage());
        }
    }

    public Comanda pesquisar(int pesquisa) {

        Comanda comanda = new Comanda();

        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT * FROM tbcomanda where idcomanda = '" + pesquisa + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                comanda.setIdcomanda(rs.getString("idcomanda"));
                comanda.setValortotal(rs.getDouble("valortotal"));
                comanda.setStatuspagamento(rs.getBoolean("statuspagamento"));
                System.out.println(comanda.getIdcomanda());

            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {

        }
        return comanda;
    }

    public void consulta(String pesquisa) {
        Comanda comanda = new Comanda();
        String message = "";
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbcomanda";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                comanda.setIdcomanda(rs.getString("idcomanda"));
                comanda.setValortotal(rs.getDouble("valortotal"));
                comanda.setStatuspagamento(rs.getBoolean("statuspagamento"));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {

        }
    }

    public void deletar(Comanda comanda) {
        String message = "";
        try {
            String sql = "DELETE FROM tbcomanda WHERE idcomanda = ?";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, comanda.getIdcomanda());
            stmt.execute();
            stmt.close();
            System.out.println("Comanda " + comanda.getIdcomanda() + " excluído com sucesso");
        } catch (SQLException e) {
            System.out.println("Comanda " + comanda.getIdcomanda() + "não foi excluído com sucesso" + e.getMessage());
        }
    }
}
