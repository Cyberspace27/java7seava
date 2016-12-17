/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema13;

import java.io.IOException;

/**
 *
 * @author ariel.villarreal
 * tema 13, catch lineal esto es algo implementado solo en Java 7
 * 
 * esto nos sirve para implementar catch simplemente separandolo con '|' esto
 * para evitar mutiples catch
 * 
 * 
 */
public class AppExcepciones {
    
    public static void mostrar(){
            try {
            throw new IOException("IOException");
            
        } catch (NullPointerException|IOException ex) {
                System.out.println("Hola " + ex.getMessage());
                
        }
        }

   
    public static void main(String[] args) {
        //el ejemplo usa un metodo de instancia yo quise probar uno de clase
        AppExcepciones.mostrar();
        
    }
    
}
