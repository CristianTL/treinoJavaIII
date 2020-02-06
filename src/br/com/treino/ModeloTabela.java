/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.treino;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ModeloTabela extends AbstractTableModel {
    
    private int colunas, linhas;
    private ResultSet resultset; 
    private ResultSetMetaData rsMetaData;
    
    public ModeloTabela(ResultSet resultset) throws SQLException{
        rsMetaData = resultset.getMetaData();
        this.resultset = resultset;
        resultset.last(); //ultimo registro
        linhas = resultset.getRow(); // pega o numero da linha em que se encontra
        
        //acionar alterações da estrutura no jTable
        fireTableStructureChanged();
    }

    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return linhas;
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        colunas  = 0;
        try{
            colunas = rsMetaData.getColumnCount();
        } catch (SQLException erro){
            System.out.println("Erro ao ler qtde colunas" + erro);
        }
        return colunas;
    }
    
    // Povoando os dados
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            resultset.absolute(rowIndex + 1);
            return resultset.getObject(columnIndex + 1);
        } catch (SQLException erro){
            System.out.println("Erro: " + erro);
            return "";
        }
        
    }
    
}
