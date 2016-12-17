/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema8;

import java.util.Stack;

/**
 *
 * @author ariel.villarreal
 * 
 * Tema 8 Stack, tiene relacion con el APi collection y se traduce al forma de 
 * una pila y usa LIFO, "Last In " "First Out"
 */
public class AppStack {

    public static void main(String[] args) throws InterruptedException {
        
       
        
    // Se crea el primer ejemplo con un tipo de dato string y  se prueba algunos de los metos de intancia de la clase Stack
        /*
         Stack<String> pila = new  Stack<>();
        pila.push("1-Cyberspace");
        pila.push("2-Cyber");
        pila.push("3-Space");
        pila.push("4-Ariel");
        pila.push("5-AAAA");
        
        for (String elemento : pila) {
            System.out.println(elemento);
        }
        System.out.println("Tope" + pila.peek());
        System.out.println("search " + pila.search("5-AAAA"));
        System.out.println("LIFO");
        while (!pila.isEmpty()) {
            System.out.println("Antendiendo A : " + pila.pop());
            Thread.sleep(2000);
            
            
        }
                */
        
         Stack<Persona> pila = new  Stack<>();
         
        pila.push(new Persona(4, "Cyberspace",18));
        pila.push(new Persona(3, "Cyber", 223));
        pila.push(new Persona(2, "Space", 27));
        pila.push(new Persona(1, "Ariel", 32));
        
        
        for (Persona per : pila) {
            System.out.println(per);
        }
        System.out.println("Tope" + pila.peek());
        System.out.println("search " + pila.search(new Persona(4, "Cyberspace",18)));
        System.out.println("LIFO");
        while (!pila.isEmpty()) {
            System.out.println("Antendiendo A : " + pila.pop());
            Thread.sleep(1000);
            
            
        }
        
        
    }
    
}
