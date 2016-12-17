
package com.cyberspace.tema8;

import java.util.Objects;

/**
 *
 * @author ariel.villarreal
 */
public class Persona implements Comparable<Persona>{
    int id;
    String nombre;
    int edad ;
    
    public Persona(int id, String nombre, int edad){
        super();
        this.edad = edad;
        this.nombre = nombre;
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + this.edad;
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
    
    

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    @Override
    public int compareTo(Persona per) {
        return this.edad - per.getEdad();      
    }
    
    
}
