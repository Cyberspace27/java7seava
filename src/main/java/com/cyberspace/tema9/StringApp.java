/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema9;

/**
 *
 * @author ariel.villarreal
 * Tema 9 StringBuilder y el StringBuffer
 * Estas dos clases se usan para almacenas tipos de datos String lo que ofrece son una serie de metodos para un mejor manejo y mejoran en el tema de rendimiento
 * ala hora de agregar elementos.
 * Entre las principales y casi unicas diferencia q pude ver ya ambas posees muchos metos en comun es que el stringBuffer implementa un metodo para seguridad y el stringBuild Mo
 * esto hace q el stringBuilder sea mas rapido y mas inseguro especialmente en tema de hilos y el StringBuffer mas seguro pero un poco mas lentos especia en temas de hilos
 * 
 */
public class StringApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       System.out.println("------------------------StringBilder---------------------------------"); 
       StringBuilder sbd = new StringBuilder("Cyberspace");
      sbd.append(" ariel").append(" Villarreal");
      System.out.println("muestra el valor contenido = "+sbd.toString());
      System.out.println("Capacidad de atributos inicial + utilizados = "+sbd.capacity());
      System.out.println("total de elemntos utilizados  = "+sbd.length());
      System.out.println("hacer que el valor contenido se muestre alreves = "+sbd.reverse());
     
      System.out.println("muestra el valor contenido= "+sbd.toString());
      
           
        System.out.println("------------------------StringBuffer---------------------------------");
        StringBuffer sbf = new StringBuffer("Cyberspace");
      
      System.out.println("Capacidad de atributos inicial + utilizados = "+sbf.capacity());
      System.out.println("total de elemntos utilizados  = "+sbf.length());
      System.out.println("hacer que el valor contenido se ponga alreves = "+sbf.reverse());
     
      System.out.println("muestra el valor contenido= "+sbf.toString());

      
     
    }
    
}
