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
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ItextExemploTabela {
    
    public static void main(String[] args) {
        
        Document documento = new Document(PageSize.A4,30,20,20,30);
        try {
            OutputStream outputStream = new FileOutputStream("Tabela.pdf");
            PdfWriter.getInstance(documento, outputStream);
            documento.open(); //Abre o documento  
            //adicionando um texto para o PDF                   
            //Paragraph paragrafo = new Paragraph("Teste de um arquivo com Tabelas");
            //documento.add(paragrafo);
            //tabela
            PdfPTable tabela = new PdfPTable(3);
            PdfPCell cabecalho = new PdfPCell(new Paragraph("Lista das pessoas em geral"));
            cabecalho.setHorizontalAlignment(Element.ALIGN_CENTER);
            //cabecalho.setBackgroundColor(BaseColor.RED);
            cabecalho.setBackgroundColor(new BaseColor(100,150,200));
            cabecalho.setColspan(3);
            tabela.addCell(cabecalho);
            tabela.addCell("Thomaz");
            tabela.addCell("Cristian");
            tabela.addCell("Lourenco");
            tabela.addCell("Yelena");
            tabela.addCell("Yasmin");
            tabela.addCell("Ruas");
            documento.add(tabela);

            documento.close();
            JOptionPane.showMessageDialog(null, "Arquivo gerado.");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (DocumentException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ItextExemploTabela.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
