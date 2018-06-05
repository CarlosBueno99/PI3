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
public class ComandaProduto {

    private String nomeProd;
    private String tipoProd;
    private String marcaProd;
    private String skuProd;
    private String precovendaProd;
    private double valortotalCom;
    private String idcomandaCom;
    private boolean statuspagamentoCom;

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }

    public String getSkuProd() {
        return skuProd;
    }

    public void setSkuProd(String skuProd) {
        this.skuProd = skuProd;
    }

    public String getPrecovendaProd() {
        return precovendaProd;
    }

    public void setPrecovendaProd(String precovendaProd) {
        this.precovendaProd = precovendaProd;
    }

    public double getValortotalCom() {
        return valortotalCom;
    }

    public void setValortotalCom(double valortotalCom) {
        this.valortotalCom = valortotalCom;
    }

    public String getIdcomandaCom() {
        return idcomandaCom;
    }

    public void setIdcomandaCom(String idcomandaCom) {
        this.idcomandaCom = idcomandaCom;
    }

    public boolean isStatuspagamentoCom() {
        return statuspagamentoCom;
    }

    public void setStatuspagamentoCom(boolean statuspagamentoCom) {
        this.statuspagamentoCom = statuspagamentoCom;
    }

   

}
