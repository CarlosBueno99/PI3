/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.DAO;

import br.senac.tads.pi3.firesmoke.Model.Comanda;
import br.senac.tads.pi3.firesmoke.Model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Feitosa
 */
public class VendaDAO {
     private Connection conexao;

    public String inserir(int idcomanda, String nomecliente, double valortotal) {
        String message = "";
        Venda venda = new Venda();
        try {
            String sql = "INSERT INTO tbvendas(nomeprod, idcomanda, cliente, valorvenda, filial) VALUES(?,?,?,?,?)";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, venda.getNomeproduto());
            stmt.setInt(2, venda.getIdcomanda());
            stmt.setString(3, venda.getNomecliente());
            stmt.setDouble(4, venda.getValorvenda());
            stmt.setString(5, venda.getFilial());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            message = "Venda " + venda.getIdcomanda() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }
     public ResultSet consulta() {
        Venda venda = new Venda();
        String message = "";
        ResultSet rs = null;
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbvendas";
            rs = stmt.executeQuery(sql);
           // while (rs.next()) {
             //   venda.setIdcomanda(rs.getInt("idcomanda"));
               // venda.setValortotal(rs.getDouble("valortotal"));
               // venda.setStatuspagamento(rs.getBoolean("statuspagamento"));
            //}
            //rs.close();
            //stmt.close();

        } catch (SQLException e) {

        }
        return rs;
    }
}
