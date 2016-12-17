/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ariel.villarreal
 * Tema 12 expressiones regulares 'regex' esta ves se analiza la clase matcher y sus metodos
 * 
 * 
 */
public class MatcherApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String texto = "Suscribete al canal de Cyberspace";
     Pattern p = Pattern.compile("cyberspace", Pattern.CASE_INSENSITIVE);
     Matcher m = p.matcher(texto);
     
       //Evalua toda la cadena 
        System.out.println("Matches " + m.matches());
        //Evalua y busca si la expession regular cumple con lo que esta al inicio del texto oh de la cadena
        System.out.println("LookingAt " + m.lookingAt());
        int contador = 0;
        
        //el metodo find evalua toda la cadena de texto
        while (m.find()) {            
            contador ++;
            System.out.println("Coincidencia N° " + contador + "Start " + m.start() + " end " + m.end());
        }
        
    }
    
}
