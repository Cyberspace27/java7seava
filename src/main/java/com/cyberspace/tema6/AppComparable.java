
package com.cyberspace.tema6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ariel.villarreal
 * 
 */
public class AppComparable {

   
    public static void main(String[] args) {
        
      List<Persona> lista = new ArrayList<>();
     
      lista.add(new Persona(1,"Ariel", 10));
      lista.add(new Persona(1,"Villarreal", 17));
      lista.add(new Persona(1,"Cyberspace", 27));
      lista.add(new Persona(1,"AAAAA", 30));
      //comentada la linea siguiente por q se le quito la interface comparator a la clase persona
      //  Collections.sort(lista);

         for (Persona p : lista) {
            System.out.println(p.getNombre() + "-" + p.getEdad());
        }
    }
    
}
