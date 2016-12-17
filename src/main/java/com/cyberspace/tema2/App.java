/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema2;

import com.cyberspace.tema1.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel.villarreal
 */
public class App {
  
    private List canasta = new ArrayList();
    
    private void verificar(Object objeto){
        if(objeto instanceof Fruta){
            canasta.add(objeto);
             System.out.println("Fruta agregada" +((Fruta)objeto).getNombre());
        }else{
            System.out.println("Esta opcion no es una fruta " + objeto.toString());
        }
    }
    public static void main(String[] args) {
        /*Prueba si es una objeto string
        String texto = new String();
        if(texto instanceof String){
            System.out.println("Este es una instancia de un obejto string");
        }
                */
        
        /*Prueba si es una objeto Alumno tambien se puede evaluar si es una instancia de la super clase persona y seria true 
        //Ya que alumno hereda de persona
        Alumno al = new Alumno();
        if(al instanceof Alumno){
            System.out.println("Este es una instancia de un obejto personalisado Alumno");
        }
                */
        
        
        
        
        
        
        //Se crea un ejemplo del uso del instanceOf en el cual el systema solo acepta frutas, para eso se creo el metodo verificar
         System.out.println("Canasta Abierta, solo ingresar frutas");
        
        
        Manzana m1 = new Manzana("ROJA");
        Manzana m2 = new Manzana("VERDE");
        Naranja n1 = new Naranja("NARANJA SIN PEPA");
        Galleta g1 = new Galleta("galleta");
        App app = new App();
        app.verificar(m1);
        app.verificar(m2);
        app.verificar(n1);
        app.verificar(g1);
        
    }
    
}
