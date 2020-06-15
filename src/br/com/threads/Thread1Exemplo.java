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
public class Thread1Exemplo {
    
    public static void main(String[] args) {
        for(int i = 0; i <6; i++ )
        System.out.println("void main");
        
        Thread thread = new Thread(new Runnable(){
            public void run() {
                for(int i = 0; i < 6; i++)
                    System.out.println("Thread Run");
            }
        });
        thread.start();
        
        for(int i = 0; i <6; i++ )
        System.out.println("void main");
        
        
    }
    
}
