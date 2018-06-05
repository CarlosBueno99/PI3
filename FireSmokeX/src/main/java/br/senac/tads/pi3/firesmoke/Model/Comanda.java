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
public class Comanda {
    private double valortotal;
    private String idcomanda;

    public String getIdcomanda() {
        return idcomanda;
    }

    public void setIdcomanda(String idcomanda) {
        this.idcomanda = idcomanda;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public boolean isStatuspagamento() {
        return statuspagamento;
    }

    public void setStatuspagamento(boolean statuspagamento) {
        this.statuspagamento = statuspagamento;
    }
    private boolean statuspagamento;
    
    
}
