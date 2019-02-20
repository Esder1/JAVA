/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Yuliza937
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner circunferencia = new Scanner (System.in);
        
        double pi = 3.1416;
        float RADIO = 0;
        float longitud = 0;
        
        System.out.println("Ingresar el radio de una circunferencia");
        RADIO = (float) circunferencia.nextDouble();
        longitud = (float) (pi* (2*RADIO));
        System.out.println("La longitud de la circunferencia es:" + longitud);
        
        
        
    }
    
}
