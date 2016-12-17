/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyberspace.tema3;

import java.util.ArrayList;
import java.util.List;

/**
 * Tema 3 Patron Singleton
 * 
 */
public class PaisDAOImpl {
    
    public static PaisDAOImpl instancia = null;
    private List paises = null;
    
    private PaisDAOImpl(){
        
    }
    
    public static PaisDAOImpl getInstance(){
        if(instancia == null){
            instancia = new PaisDAOImpl();
        }
        return instancia;
    }
    
    
 
    public List getPaises(){
        if(paises == null){
            
            paises = new ArrayList();

            Pais p1 = new Pais("PERU");
            Pais p2 = new Pais("COLOMBIA");
            Pais p3 = new Pais("CHILE");

            paises.add(p1);
            paises.add(p2);
            paises.add(p3);
        }
        return paises;
    }
    
}
