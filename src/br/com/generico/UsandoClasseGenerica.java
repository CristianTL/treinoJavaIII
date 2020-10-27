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
public class UsandoClasseGenerica {
    public static void main(String[] args) {
//        ClasseGenerica classeGenerica = new ClasseGenerica("Thomaz", 20);
//        System.out.println(classeGenerica.getCampo1());
//        System.out.println(classeGenerica.getCampo2());
//        Para ser possível uma soma
          ClasseGenerica<Integer, Integer> classeGenerica = new ClasseGenerica<Integer, Integer>(6,8);
          System.out.println(classeGenerica.getCampo1() + classeGenerica.getCampo2());
    }
}
