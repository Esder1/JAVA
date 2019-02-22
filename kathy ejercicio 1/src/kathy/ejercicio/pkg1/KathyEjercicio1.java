/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kathy.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Yuliza937
 */
public class KathyEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner banco = new Scanner (System.in);
        
        double interes = 0;
        double taza = 0.27;
        double prestamo = 0;
        
        
        System.out.println("Ingrese la cantidad que desea de un prestamo");
        interes = banco.nextDouble();
        interes = prestamo*taza;
        System.out.println("el interes es:" + interes);
        
        
        
                
        
        
    }
    
}
