/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema8;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author ariel.villarreal
 * 
 * tema 8 DEQUE 
 * Es una combinacion entre la interface Stack y Queue
 * 
 * llamado deque "doble-ended queue"
 * 
 * 
 * 
 */
public class AppDeque {

  
    public static void main(String[] args) {
        
        Deque<String> dq = new ArrayDeque<>();
        dq.add("1-Ariel");
        dq.add("2-Cyber");
        dq.add("3-space");
       
        
         /*
        String x = dq.peek();
        System.out.println("Peek " + x);
         x = dq.poll();
        System.out.println("poll " + x);
        
         x = dq.pop();
        System.out.println("Pop " + x);
        */
        
        dq.addFirst("0- Cyberspace");
        dq.addLast("4- Cpace");
        
        int cont = 0;
        for (String elem : dq) {
            cont++;
            System.out.println("Elemento del Deque # "+ cont +" = "+ dq);
            
        }
    }
    
}
