/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.primitivosobjetoswrapper;

/**
 *
 * @author User
 */
public class Exemplo1 {
    
    public static void main(String[] args) {
        //Tipos primitivos
        /* não é objeto
        boolean    Boolean
        byte       Byte
        short      Short
        char       Character
        int        Integer
        long       Long
        float      Float
        double     Double
        */
        //tipo primitivo não aceita null
        int idade = 18; //tipo primitivo
        System.out.println(idade);
        //classe(wrapper) aceita null
        Integer idade1 = 18; //classe(wrapper)
        System.out.println(idade1);
        
        double valor = 76.5;
        System.out.println(valor);
        Double valor1 = 76.5;
        System.out.println(valor1);
    }
    
}
