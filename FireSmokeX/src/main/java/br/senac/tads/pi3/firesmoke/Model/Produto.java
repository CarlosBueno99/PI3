/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.Model;

/**
 *
 * @author Guilherme Feitosa
 */
public class Produto {
    private String nome;
    private String tipo;
    private String marca;
    private String sku;
    private String precovenda;
    private String precocompra;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(String precovenda) {
        this.precovenda = precovenda;
    }

    public String getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(String precocompra) {
        this.precocompra = precocompra;
    }


    
}
