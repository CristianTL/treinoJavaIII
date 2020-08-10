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
    private int dia, mes, ano, hora, minutos, segundos;
    
    public String dataAtual(){
        //Date dataAgora = new Date();
        //calendario.setTime(dataAgora);
        
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        //mes = calendario.get(Calendar.MONTH) + 1;
        ano = calendario.get(Calendar.YEAR);
        hora = calendario.get(Calendar.HOUR);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        
        return "Santos, " + diaSemana() +", " + dia + " de " + mesAno() + " de " + ano + " - " +
                hora+":"+minutos+":"+segundos;
    }
    
    public String diaSemana(){
        String dia_semana = "";
        switch(calendario.get(Calendar.DAY_OF_WEEK)){
            case 0: 
                dia_semana = "Domingo";
                break;
            case 1:
                dia_semana = "Segunda";
                break;
            case 2:
                dia_semana = "Terça";
                break;
            case 3:    
                dia_semana = "Quarta";
                break;
            case 4:
                dia_semana = "Quinta";
                break;
            case 5:
                dia_semana = "Sexta";
                break;
            case 6:
                dia_semana = "Sábado";
                break;
        }
        return dia_semana;
    }
    
    public String mesAno(){
        String mes = "";
        switch(calendario.get(Calendar.MONTH)){
            case 0: 
                mes = "Janeiro";
                break;
            case 1:
                mes = "Fevereiro";
                break;
            case 2:
                mes = "Março";
                break;
            case 3:    
                mes = "Abril";
                break;
            case 4:
                mes = "Maio";
                break;
            case 5:
                mes = "Junho";
                break;
            case 6:
                mes = "Julho";
                break;
            case 7:
                mes = "Agosto";
                break;
            case 8:
                mes = "Setembro";
                break;
            case 9:
                mes = "Outubro";
                break;
            case 10:
                mes = "Novembro";
                break;
            case 11:
                mes = "Dezembro";
                break;    
        }
        return mes;
    }
    
    public static void main(String[] args) {
        
    }
    
}
