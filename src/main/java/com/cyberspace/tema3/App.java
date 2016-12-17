/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema3;

/**
 *
 * @author ariel.villarreal
 */
public class App {

   
    public static void main(String[] args) {
        
       
         PaisDAOImpl dao = PaisDAOImpl.getInstance();
        
        for(Object obj : dao.getPaises()){
            System.out.println("Objeto dao1 "+((Pais)obj).getNombre());
        }
        
        System.out.println("*********************************");
        
        for(Object obj : dao.getPaises()){
            System.out.println("Objeto dao2 "+((Pais)obj).getNombre());
        }
        
        
         System.out.println("*********************************");
         PaisDAOImpl daoi = PaisDAOImpl.getInstance();
        //Se pueba el patron sigleton
         
        for(Object obj : daoi.getPaises()){
            System.out.println("Objeto daio"+((Pais)obj).getNombre());
        }
        
        
        
    }
    
}
