/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.boaspraticas;

/**
 *
 * @author User
 */
public class UsarCalcular {
    public static void main(String args[]){
        Calcular calcular = new Calcular();
        //System.out.println(calcular.somarValores(6, 7));
        calcular.setNum1(8);
        calcular.setNum2(10);
        System.out.println(calcular.somarValores());
    }
    
}
