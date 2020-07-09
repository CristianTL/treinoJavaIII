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
public class DepositoRetirada {
    
    public static void main(String[] args) {
        Banco conta = new Banco();
        Empresa empresa = new Empresa(conta);
        Funcionario funcionario = new Funcionario(conta);
        empresa.start();
        funcionario.start();
        
        
    }
    
}
