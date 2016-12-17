/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema6;

import java.util.Comparator;

/**
 *
 * @author ariel.villarreal
 * se implementa la interface Comparator
 * se puede hacer solo implementando la interface oh pasando el Objeto en este caso persona para evitar el casteo
 * 
 */

public class NombreComparator implements Comparator<Persona>{

    @Override
    public int compare(Persona per1, Persona per2) {

        //Persona per1 = (Persona)obj1;
        //Persona per2 = (Persona)obj2;
        return per1.getNombre().compareTo(per2.getNombre());
    }
    
}
