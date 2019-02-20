/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Rivas
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner nu=new Scanner(System.in);
       
       int num;
       int dm, um, c, d, u;
       System.out.println("ingrese un numero entre 0 y 9999");
       num=Integer.valueOf(nu.next());
       u=num%10;
       num=num/10;
       d=num%10;
       num=num/10;
       c=num%10;
       num=num/10;
       um=num%10;
       num=num/10;
       dm=num%10;
       System.out.println(u + d +" " +c + " " + um + " " +dm);
       
        
        
        
    }
    
}
