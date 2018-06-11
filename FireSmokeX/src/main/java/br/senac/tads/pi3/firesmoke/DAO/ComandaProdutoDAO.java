/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.DAO;

import br.senac.tads.pi3.firesmoke.Model.Comanda;
import br.senac.tads.pi3.firesmoke.Model.ComandaProduto;
import br.senac.tads.pi3.firesmoke.Model.Produto;
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
public class ComandaProdutoDAO {

    private Connection conexao;

    public String inserir(Comanda comanda, Produto produto, int quantidade) {
        String message = "";
        ComandaProduto comandaproduto = new ComandaProduto();
        try {
            String sql = "INSERT INTO tbcomandaproduto(idcomanda, skuproduto, quantidade) VALUES(?,?,?)";
            conexao = ModuloConexao.conector();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, comanda.getIdcomanda());
            stmt.setString(2, produto.getSku());
            stmt.setInt(3, quantidade);
            stmt.execute();
            stmt.close();
            message = "Cliente " + comanda.getIdcomanda() + " criado com sucesso";
        } catch (SQLException e) {
            message = "Cliente " + comanda.getIdcomanda() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }

    public ResultSet pesquisacomandaproduto(int idcomanda) {

        ArrayList<ComandaProduto> lista = new ArrayList<ComandaProduto>();
        ResultSet rs = null;
        try {
            conexao = ModuloConexao.conector();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT tbcomandaproduto.idcomanda, tbcomandaproduto.quantidade\n"
                    + ",tbprodutos.id\n"
                    + " ,tbprodutos.nome\n"
                    + "	,tbprodutos.tipo\n"
                    + " ,tbprodutos.marca\n"
                    + " ,tbprodutos.precovenda\n"
                    + " FROM tbcomandaproduto\n"
                    + " INNER JOIN tbprodutos ON tbprodutos.sku = tbcomandaproduto.skuproduto\n"
                    + " WHERE tbcomandaproduto.idcomanda = " + idcomanda + ";";
            rs = stmt.executeQuery(sql);
            //while (rs.next()) {
            //ComandaProduto comandaproduto = new ComandaProduto();

            //comandaproduto.setIdcomandaCom(rs.getInt("idcomanda"));
            //comandaproduto.setValortotalCom(rs.getDouble("valortotal"));
            //comandaproduto.setStatuspagamentoCom(rs.getBoolean("statuspagamento"));
            //comandaproduto.setNomeProd(rs.getString("nome"));
            //comandaproduto.setMarcaProd(rs.getString("marca"));
            //comandaproduto.setTipoProd(rs.getString("tipo"));
            //comandaproduto.setPrecovendaProd(rs.getString("precovenda"));
            //lista.add(comandaproduto);
            //}
            //rs.close();
            // stmt.close();
        } catch (SQLException e) {

        }
        return rs;
    }
}
