/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_fabian;

import java.util.Scanner;

/**
 *
 * @author jonathan
 */
public class Clase_Fabian {

    /**
     * @param args the command line arguments
     */
    int Cx, Cy, radio;
    double resultado,inc;
    // double Pi=3.1416;
    final double Pi=3.1416;
    
    public Clase_Fabian(){
        Cx=0;
        Cy=0;
        radio = 0;
    }
        
    public Clase_Fabian(int Cx,int Cy, int radio){
        this.Cx=Cx;
        this.Cy=Cy;
        this.radio = radio;
    }
    
    public void perimetro (){
        System.out.println(2*Pi*radio);
    }
    
    public void elevado(){
        Scanner primera =new Scanner(System.in);
        System.out.println("Por favor ingrese el valor para X:");
        this.Cx = primera.nextInt();
        System.out.println("Por favor ingrese el valor para Z:");
        this.Cy = primera.nextInt();
        System.out.println ((int)Math.pow(Cx, Cy));
    }

    public void digitos_pares_impares(){
        Scanner primera =new Scanner(System.in);
        System.out.println("Por favor ingrese el valor para X:");
        this.resultado = primera.nextInt();
        int i=0;
        do{
            i++;
            this.inc=(double)Math.pow(10, i);
            System.out.println((this.resultado>=this.inc)|(this.resultado<=9*this.inc));
        }while (this.resultado>=this.inc);//while ((this.resultado>=this.inc)|(this.resultado<=9*this.inc));
           
        for (int j=1;j<=i;j++){
            this.radio = (int)(this.resultado%10);
            this.resultado = this.resultado/10;
            this.Cx=0;
            this.Cy=0;
            if (this.radio%2==0) {this.Cx = this.Cx+ this.radio ;}//numeros pares
            else {this.Cy = this.Cy + this.radio;}//numeros impares
        }
        
        System.out.println ("Suma pares:"+this.Cx);
        System.out.println ("Suma impares:"+this.Cy);
        
    }
    
    public void factorial(){
        Scanner primera =new Scanner(System.in);
        System.out.println("Por favor ingrese el valor para X:");
        this.Cx = primera.nextInt();
        this.radio=1;
        for (int i=1; i<=Cx; i++){
        this.radio= this.radio*i;
        }
        System.out.println (this.radio);
    }
     
public void tipo_numero(){
        Scanner primera =new Scanner(System.in);
        System.out.println("Por favor ingrese el valor para X:");
        this.Cx = primera.nextInt();
        if (this.Cx>=0){
            //Para saber si es perfecto
            this.radio=0;
            for (int i=1; i<Cx; i++){
                this.resultado=Cx%i;
                if (this.resultado==0) {
                    radio= radio + i;
                }
            }
            if (this.radio==this.Cx){
                System.out.println ("Es perfecto");
            }
            else {
                System.out.println ("No es perfecto");
            }
            
            //Para saber si es deficiente
            if (this.radio<this.Cx){
                System.out.println ("Es deficiente");
            }
            else {
                System.out.println ("Es abundante");
            }       
        }
        else {
            System.out.println ("No es un entero positivo");
        }
    }

    public void seleccion (int opcion){
        if (opcion == 1) {
            this.elevado();
        }
        else if (opcion == 2) {
            this.factorial();
        }
        else if (opcion==3){
            this.tipo_numero();
        }
        else if (opcion==4){
            this.digitos_pares_impares();
        }
        
    }
}
