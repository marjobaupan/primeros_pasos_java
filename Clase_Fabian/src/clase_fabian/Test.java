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
     System.out.println("2. Factorial de un numero ");
     System.out.println("3. Tipo de numero");
     System.out.println("4. Sumar numeros pares e impares de un numero.");
     System.out.println("5. Cubo interesante o narcisista.");
     System.out.println("6. (x/y)^z.");
     System.out.println("7. (N+(1+X)!)^x/(X*2)^(N!).");
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
