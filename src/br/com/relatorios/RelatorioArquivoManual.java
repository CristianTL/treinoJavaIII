/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.relatorios;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class RelatorioArquivoManual {
    
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("arquivo.txt");
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println("Teste Impressão PrintStream");
            printStream.println("Thomaz");
            JOptionPane.showMessageDialog(null, "Arquivo gerado.");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RelatorioArquivoManual.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
