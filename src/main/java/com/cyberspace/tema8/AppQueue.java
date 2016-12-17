/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema8;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author ariel.villarreal
 * Tema 8. Queue "colas" en este caso se implemta la interface 'Queue' esta se apoya de la clase "PriorityQueue" y utiliza
 * FIFO, "first In " "First Out"
 */
public class AppQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
      
       //Se maneja el mismo formato de ejemplos primero con un string y se
        //Utilizan algunos metodos propios de la interface Queque
        /*
        Queue<String> cola = new PriorityQueue<>();
        cola.offer("1-Cyberspace");
        cola.offer("2-Cyber");
        cola.offer("3-Space");
        cola.offer("4-Ariel");
        cola.offer("5-AAAA");
        
        
        while (!cola.isEmpty()) {
         System.out.println("Se procede a atender A " + cola.peek());
         System.out.println( cola.poll()+" Atendiendo ");
            Thread.sleep(1000);
        }
        */
        
        Queue<Persona> cola = new PriorityQueue<>();
       
        cola.offer(new Persona(4, "Cyberspace",18));
        cola.offer(new Persona(3, "Cyber", 23));
        cola.offer(new Persona(2, "Space", 27));
        cola.offer(new Persona(1, "Ariel", 32));
        
        while (!cola.isEmpty()) {
         System.out.println("Se procede a atender A " + cola.peek());
         System.out.println( cola.poll()+" Atendiendo ");
            Thread.sleep(1000);
        }
    }
    
}
