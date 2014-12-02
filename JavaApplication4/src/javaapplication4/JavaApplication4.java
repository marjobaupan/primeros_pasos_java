/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author jonathan
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    static int i;
    public void primera() {
    for (i=0;i<7;i++){
            System.out.println(i);
        }
        
        while (i>1){
        System.out.println(i);
        i--;
        }
        
        do {
            System.out.println(i);
            i++;
        }while (i<=7);
        
        System.out.println(i);
        
        if (i==8){ System.out.println("Estas son instrucciones basicas");}
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication4 a;
        a =new JavaApplication4();
        a.primera();
        
        Factura b;
        b = new Factura();
        b.set_nombre('a');
        System.out.println(b.get_nombre());
        
        //Capturar datos de entrada
        Scanner primera =new Scanner(System.in);
        System.out.println("Por favor ingresa una cadena:");
        String linea = primera.nextLine();
        System.out.println(linea);
        
        System.out.print("Ingrese un valor:");
        int entero = primera.nextInt();
        
        int entero1 = Integer.parseInt(linea);
        System.out.println(entero1);
        
    }
    
}
