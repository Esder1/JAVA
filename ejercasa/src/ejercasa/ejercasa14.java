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
public class ejercasa14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nu=new Scanner(System.in); 
        int A=0;
        int B=0;
        int C=0;
        System.out.println("Ingrese un numero de 0 a 9");
        A=Integer.valueOf(nu.next());
        System.out.println("Ingrese otro numero de 0 a 9");
        B=Integer.valueOf(nu.next());
        System.out.println("Ingrese otro numero de 0 a 9");
        C=Integer.valueOf(nu.next());
        System.out.println(C+""+B+""+A);
    }
    
}
