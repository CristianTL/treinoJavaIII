/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threads.sincronismo;

/**
 *
 * @author User
 */
public class Funcionario extends Thread {
    
    private Banco conta;
    
    public Funcionario(Banco conta){
        this.conta = conta;
    }
    
    public void run(){
        //System.out.println("Funcionário Iniciou");
        double valorRetirada;
        for(int i = 1; i < 6; ++i){
            valorRetirada = conta.retirarValor();
            System.out.println("Funcionário fez a " + i + " retirada");
        }
        //System.out.println("Funcionário Fim");
    }
    
}
