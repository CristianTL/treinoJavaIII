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
public class Empresa extends Thread {
    
    private Banco conta;
    
    public Empresa(Banco conta){
        this.conta = conta;
    }
    
    public void run(){
        //System.out.println("Empresa Iniciou");
        double valorDeposito = 1000;
        for(int i = 1; i < 6; ++i){
            conta.depositoValor(valorDeposito);
            System.out.println("Empresa fez o " + i + " deposito");
        }
        //System.out.println("Empresa Fim");
    }
    
}
