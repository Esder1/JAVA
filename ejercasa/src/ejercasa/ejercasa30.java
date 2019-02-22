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
public class ejercasa30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("ingrese numero para calcular la raiz "); 
        float numero = leer.nextInt(); 
        float Raiz = (float) Math.sqrt(numero) ; 
        System.out.println("La raiz cuadrada del numero "+numero +" es: "+Raiz); 

        System.out.println("\npotenica "); 
        System.out.println("ingrese numero "); 
        float numero2 = leer.nextInt(); 
        System.out.println("ingrese la potencia"); 
        float p = leer.nextInt(); 
        float potencia =(float) Math.pow(numero2, p); 
        System.out.println("La potencia "+numero2 +" es: "+potencia); 
    }
    
}
