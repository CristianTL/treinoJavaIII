/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cadastromodelotabela;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class ModeloTabelaPessoa extends AbstractTableModel{
    
    private int numLinhas;
    private ArrayList<String[]> resultSetPessoas;
    private ResultSetMetaData rsMetaData;
    private static final String[] nomesColunas = {
        "Codigo", "Nome da Pessoa", "Telefone", "Email"
    };
    
    public void setResult(ResultSet resultset) throws SQLException{
        resultSetPessoas = new ArrayList<String[]>();
        while(resultset.next()){
            String[] linha = {
                resultset.getString("codigo"), 
                resultset.getString("nome"), 
                resultset.getString("fone"), 
                resultset.getString("email")
            };
            resultSetPessoas.add(linha);
        }
        fireTableStructureChanged();
    }
    
    public void deletarLinha(int linha){
        resultSetPessoas.remove(linha);
        fireTableRowsDeleted(linha, linha);
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return resultSetPessoas.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return nomesColunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] linha = resultSetPessoas.get(rowIndex);
        return linha[columnIndex];
    }
    
}
