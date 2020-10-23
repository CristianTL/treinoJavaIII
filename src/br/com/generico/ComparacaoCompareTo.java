/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.generico;

/**
 *
 * @author User
 */
public class ComparacaoCompareTo {
    
    public static void main(String[] args) {
        Integer num1 = 8, num2 = 10;
        System.out.println(num1.compareTo(num2));
        //saida: -1, num1 é menor que num2 
        System.out.println(num2.compareTo(num1));
        //saida: 1, num2 é maior que num1
        
        /* quando for igual, a saída será 0*/
        
        /* Outro cenario */
        String nome1 = "Thomaz", nome2 = "Thomaz1";
        // quando for igual, a saída será 0 também, mas diferente serão outros numeros
        System.out.println(nome1.compareTo(nome2));
        System.out.println(nome1.equals(nome2));
    }
    
}
