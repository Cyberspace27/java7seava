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
 * clase genericas y el operador diamante
 * tambien se ve la lista de estereotipos
 */
public class App {

    public static void main(String[] args) {
        //Clase<String> c = new Clase<String>("Cyberspace");
        Clase<Integer> c = new Clase<Integer>(32);
        c.mostrarTipo();
        //List<String> lista = new ArrayList();
       
    }
    
}
