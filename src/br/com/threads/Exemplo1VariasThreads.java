/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threads;

/**
 *
 * @author User
 */
public class Exemplo1VariasThreads {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 6; i++){
            System.out.println("void main");
        }
        
        ExecutaThread2 thread = new ExecutaThread2();
        ExecutaThread2 thread2 = new ExecutaThread2();
        ExecutaThread2 thread3 = new ExecutaThread2();
        thread.start();
        thread2.start();
        thread3.start();
        
        for (int i = 0; i < 6; i++){
            System.out.println("void main");
        }
        
    }
    
}

class ExecutaThread2 extends Thread {
    public void run(){
        System.out.println(getName());
        for (int i = 0; i < 6; i++){
            System.out.println("Thread Run da thread " + getName());
        }
    }
}
