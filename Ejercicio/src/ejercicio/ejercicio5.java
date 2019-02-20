/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Esder Xoná
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nu= new Scanner(System.in);
        int n1=0;
        int n2=0;
     
        System.out.println("Ingrese el primer numero.");
        n1 = Integer.valueOf(nu.next());
        System.out.println("Ingrese el segundo numero");
        n2 = Integer.valueOf(nu.next());
        if(n1%n2==0){
            System.out.println("Son multiplo");    
        }
        else{
            System.out.println("no son multiplos");
        }
    }
    
}
