/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kathy.ejercico.pkg3;

import java.util.Scanner;

/**
 *
 * @author Yuliza937
 */
public class KathyEjercico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner internet = new Scanner(System.in);
        
       float horas = 0;
       float costo_hora = (float) 1.5;
       float total = 0;
       float resto = 0;
       
        System.out.println("Ingrese las horas que utilizara la computadora");
        horas = internet.nextFloat();
        
        if (horas <5){
            
            total = horas * costo_hora;
            System.out.println("el total a pagar es de:"+ total);
        }
        else if (horas >5)
        {
            resto = horas -1;
            total = (float) (resto *1.5);
            System.out.println("se le regalara una hora gratis por exeder las 5:-3");
            System.out.println("el total a ´pagar es : Q" +total);
        }
        else
        {
            System.out.println("ingresa lo solicitado");
        
        }
            
        
        
        
    }
    
}
