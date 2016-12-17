/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel.villarreal
 */
public class AppGenerico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //lista sin el usar el operador diamante por lo cual es una lista q acepta cuanlquier typo
        //List lista = new ArrayList();
        
        //En la versiones del 1.7 en adelante se puede usar el operador diamante y protejer la lista definiendo un typo
        /*
        List<String> lista = new ArrayList<String>();
        lista.add("cyberspace");
        //lista.add(2);
        //System.out.println(lista.get(0));
        //la siguiente linea es para hacer un casteo en caso q la lista no sea protegida con un typo especifico
        //int texto = (Integer)lista.get(1);
        String texto = lista.get(0);
        System.out.println(texto);
        */
        //ejemplo 1
        //ClaseGen2<String, Integer, String, Double> cl = new ClaseGen2<>("Cyberspace", 32, " Ariel", 32.3);
        //cl.mostrarTipo();
        //ejemplo 2 cargando el objeto dentro de una lista
        
        List<ClaseGen2<String, Integer, String, String>> lista = new ArrayList<>();
        lista.add(new ClaseGen2<>("Ariel", 32, "Villarreal", "Calderon"));
        for (ClaseGen2<String, Integer, String, String> cl : lista) {
        cl.mostrarTipo();    
        }
        
        
    }
    
}
