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
public class ejercasa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner internet=new Scanner(System.in);
        
        float horas =0;
        float costo_horas=(float)1.5;
        float total=0;
        float resto=0;
        
        System.out.println("Ingrese el tiempo que estara usando el equipo:.");
        horas=internet.nextFloat();
        
        if (horas<5){
            total = horas * costo_horas;
            System.out.println("El total a pagar es:." + total);
        }
        else if(horas>5){
            resto= horas-1;
            total=(float) (resto*1.5);
            System.out.println("Se le regalara una hora por exeder las 5");
            System.out.println("El total que debe pagar es:."+total);
        }
        else
        {
            System.out.println("Ingrese los datos que se le solicitan");
        }
    }
    
}
