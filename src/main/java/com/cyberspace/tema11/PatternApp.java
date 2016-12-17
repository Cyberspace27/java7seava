
package com.cyberspace.tema11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ariel.villarreal
 * Tema 11, Expressiones regulares, en este caso se analiza la clase 'Pattern'
 * Se muestra la forma de uso y los metodos de clase 'compile' para ingresar una cadena de texto con la 
 * expreccion regular oh 'regex'  y luego se le hace el match con la cadena hacer valorada por la expression regex
 * 
 * 
 */
public class PatternApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       //se muestra true cuando la expresion hacen match con el contenido de la cadena valorada
       // Pattern p = Pattern.compile(".*\\d{6}.*");
        
        //Matcher m = p.matcher("123456");
        
       // System.out.println(m.matches());
        
        //Ejemplo 2 usando un areglo y el metodo split
        /////// se compara el split con el patternt//////////////////////
        
        long ini = System.currentTimeMillis();
         //Ejemplo regex basico    
        //Pattern p = Pattern.compile(";");
         //Ejemlplo de regex mas complejo
        
           // String patron =  "^[_A-Za-z0-9\\+]+(\\.[_A-Z-a-z0-9-]+)*@";
          Pattern p = Pattern.compile("^[_A-Za-z0-9\\+]+(\\.[_A-Z-a-z0-9-]+)*@");

         for (int i = 0; i < 10000; i++) {
            //Ejemplo regex basico    
        //String[] arreglo = p.split("Ariel;Cyberspace;Space;Cyber");
             //Ejemlplo de regex mas complejo
             String[] arreglo = p.split("Ariel|Cyberspace|Space|Cyber|jnksdjfdk",4);
        }
         
         long fin = System.currentTimeMillis();
         System.out.println("Pattern = "+(fin - ini));
         
         //////////////////Codigo para el split///////////////////////////
         
         long iniSplit = System.currentTimeMillis();
         
         for (int i = 0; i < 10000; i++) {
        //Ejemplo regex basico    
        //String[] arreglo = "Ariel;Cyberspace;Space;Cyber".split(";");
         //Ejemlplo de regex mas complejo
           String[] arreglo = "Ariel|Cyberspace|Space|Cyber|jnksdjfdk".split("^[_A-Za-z0-9\\+]+(\\.[_A-Z-a-z0-9-]+)*@",4);
        } 
         
         long finSplit = System.currentTimeMillis();
         System.out.println("Split = " + (finSplit - iniSplit));
       
          
        //Resultado de la comparacion en tiempo del metodo 'Split' y del metodo 'Pattern' 
         //El metodo Split es mas eficiente si el regex es basico pero a medida q el regex aumente la complejidad
         //El pattern es muchos mas eficiente que el Split, 
        
    }
    
}
