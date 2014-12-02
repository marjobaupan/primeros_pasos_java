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
public class AlmacenEnteros {
    private int tope;
    private int [] numeros;
    
    public void AlmacenEnteros(){
        this.tope=-1;
        this.numeros=new int [100];
    }
    public void AlmacenEnteros(int tamanio){
        this.tope=-1;
        this.numeros=new int [tamanio];
    }
    public void Almacenar (int numero){
        if (this.tope== this.numeros.length-1)
        {
        }
        else 
        {
            this.tope++;
            this.numeros[this.tope]=numero;
        }
    
    }
    public void Imprimir (){
        for (int i=0;i<this.tope;i++){
            System.out.println(this.numeros[i]);      
        }
    }
    public void Redimensionar(int nueva_capacidad){
        if (this.tope+1>nueva_capacidad){
            System.out.println("Nueva capacidad menor a la anterior");
            return;
        }
        
    }
   
}    
