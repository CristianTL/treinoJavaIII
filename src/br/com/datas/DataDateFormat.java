/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.datas;

import java.util.Date;
import java.text.DateFormat;

/**
 *
 * @author User
 */
public class DataDateFormat {
    
    public static void main(String[] args) {
        Date dataAtual = new Date();
        DateFormat df1,df2,df3,df4,df5;
        String data1, data2, data3, data4, data5;
        df1 = DateFormat.getDateInstance();
        data1 = df1.format(dataAtual);
        
        df2 = DateFormat.getDateInstance(DateFormat.SHORT);
        data2 = df2.format(dataAtual);
        
        df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        data3 = df3.format(dataAtual);
        
        df4 = DateFormat.getDateInstance(DateFormat.LONG);
        data4 = df4.format(dataAtual);
        
        df5 = DateFormat.getDateInstance(DateFormat.FULL);
        data5 = df5.format(dataAtual);
        
        
        String datas = "";
        datas += data1+ "\n";
        datas += data2+ "\n";
        datas += data3+ "\n";
        datas += data4+ "\n";
        datas += data5+ "\n";
        System.out.println(datas);
    }
    
}
