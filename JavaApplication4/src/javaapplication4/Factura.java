/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author jonathan
 */
public class Factura {
    private int numero;
    private char nombre;
    
    void set_numero(int numero){
        this.numero = numero;
    }
    
    int get_numero(){
        return (this.numero);
    }
    
    void set_nombre(char nombre){
        this.nombre=nombre;
    }
    
    char get_nombre(){
        return this.nombre;
    }
}
