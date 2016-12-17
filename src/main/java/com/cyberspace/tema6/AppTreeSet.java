
package com.cyberspace.tema6;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ariel.villarreal
 * Tema 6 TreeSet 
 * Es una manera de manipular listas con ciertos criterios particulares
 * en el caso de 'TreeSet' la lista no tiene elementos duplicado y se preocupa por el orden en 
 * de los elementos, los ordena de forma automatica, en el caso del String de la A-Z y en caso de numero de
 * menor a mayor
 */
public class AppTreeSet {

    public static void main(String[] args) {

        /*En este caso se hace un ejemplo usando un string
        Set<String> lista = new TreeSet<>();
        
        lista.add("Cyberspace");
        lista.add("Cyber");
        lista.add("Space");
        lista.add("Cyber");
        lista.add("Ariel");
        lista.add("AAAA");
        
        for (String list : lista) {
            System.out.println(list);
        }
           */
           //Ejemplo de una lista TreeSet usando un objeto, en este caso es el Objeto persona, para poder utilizar un objeto con TreeSet, es necesario usar la 
          //Interface Comparable y sobre escribir el metodo de la interface, tambien se puede usar generico y especificar el objeto a ser ordenado en este caso 
           //Es el Obejto persona
         Set<Persona> lista = new TreeSet<>();        
        lista.add(new Persona(1,"Cyberspace",22));
        lista.add(new Persona(2,"Cyber",23));
        lista.add(new Persona(3,"Space",24));
        lista.add(new Persona(4,"Cyberspace",25));
        lista.add(new Persona(5,"Ariel",26));
        lista.add(new Persona(3,"Space",24));
        lista.add(new Persona(6,"AAAA",27));
        
        for (Persona per : lista) {
            System.out.println(per.getNombre()+"-"+per.getEdad());            
        }       
        
    }
    
}
