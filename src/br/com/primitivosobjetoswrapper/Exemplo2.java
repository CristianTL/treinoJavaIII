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
public class Exemplo2 {
    public static void main(String[] args) {
        int[] arrayInteiros = {6,8,3,5,2};
        imprimirArrayInt(arrayInteiros);
        
        int[] arrayInteiros2 = {6,8,3,5,2};
        imprimirArrayInt(arrayInteiros2);
    }
    
    public static void imprimirArrayInt(int[] inteiros){
        for(int i = 0; i<inteiros.length; i++){
            System.out.println(inteiros[i]);
        }
        //ou
        //for(int dados:inteiros)
            //System.out.println(dados);
        
    }
    
    public static void imprimirArrayInteger(Integer[] inteiros){
//        for(int i = 0; i<inteiros.length; i++){
//            System.out.println(inteiros[i]);
//        }
          for(Integer dado:inteiros)
            System.out.println(dado);
    }
    
}
