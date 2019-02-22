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
public class ejercasa33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner peso=new Scanner(System.in);
        
        double p=0;
        double kilogramos=2.2046;
        double total=0;
        
        System.out.println("Ingrese el peso en kilogramos");
        p=Double.valueOf(peso.next());
        total=p*kilogramos;
        System.out.println("El peso es:." + total );
    }
    
}
