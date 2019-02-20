/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import java.util.Scanner;

/**
 *
 * @author Esder Xoná
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrar=new Scanner(System.in);      

       
        int valor=0;
        System.out.println("ingrese un valor");
        //valor2=entar.next();
        valor = Integer.valueOf(entrar.next());
        
        float valor2 = (float) 0.0;
        System.out.println("ingrese un valor");
        //valor2=entar.next();
        valor2 = Float.valueOf(entrar.next());
        
        double valor3=0;
        System.out.println("ingrese un valor");
        //valor3 = entrar.next();
        valor3 = Double.valueOf(entrar.next());
    }
    
}
