/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.boaspraticas.testesoftware;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author User
 */
public class TestandoIdadeFilhos {
    
    public static void main(String[] args) {
        testarSomaIdades();
    }
    
    @Test
    public static void testarSomaIdades(){
        IdadeFilhos idadeFilhos = new IdadeFilhos();
        idadeFilhos.setIdadeFilha(15);
        idadeFilhos.setIdadeFilho(10);
        System.out.println(idadeFilhos.getSomaIdades());
        assertEquals(25, idadeFilhos.getSomaIdades());
    }
}