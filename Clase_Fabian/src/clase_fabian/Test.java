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
public class Test {
   
    
    public static void main(String[] args) {
        // TODO code application logic here
     Clase_Fabian MiCirculo = new Clase_Fabian(0,0,5);   
     MiCirculo.perimetro();
     //MiCirculo.Pi=5;
     System.out.println(2*MiCirculo.Pi);
     MiCirculo.perimetro();
     
     Scanner primera =new Scanner(System.in);
     System.out.println("Por favor seleccione lo que quiere realizar:");
     System.out.println("1. X elevado a Z");
     System.out.println("2. X factorial");
     System.out.println("3. X Tipo de numero");
     System.out.println("4. X Digitos pares e impares.");
     System.out.print("Ingrese la opción:");
     int opcion = primera.nextInt();
     
    MiCirculo.seleccion(opcion);
     /*
        System.out.println("Por favor ingresa una cadena:");
        String linea = primera.nextLine();
        System.out.println(linea);
        
        System.out.print("Ingrese un valor:");
        
        
        int entero1 = Integer.parseInt(linea);
        System.out.println(entero1);
     */
     
    }
}
