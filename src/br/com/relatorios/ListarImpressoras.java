/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.relatorios;

import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;

/**
 *
 * @author User
 */
public class ListarImpressoras {
    public static void main(String[] args) {
        PrintService[] printService = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.AUTOSENSE, null);
        System.out.println("Quantas impressoras.: " + printService.length);
        
        PrintService impressoraPadrao = PrintServiceLookup.lookupDefaultPrintService();
        System.out.println("A impressora padrão é a " + impressoraPadrao.getName());
        
    }
}
