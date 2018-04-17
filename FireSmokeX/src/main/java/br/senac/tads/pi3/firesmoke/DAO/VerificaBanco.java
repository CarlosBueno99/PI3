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

/**
 *
 * @author Guilherme Feitosa
 */
public class VerificaBanco {

    private Connection conexao;

    public boolean verificaCpf(String pesquisa) {
        String message = "";
        Cliente cliente = new Cliente();
        boolean result = false;
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT " + pesquisa + "FROM tbclientes.cpf";
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                result = true;
            }
            rs.close();
            stmt.close();
            message = "Cliente " + cliente.getNome() + " encontrado com sucesso.";
        } catch (SQLException e) {

        }
        return result;
    }

}
