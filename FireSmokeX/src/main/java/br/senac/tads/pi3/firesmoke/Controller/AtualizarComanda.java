/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads.pi3.firesmoke.Controller;

import br.senac.tads.pi3.firesmoke.Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Guilherme Feitosa
 */
public class AtualizarComanda {
     private static java.util.List<Produto> listaCarrinho = new ArrayList<Produto>();

    
    public void inserirProduto(Produto produto) {
        listaCarrinho.add(produto);

    }

    public void RemoverProduto(int indice) {
        listaCarrinho.remove(indice);

    }

    public static Produto atualizarListaCarrinho() {
        if (!listaCarrinho.isEmpty()) {
            for (int i = 0; i < listaCarrinho.size(); i++) {
                if (listaCarrinho.get(i) != null) {
                    return listaCarrinho.get(i);

                }
            }
        }
        return null;
    }
    
     public static Produto pesquisarProduto(int indice) {
        if (!listaCarrinho.isEmpty()) {
            for (int i = 0; i < listaCarrinho.size(); i++) {
                if (listaCarrinho.get(indice) != null) {
                    return listaCarrinho.get(indice);

                }
            }
        }
        return null;
    }

    public int TamanhoListaCarrinho() {
        return listaCarrinho.size();
    }

}


