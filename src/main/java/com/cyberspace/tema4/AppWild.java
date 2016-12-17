/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ariel.villarreal
 * Tema Genericos 3, wildcard 'joker' oh una carta 'comodin',
 * es el ultimo tema de genericos uso de un Unknown '<?>' 
 * esto se usa para invocar un obejeto desconociendo su typo, pero lo trata igual es en caso de necesitar
 * una lista de varias cosas, ejemplo carnes y verduraz, cuando sea un objeto verdura el sistema le puede dar
 * un trato diferente que cuando es un objeto carne, pero el sistema tambien los ocupa tratar ambos como objetos
 * y agregarlos a una lista en este caso entra el operador <?>
 */
public class AppWild {
    //Uso de el metodo UpperBounded, acepta todas los objetos que hereden oh implementen la clase padre
    //en esta caso Persona
    public void listarUpperBounded(List<? extends Persona> lista){
       
        //Uso de el metodo UpperBounded
        for(Persona per: lista){
            
            System.out.println(per.getNombre());    
            
        }        
    }
    //Uso de el metodo UpperBounded, acepta todas los objetos
    //En este caso se implementa un InstanceOf para determinar el tipo de obejto y hacer el casteo al tipo requerido
    public void listarUnBounded(List<?> lista){       
         //Esta es la opcion 1 la cual se hace un if por cada objeto oh cada instancia q se quiera manejar 
        //dentro de el metodo
        for(Object a: lista){
            if (a instanceof Persona) {
            System.out.println(((Persona)a).getNombre());    
            }else if(a instanceof Persona){
              System.out.println(((Persona)a).getNombre());    
            }      
        }       
    }
    
   
    
    //Uso de el metodo LowerBounded, acepta todas los objetos que son mayores oh padres 
    //en esta caso de Alumno
    public void listarLowerBounded(List<? super Alumno> lista){
      //Siglo for para , la lista de objetos     
        for(Object al: lista){          
            System.out.println(((Persona)al).getNombre());       
        }
    }
  
    
    
    
    
    
    
    public static void main(String[] args) {
       AppWild aw = new AppWild();
       
       Persona pf1 = new Profesor("Cyberspace");
        Persona pf2 = new Profesor("Jesus");
        Persona pf3 = new Profesor("Villa");
       
       List<Persona> lista =  new ArrayList<>();
       lista.add(pf1);
       lista.add(pf2);
       lista.add(pf3);
       
       aw.listarUpperBounded(lista);
        System.out.println();
       aw.listarLowerBounded(lista);
        System.out.println();
       aw.listarUnBounded(lista);
    }
    
}
