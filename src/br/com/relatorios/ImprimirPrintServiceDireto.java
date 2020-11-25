/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.relatorios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ImprimirPrintServiceDireto {
    public static void main(String[] args) throws PrintException {
        PrintService[] printService = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.AUTOSENSE, null);
        System.out.println("Quantas impressoras.: " + printService.length);
        
        PrintService impressoraPadrao = PrintServiceLookup.lookupDefaultPrintService();
        System.out.println("A impressora padrão é a " + impressoraPadrao.getName());
        
        DocFlavor docFlavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
        HashDocAttributeSet hashDocAttributeSet = new HashDocAttributeSet();
        try {
            FileInputStream fileInputStream = new FileInputStream("thomaz.txt");
            Doc doc = new SimpleDoc(fileInputStream, docFlavor, hashDocAttributeSet);
            PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
            
            PrintService printServico = ServiceUI.printDialog(null, 300, 200, printService, impressoraPadrao, docFlavor, printRequestAttributeSet);
                        
                DocPrintJob docPrintJob = impressoraPadrao.createPrintJob();
                //mandar imprimir documento
                docPrintJob.print(doc, printRequestAttributeSet);

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
}
