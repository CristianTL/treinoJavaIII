/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.datas;

/**
 *
 * @author User
 */
import java.util.Calendar;
public class DataCalendar {
    
    private static Calendar calendario = Calendar.getInstance();
    private int dia, mes, ano;
    
    public String dataAtual(){
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mes = calendario.get(Calendar.MONTH) + 1;
        ano = calendario.get(Calendar.YEAR);
        
        return "Santos, " + dia + " de " + mes + " de " + ano;
    }
    
    public static void main(String[] args) {
        
    }
    
}
