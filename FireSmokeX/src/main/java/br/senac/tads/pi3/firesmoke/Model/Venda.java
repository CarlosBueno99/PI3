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
public class Venda {

    private String nomecliente;
    private int idcomanda;
    private double valorvenda;
    private String nomeproduto;
    private String filial;

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public int getIdcomanda() {
        return idcomanda;
    }

    public void setIdcomanda(int idcomanda) {
        this.idcomanda = idcomanda;
    }

    public double getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(double valorvenda) {
        this.valorvenda = valorvenda;
    }

    public String getNomeproduto() {
        return nomeproduto;
    }

    public void setNomeproduto(String nomeproduto) {
        this.nomeproduto = nomeproduto;
    }
}
