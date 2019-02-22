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
public class ejercasa8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ejer8=new Scanner(System.in);
        
        int moneda1=0;
        int moneda2=0;
        float moneda3=0;
        int moneda4=3;
        int moneda5=0;
        int moneda6=0;
        
        
        System.out.print("ingrese monedas de 5:");
        moneda1=Integer.valueOf(ejer8.next());
        System.out.print("ingrese monedas de 10:");
        moneda2=Integer.valueOf(ejer8.next());
        System.out.print("ingrese monedas de 12.5:");
        moneda3=Float.valueOf(ejer8.next());
        System.out.print("ingrese monedas de 25 centavos:");
        moneda4=Integer.valueOf(ejer8.next());
        System.out.print("ingrese monedas de 50 centavos:");
        moneda5=Integer.valueOf(ejer8.next());
        System.out.print("ingrese monedas de 1 Bolivar:");
        moneda6=Integer.valueOf(ejer8.next());
        
        
        System.out.println("El dinero total es:."+((moneda1*0.05)+(moneda2*0.10)+(moneda3*0.125)+(moneda4*25)+(moneda5*0.50)+(moneda6*1)));
    }
    
}
