/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.boaspraticas;

/**
 *
 * @author User
 */
public class Calcular {
    
    private double num1;
    private double num2;
    
    public double somarValores(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 + this.num2;
    }
    
    public double somarValores(){
        return this.num1 + this.num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
}
