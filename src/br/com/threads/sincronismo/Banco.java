/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threads.sincronismo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Banco {
    
    private double valor;
    private boolean flag = false;
    
    public synchronized void depositoValor(double valor){
        while(flag == true) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        flag = true;
        this.valor = valor;
        notifyAll();
    }
    
    public synchronized double retirarValor(){
        while(flag == false) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        flag = false;
        notifyAll();
        return this.valor;
    }
    
}
