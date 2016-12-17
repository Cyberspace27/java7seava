package com.cyberspace.tema1;

/**
 * Nota
 * Un metodo de instancia no puede sobre escribir un metodo de clase y viceversa  
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        
        Prueba 1 
        En este caso los metos sumas son de instancia en la clase hija y la super clase 
        Segun la teoria el metodo de la subclase sobre escribe al metodo de la super clase por lo que si se le pasa el valor de 1 el resultado es = 3
        
        Alumno al = new Alumno();
        System.out.println(al.sumar(1));
        
        */
        //----------------------------------
         /*
          Prueba 2
           En este caso los metos sumas son de metodos static oh de clase tanto en clase hija 'Alumno' como en la super clase 'Persona'
          Segun la teoria el metodo de la super clase estaria oculto osea nunca entraria a la implementacion de este metodo por lo que si se le pasa el valor de 1 el resultado es = 3
         Nota ; por ser un metodo de clase no se necesita instanciar un objeto
          */
           System.out.println(Alumno.sumar(1));
          
       
       
    }
}
