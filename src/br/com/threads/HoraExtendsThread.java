/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threads;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author User
 */
public class HoraExtendsThread extends Thread {
    
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    
    public static void main(String[] args) {
        
        Thread thread = new HoraExtendsThread();
        thread.start();
    }
    
    public void run(){
        while(true){
            System.out.println(formatoHora.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                //Logger.getLogger(HoraExtendsThread.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Thread não foi finalizada: " + ex);
            }
        }

    }
    
}
