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
public class Thread1ExtendsThread extends Thread{
    
    public static void main(String[] args) {
        for(int i = 0; i <6; i++ )
        System.out.println("void main");
        
        Thread thread = new Thread1ExtendsThread();
        thread.start();
        
        for(int i = 0; i < 6; i++)
        System.out.println("void main");
        
        
    }
    
    public void run(){
        for(int i = 0; i < 6; i++)
        System.out.println("Thread Run");
        
    }
    
}
