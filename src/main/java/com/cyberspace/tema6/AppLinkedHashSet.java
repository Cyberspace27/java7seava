/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema6;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author ariel.villarreal
 * Tema 6 LinkedHashSet
 * Es una manera de manipular listas con ciertos criterios particulares
 * en el caso de 'LinkedHashSet' la lista no tiene elementos duplicado y se preocupa por el orden en 
 * el que los elementos fueron ingresados a la lista
 */
public class AppLinkedHashSet {

    
    public static void main(String[] args) {
         Set<Persona> lista = new LinkedHashSet<>();        
        lista.add(new Persona(6,"AAAA",27));
        lista.add(new Persona(1,"Cyberspace",22));
        lista.add(new Persona(2,"Cyber",23));
        lista.add(new Persona(3,"Space",24));
        lista.add(new Persona(4,"Cyberspace",25));
        lista.add(new Persona(5,"Ariel",26));
        lista.add(new Persona(3,"Space",24));
        
        
        for (Persona per : lista) {
            System.out.println(per.getNombre()+"-"+per.getEdad());            
        }  
    }
    
}
