/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author CASKLE
 */
public class Iva {
    private Double precio;
    
    
    public Iva(Double precio) {
        this.precio = precio;
       
    }
   
    public  Double calcular_iva()
    { 
        double iva;               
        iva = precio*16/100;
        return iva;
        
    }
    }
    

