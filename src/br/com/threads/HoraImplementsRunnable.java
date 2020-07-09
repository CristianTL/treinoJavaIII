/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threads;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class HoraImplementsRunnable implements Runnable {
    
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    
    public static void main(String[] args) {
        Runnable runnable = new HoraImplementsRunnable();
        Thread thread = new Thread(runnable);
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
