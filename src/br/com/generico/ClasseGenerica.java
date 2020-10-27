/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.generico;

/**
 *
 * @author User
 */
public class ClasseGenerica <X,Y> {
    private X campo1;
    private Y campo2;

    public X getCampo1() {
        return campo1;
    }

    public void setCampo1(X campo1) {
        this.campo1 = campo1;
    }

    public Y getCampo2() {
        return campo2;
    }

    public void setCampo2(Y campo2) {
        this.campo2 = campo2;
    }
    
    
    
    public ClasseGenerica(X campo1, Y campo2){
        this.campo1 = campo1;
        this.campo2 = campo2;
    } 
}
