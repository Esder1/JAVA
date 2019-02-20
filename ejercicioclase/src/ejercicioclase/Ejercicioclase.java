/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author Esder Xoná
 */
public class Ejercicioclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner nu=new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero entre 0 al 9.999");
        num=Integer.valueOf(nu.next());
        
        if(num<10)
            System.out.println("tiene una cifra");
        else{
            if(num<100)
                System.out.println("tiene dos cifras");
        else{
            if(num<1000)
                System.out.println("tiene tres cifras");
        else{
            if(num<10000)
                System.out.println("tiene cuatro cifras");
                }
            }
        }
    }
    
}
