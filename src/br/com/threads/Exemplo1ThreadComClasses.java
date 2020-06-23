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
public class Exemplo1ThreadComClasses {
    
    public static void main(String[] args) {
        for(int i = 0; i <60; i++ )
            System.out.println("void main");
        
        ExecutaThread thread = new ExecutaThread();
        thread.start();
        
        for(int i = 0; i <60; i++ )
            System.out.println("void main2");
    }
    
}

class ExecutaThread extends Thread {
    
    public void run(){
        for(int i = 0; i < 60; i++)
            System.out.println("Thread Run");
    }
    
}
