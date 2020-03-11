/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.enviandoemail;

/**
 *
 * @author User
 */
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
public class EnviarEmail {
    
    public static void main(String[] args) throws EmailException {
        System.out.println("Iniciando envio de e-mails");
        SimpleEmail emailSimples = new SimpleEmail();
        System.out.println("Executou SimpleEmail");
        emailSimples.setHostName("mail.mmsantos.com");
        System.out.println("Executou setHostName");
        emailSimples.setSmtpPort(465);
        System.out.println("Executou setSmtpPort");
        emailSimples.setFrom("mmcontrol@dominio.com", "E-mail do Java");
        System.out.println("Executou setFrom");
        emailSimples.addTo("thomazcl@dominio.com", "Thomaz Cristian");
        System.out.println("Executou addTo");
        emailSimples.setSubject("Teste de envio pelo Java");
        System.out.println("Executou setSubject");
        emailSimples.setMsg("Parabéns, você conseguiu enviar o terceiro e-mail pelo Java");
        System.out.println("Executou setMsg");
        emailSimples.setSSL(true);
        System.out.println("Executou setSSL");
        emailSimples.setAuthentication("loginemail", "senhadoemail");
        System.out.println("Executou setAuthentication");
        emailSimples.send();
        System.out.println("E-mail enviado com sucesso");
    }
    
}
