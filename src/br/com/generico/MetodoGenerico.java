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
public class MetodoGenerico {
    
    public static void main(String args[]){
        Integer[] arrayInt = {6,6,6,6,6};
        Double[] arrayDouble = {8.5,8.5,8.5,8.5,8.5};
        Character[] arrayChar = {'a','a','a','a','a'};
        
        imprimirArray(arrayInt);
        imprimirArray(arrayDouble);
        imprimirArray(arrayChar);
        imprimirArray(arrayChar, "VideoTeste");
    }
    
    //modelo de metodo generico
    public static < E > void imprimirArray(E[] inteiros){
        for (E dado:inteiros) {
            System.out.println(dado);
        }
    }
    
    public static < E > void imprimirArray(E[] inteiros, String nome){
        for (E dado:inteiros) {
            System.out.println(dado + " " + nome);
        }
    }
    
}
