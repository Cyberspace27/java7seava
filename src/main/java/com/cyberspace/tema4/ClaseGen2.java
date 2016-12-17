/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema4;

/**
 *
 * @author ariel.villarreal
 */
public class ClaseGen2<K,T,V,E>{
      private K objetoK;
      private T objetoT;
      private V objetoV;
      private E objetoE;
    
    public ClaseGen2(K objetoK ,T objetoT ,V objetoV ,E  objetoE){
        this.objetoK = objetoK;
        this.objetoT = objetoT;
        this.objetoE = objetoE;
        this.objetoV = objetoV;
    }
    
    public void mostrarTipo(){
        System.out.println("K es un : " + objetoK.getClass().getName()+"\n"+
                            "T es un : " + objetoT.getClass().getName()+"\n"+
                            "E es un : " + objetoE.getClass().getName()+"\n"+
                            "V es un : " + objetoV.getClass().getName());
        
    }
    
}
