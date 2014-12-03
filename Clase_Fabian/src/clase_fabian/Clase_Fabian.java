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
    double acumulador,inc,resultado;
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
    
    public void imprimir(int i){
        System.out.println(i);
    }
    
    public void imprimir(float i){
        System.out.println(i);
    }
    
    public void imprimir(double i){
        System.out.println(i);
    }
    
    public void imprimir(char i){
        System.out.println(i);
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
            //System.out.println((this.resultado>=this.inc)|(this.resultado<=9*this.inc));
        }while (this.resultado>=this.inc);//while ((this.resultado>=this.inc)|(this.resultado<=9*this.inc));
        
        this.Cx=0;
        this.Cy=0;
        
        for (int j=1;j<=i;j++){
            this.radio = (int)(this.resultado%10);
            this.resultado = this.resultado/10;

            if (this.radio%2==0) 
                {this.Cx = this.Cx+ this.radio ;}//numeros pares
            else 
                {this.Cy = this.Cy + this.radio;}//numeros impares
        }
        
        System.out.println ("Suma pares:"+this.Cx);
        System.out.println ("Suma impares:"+this.Cy);
        
    }
    
    public void cubo_interesante(){
        Scanner primera =new Scanner(System.in);
        System.out.println("Por favor ingrese el valor para X:");
        this.resultado = primera.nextInt();
        double numero=this.resultado;
        
        int i=0;
        do{
            i++;
            this.inc=(double)Math.pow(10, i);
            //System.out.println((this.resultado>=this.inc)|(this.resultado<=9*this.inc));
        }while (this.resultado>=this.inc);//while ((this.resultado>=this.inc)|(this.resultado<=9*this.inc));
        
        this.acumulador=0;
    
        for (int j=1;j<=i;j++){
            this.radio = (int)(this.resultado%10);
            this.resultado = this.resultado/10;

            this.acumulador = (int) (this.acumulador + Math.pow(this.radio, 3)) ;           
        }
        
        if (numero==this.acumulador)
        System.out.println ("Es un cubo interesante o narcisista");
        else System.out.println ("No es un cubo interesante o narcisista");
        
    }
    
    public void factorial(){
        Scanner primera =new Scanner(System.in);
        System.out.println("Por favor ingrese el valor para X:");
        this.Cx = primera.nextInt();

        System.out.println (this.factorial1(this.Cx));
    }
    
    public int factorial1(int a){
        int total=1;
        
        for (int i=1; i<=a; i++){
            total= total*i;
        }
        
        return (total);
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

    public void x_y_ala_z(){
        Scanner primera =new Scanner(System.in);
        System.out.println("Por favor ingrese el valor para X:");
        this.resultado = primera.nextInt();
        
        this.Cx=0;
        this.Cy=0;
        
        int i;
        
        for (i=1;i<=this.resultado;i++){         
            if (this.resultado%i==0) 
            {
                if (i%2==0) 
                    {this.Cx = this.Cx+ i ;}//numeros pares
                else 
                    {this.Cy = this.Cy + i;}//numeros impares            
            }
        }
        
        i=0;
        
        do{
            i++;
            this.inc=(double)Math.pow(10, i);
            //System.out.println((this.resultado>=this.inc)|(this.resultado<=9*this.inc));
        }while (this.resultado>=this.inc);
        
        System.out.println (Math.pow(this.Cx/this.Cy,i));
        
    }

    public void formula_matematica(){
        Scanner primera =new Scanner(System.in);
        System.out.println("Por favor ingrese el valor para X:");
        this.Cx = primera.nextInt();
        System.out.println("Por favor ingrese el valor para N:");
        this.Cy = primera.nextInt();
        
        this.resultado=Math.pow(Cy+(factorial1(1+this.Cx)),Cx);
        this.resultado=this.resultado/Math.pow((this.Cx*2),factorial1(Cy));
        
        System.out.println(this.resultado);
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
        else if (opcion==5){
            this.cubo_interesante();
        }
        else if (opcion==6){
            this.x_y_ala_z();
        }
        else if (opcion==7){
            this.formula_matematica();
        }
        
    }
}
