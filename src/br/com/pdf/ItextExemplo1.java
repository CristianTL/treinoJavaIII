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
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ItextExemplo1 {
    
    public static void main(String[] args) {
        
        Document documento = new Document();
        try {
            OutputStream outputStream = new FileOutputStream("Teste.pdf");
            PdfWriter.getInstance(documento, outputStream);
            documento.open(); //Abre o documento  
            //adicionando um texto para o PDF
            Font font = new Font(Font.FontFamily.TIMES_ROMAN,36,0, BaseColor.RED);
            Paragraph cabecalho = new Paragraph("Lista de clientes", font);
            cabecalho.setAlignment(Element.ALIGN_CENTER);            
            documento.add(cabecalho);
            
            Image image = Image.getInstance("brand_logo.jpg");
            documento.add(image);
                    
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
        } catch (IOException ex) {
            Logger.getLogger(ItextExemplo1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
