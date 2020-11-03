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
public class TesteSomaIdades {
    public static void main(String[] args) {
        IdadeFilhos somaIdades = new IdadeFilhos();
        somaIdades.setIdadeFilha(15);
        somaIdades.setIdadeFilho(10);
        System.out.println("Soma das Idades " + somaIdades.getSomaIdades());
    }
}
