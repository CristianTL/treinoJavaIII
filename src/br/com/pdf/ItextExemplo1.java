/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pdf;

/**
 *
 * @author User
 */
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;

public class ItextExemplo1 {
    
    public static void main(String[] args) {
        
        Document documento = new Document();
        try {
            OutputStream outputStream = new FileOutputStream("Teste.pdf");
            PdfWriter.getInstance(documento, outputStream);
            documento.open(); //Abre o documento  
            //adicionando um texto para o PDF
            Paragraph cabecalho = new Paragraph("Lista de clientes");
            cabecalho.setAlignment(Element.ALIGN_CENTER);
            documento.add(cabecalho);
            Paragraph paragrafo = new Paragraph("Teste de um arquivo criando em PDF");
            documento.add(paragrafo);
            Paragraph paragrafo2 = new Paragraph("Segundo parágrafo do PDF.....");
            documento.add(paragrafo2);
            documento.close();
            JOptionPane.showMessageDialog(null, "Arquivo gerado.");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
}
