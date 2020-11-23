/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.criptografia;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/**
 *
 * @author User
 */
public class CriptografiaDescriptografia {
    
    public static void main(String args[]){
        
        String senha = "Thomaz";
        System.out.println("Senha Original.: " + senha);
        try {
            //Algorítmos de criptografias simétricos:  AES, RC2, RC4, RC5, IDEA, Blowfish...
            //Algorítmos de criptografias assimétricos: RSA
            //HASH: MD5 ...
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecretKey secretKey = keyGenerator.generateKey();
            Cipher cipher;
            cipher = Cipher.getInstance("AES");
            
            //Criptografando
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);            
            byte[] senhaCriptografia = cipher.doFinal(senha.getBytes());
            System.out.println("Senha Criptografada.: " + senhaCriptografia);
            
            //Descriptografando
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] senhaDescriptografia = cipher.doFinal(senhaCriptografia);
            System.out.println("Senha Descriptografada.: " + new String(senhaDescriptografia));

            
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CriptografiaDescriptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
                Logger.getLogger(CriptografiaDescriptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
                Logger.getLogger(CriptografiaDescriptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(CriptografiaDescriptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(CriptografiaDescriptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
}
