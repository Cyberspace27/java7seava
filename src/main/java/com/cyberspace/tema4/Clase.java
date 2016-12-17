/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema4;

/**
 *
 * Tema genericos 1
 */
public class Clase<T>{
    private T objeto;
    
    public Clase(T objeto){
        this.objeto = objeto;
    }
    
    public void mostrarTipo(){
        System.out.println("T es un : " + objeto.getClass().getName());
    }
    
}
