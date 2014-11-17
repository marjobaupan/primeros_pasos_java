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
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    static int i;
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        if (i==8){ System.out.print("Estas son instrucciones basicas");}
        
    }
    
}
