/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema7;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author ariel.villarreal
 * Tema & Map
 * en este tema se analiza el uso de la interface MAP, junto con 3 diferentes implementaciones, 'hashMap', 'TreeMap' y 'LinkedHashMap'
 * las cuales funciona un poco similar que las implementaciones usadas con la interface SET, pero esta esta ligada al APi collection y el map no tanto
 * tiene similitudes pero no esta ligada almenos no directamente al API collections, tambien la forma de funcionar del MAP es con una clave y un valor
 */
public class AppMap {

   
    public static void main(String[] args) {
      /* 
        //En este caso se implementa el HashMap el cual no tiene un orden definido solo se preocupa
        //por q no ahiga 2 objetos iguales, en caso q dos oh mas objetos tenga una misma key se usa la 
        //el ultimo elemnto de los 2 con  las misma llave
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Cyberspace");
        map.put(4, "Cyberspace");
        map.put(5, "Cyberspace");
        map.put(2, "Cyberspace");
        map.put(1, null);
        map.put(null, "Cyberspace");
        Iterator it = map.keySet().iterator();
              
        */
        
        
        /*
        //En esta caso al iguan q en el TreeSet el TreeMap ordena los valores de menor a mayor oh de A-Z
        //No acepta claves iguales etc.
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "Cyberspace");
        map.put(4, "Cyberspace");
        map.put(5, "Cyberspace");
        map.put(2, "Cyberspace");
        map.put(2, "AAAAA");
        map.put(1, null);
          */      
        
        //En esta caso se preocupa por el orden en el que se ingresaron los objetos, y si se utilizara un objeto particular
        //se usa lo mismo q en el ejemplo de la Interface SET
        
         Map<Persona, String> map = new LinkedHashMap<>();
        map.put(new Persona(6,"AAAA",27), "Cyberspace");
        map.put(new Persona(1,"Cyberspace",22), "Cyber");
        map.put(new Persona(2,"Cyber",23), "Space");
        map.put(new Persona(3,"Space",24), "Ariel");
        map.put(new Persona(4,"Cyberspace",25), "Naruto");
        map.put(new Persona(5,"Ariel",26), "AAAA");
        
        
       //Forma clasica de interar un map,  
       /*
        Iterator it = map.keySet().iterator();
        
        while (it.hasNext()) {
           Persona key = (Persona) it.next();
            System.out.println("Clave:" + key +" -> Valor: " + map.get(key));            
        }
        */
        //Segunda opcion para interar un map, con el uso de un  for
        
        for(Entry<Persona, String> ent : map.entrySet()) {
            System.out.println("Clave:" + ent.getKey() +" -> Valor: " + ent.getValue());            
            
        }
    }
    
}
