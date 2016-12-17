/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema6;

import java.util.Objects;

/**
 *
 * @author ariel.villarreal
 * el primer ejemplo es el que usa el main App Ordenar
 * para el segundo se le pasa la interface comparable a la clase directamente
 * 
 */
public class Persona {// implements Comparable<Persona>{
    
    int id;
    String nombre;
    int edad;
    public Persona(int id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
/*
  @Override
    public int compareTo(Persona per) {
        //En este caso se a comodara de menor a mayor
      //return this.edad - per.getEdad();      
        
       // En este caso se a comodara de mayor a menor
      //return per.getEdad() - this.edad;      
        
        //Ahora comparamos un String de A ala Z
        //return this.nombre.compareTo(per.getNombre());    
        
        //Ahora comparamos un String de Z ala A
        return this.edad - per.getEdad();      
    }
*/
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        return true;
    }
    

    
    
    
    
}
