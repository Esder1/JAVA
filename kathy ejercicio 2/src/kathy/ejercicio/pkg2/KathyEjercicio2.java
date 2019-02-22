/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kathy.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Yuliza937
 */
public class KathyEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner viaje = new Scanner (System.in);
      
        double precio = 10.5;
        double kilometros = 0;
        double precio_boleto = 0;
        
        System.out.println("Ingrese los kilometros recorridos");
        kilometros= viaje.nextDouble();
        precio_boleto = precio*kilometros;
        System.out.println("el precio del boleto es;"+ precio_boleto);
        
        
    }
    
}
