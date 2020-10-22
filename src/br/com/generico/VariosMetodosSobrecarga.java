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
public class VariosMetodosSobrecarga {
    
    public static void main(String[] args) {
        int[] arrayInt = {6,6,6,6,6};
        double[] arrayDouble = {8.5,8.5,8.5,8.5,8.5};
        char[] arrayChar = {'a','a','a','a','a'};
        
        imprimirArray(arrayInt);
        imprimirArray(arrayDouble);
        imprimirArray(arrayChar);
    }
    
    public static void imprimirArray(int[] inteiros){
        for (double dado:inteiros) {
            System.out.println(dado);
        }
    }
    
    public static void imprimirArray(double[] numeros){
        for (double dado:numeros) {
            System.out.println(dado);
        }
    }
    
    public static void imprimirArray(char[] caracter){
        for (char dado:caracter) {
            System.out.println(dado);
        }
    }
    
}
