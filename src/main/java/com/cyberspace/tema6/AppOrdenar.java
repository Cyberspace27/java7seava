/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ariel.villarreal
 * Tema 6 y 7 Appicollections
 * en este capitulo se ve distintas formas oh metodos ya definido en el apicollections para ordenar listas
 * 
 */
public class AppOrdenar {

    
    public static void main(String[] args) {
      /* Ejemplo con un integer
      List<Integer> lista = new ArrayList<>();
     
      lista.add(25);
      lista.add(1000);
      lista.add(1);
      //Ordena la lista de mayor a menor
      //Collections.sort(lista);
      
      //Ordena la lista en el orden contrario al que se agregaron los elemento de la lista
      Collections.reverse(lista);
      
      System.out.println(lista);
      */
        //Ejemplo con String y un objeto particular en este caso Persona este es parte del tema 7
        List<Persona> lista = new ArrayList<>();
     
      lista.add(new Persona(1,"Ariel", 15));
      lista.add(new Persona(1,"Villarreal", 17));
      lista.add(new Persona(1,"Cyberspace", 27));
      lista.add(new Persona(1,"AAAAA", 1));
      //Ordena la lista de mayor a menor
      //Collections.sort(lista, new NombreComparator());
      
        
        
        
        //Segunda Opcion para evitar crear una clase nombreComparator
        Collections.sort(lista, new Comparator<Persona>(){

            @Override
            public int compare(Persona per1, Persona per2) {
                int rpta = 0;
                if (per1.getEdad() > per2.getEdad()) {
                    rpta = 1;
                } else if (per1.getEdad() < per2.getEdad()) {
                    rpta = -1;
                }else{
                    rpta = 0;
                }
                return rpta ;
            }
            
        });
        
        for (Persona p : lista) {
            System.out.println(p.getNombre() + "-" + p.getEdad());
        }
        
      
      
    }
    
}
