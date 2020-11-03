/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.boaspraticas.testesoftware;

/**
 *
 * @author User
 */
public class IdadeFilhos {
    
    private int idadeFilho;
    private int idadeFilha;
    private int somaIdades;

    public int getIdadeFilho() {
        return idadeFilho;
    }

    public void setIdadeFilho(int idadeFilho) {
        this.idadeFilho = idadeFilho;
    }

    public int getIdadeFilha() {
        return idadeFilha;
    }

    public void setIdadeFilha(int idadeFilha) {
        this.idadeFilha = idadeFilha;
    }
    
    public int getSomaIdades(){
        somaIdades =  idadeFilha + idadeFilho;
        return somaIdades;
    }
    
}
