
package com.cyberspace.tema6;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ariel.villarreal
 * Tema 6 HashSet, es una manera de manipular listas con ciertos criterios particulares
 * en el caso de 'HashSet' la lista no tiene elementos duplicado ni se preocupa por el orden en 
 * que se agregan los elementos
 */
public class AppHashSet {

    
    public static void main(String[] args) {
        /* Ejemplo de HashSet con un string normal
        Set<String> lista = new HashSet<>();        
        lista.add("Cyberspace");
        lista.add("Cyber");
        lista.add("Space");
        lista.add("Cyberspace");
        lista.add("Ariel");
        lista.add("AAAA");
        
        for (String list : lista) {
            System.out.println(list);            
        }
        */        
        // Ejemplo de HashSet con un Objeto, en este caso el objeto persona
        Set<Persona> lista = new HashSet<>();        
        lista.add(new Persona(1,"Cyberspace",22));
        lista.add(new Persona(1,"Cyber",22));
        lista.add(new Persona(1,"Space",22));
        lista.add(new Persona(1,"Cyberspace",22));
        lista.add(new Persona(2,"Ariel",23));
        lista.add(new Persona(1,"AAAA",22));
        
        for (Persona per : lista) {
            System.out.println(per.getNombre()+"-"+per.getEdad());            
        }
        
    }
    
}
