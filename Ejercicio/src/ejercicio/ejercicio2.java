/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Esder Xoná
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner mul = new Scanner(System.in);
        double longitud=0; 
        double radio=0;
        double PI=3.1416;
        int e=2;
            System.out.println("Introduce el radio del circulo");
            radio = mul.nextDouble();
            longitud = mul.nextDouble();
            longitud = PI*e*radio;
            System.out.println("La longitud del Círculo resultante es: " + longitud);
    }
    
}
