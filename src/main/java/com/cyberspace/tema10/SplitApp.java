/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema10;

/**
 *
 * @author ariel.villarreal
 * Tema 11 Split
 * el cual sirve para separa una cadena usando una expression regular como criterio para dividir la cadena
 * y tambien el metod acepta un segundo parametro para definir en cuantos elemntos se va dividir
 * 
 */
public class SplitApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //  String cadena = "Ariel;Villarreal;Cyberspace;Cyber";
      //En este caso se utiliza una expression regular espcial ya q el caracter | es una expression regular
        
        String cadena = "Ariel|Villarreal|Cyberspace|Cyber";
        //String[] extraccion = cadena.split(";", 2);
       
        String[] extraccion = cadena.split("\\|");
      for (String elem : extraccion) {
           System.out.println(elem);
       }
        
        
    }
    
}
