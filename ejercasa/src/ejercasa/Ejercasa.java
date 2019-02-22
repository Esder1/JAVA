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
public class Ejercasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        double prestamo=10000;
        double tasa=0.27;
        double meses=12;
        double dias=365;
        double interes= 88.77;
        System.out.println("El prestamo que realizo es de:."+prestamo);
        //interes = entrada.nextDouble();
        //System.out.println("el tiempo es:."+meses);
        //interes = prestamo*tasa/365*meses;
        System.out.println("El interes anual es de:."+interes);
        
    }
    
}
