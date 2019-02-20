/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Rivas
 */
public class JavaApplication3{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int numero;
        System.out.println("ingresar el  numero: ");
        numero= entrada.nextInt();
        if (numero<10){ 
            System.out.println("el numero tiene un dijito: ");
        }
        else 
            if (numero<100){
                System.out.println("el numero tiene dos dijito: ");
        }
        else
                if(numero<1000){
                    System.out.println("el numero tiene tres dijito: ");
        }
        else
                if(9999>=numero){
                    System.out.println("el numero tiene cuatro dijito: ");
                }
                else{
                    System.out.println("invalido: ");
                }
              
    }
    
}
