/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kathy.ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author Yuliza937
 */
public class KathyEjercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner algoritmo = new Scanner (System.in);
        
        int moneda1 = 0;
        int moneda2 = 0;
        int moneda3 = 0;
        int moneda4 = 0; 
        int moneda5 = 0;
        int moneda6 = 0;
          
        System.out.println("ingresar monedas de 5");
        moneda1=Integer.valueOf(algoritmo.next());
        System.out.println("ingresar monedas de 10");
        moneda2=Integer.valueOf(algoritmo.next());
        System.out.println("ingresar monedas de 12.5");
        moneda3=Integer.valueOf(algoritmo.next());
        System.out.println("ingresar monedas de 25 centavos");
        moneda4=Integer.valueOf(algoritmo.next());
        System.out.println("ingrese monedas de 50 centavos");
        moneda4=Integer.valueOf(algoritmo.next());
        System.out.println("ingrese monedas de 1 Bolivar");
        moneda5=Integer.valueOf(algoritmo.next());
        
        
        System.out.println(("el dinero total es:"+(moneda*0.5)+(moneda2*0.10)+(moneda3*0.125)+(moneda4*25)+(moneda5*0.50)+(moneda6*1)));
        
        
    }
    
}
