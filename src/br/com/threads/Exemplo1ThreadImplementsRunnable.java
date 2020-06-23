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
public class Exemplo1ThreadImplementsRunnable implements Runnable{
    
    public static void main(String[] args) {
        for(int i = 0; i <60; i++ )
            System.out.println("void main");
        
        Runnable runnable = new Exemplo1ThreadImplementsRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        
        for(int i = 0; i <60; i++ )
            System.out.println("void main2");
        
    }
    
    @Override
    public void run() {
        for(int i = 0; i < 60; i++)
            System.out.println("Thread Run");
    }
}
