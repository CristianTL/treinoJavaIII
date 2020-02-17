/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cadastropreparestatement;

import br.com.treino.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Conexao {
    
    String driver = "org.gjt.mm.mysql.Driver";;
    String url = "jdbc:mysql://localhost/estoque";
    String usuario = "root";
    String senha = "";        
    
    public Connection connection;
    public Statement statement;
    public ResultSet resultset; 
    
    //Conectando o banco
    public boolean conecta()
    {
        boolean result = true;
        try{
            Class.forName(driver);
            connection = DriverManager.getConnection(url, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectou com ");            
            
        } catch (ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver não localizado" + Driver);
            result = false;
        } catch (SQLException Fonte) {
            JOptionPane.showMessageDialog(null, "Deu erro na conexão" + " com a fonte de dados " + Fonte);
            result = false;
        }
        
        return result;
    }
    
    //Desconectando banco
    public void desconecta()
    {
        boolean result = true;
        try{
            connection.close();
            JOptionPane.showMessageDialog(null, "banco fechado");
        } catch (SQLException erroSQL) {
            // erroSQL ou erroSQL.getMessage()
            JOptionPane.showMessageDialog(null, "Não foi possível fechar o banco de dados " + erroSQL.getMessage());
            result = false;            
        }
    }
    
    public void executeSQL(String sql){
        
        try{
            //Com os parâmetros permitirá navegar entre os registros
            statement = connection.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, 
                    ResultSet.CONCUR_READ_ONLY
            );
            resultset = statement.executeQuery(sql);
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null,"Não foi possível executar o comando SQL" + sqlex.getMessage() + "o SQL passado foi " + sql);
        }
        
    }
    
    
}
