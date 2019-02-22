/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercasa;

import java.util.Scanner;

/**
 *
 * @author Esder Xoná
 */
public class ejercasa31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double area=0; 
        double radio=0;
        double PI=3.1416;
            System.out.print("Introduce el radio de un Círculo: ");
            radio = num.nextDouble();
            area = PI*(radio*radio);
            System.out.println("El área del Círculo resultante es: " + area);
    }
    
}
