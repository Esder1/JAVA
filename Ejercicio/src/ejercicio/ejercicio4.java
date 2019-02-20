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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nu= new Scanner(System.in);
        int n=0;
        
     
        System.out.println("Ingrese el numero.");
        n = Integer.valueOf(nu.next());
        if(n>0){
            System.out.println("es positivo");    
        }
        else if(n<0){
            System.out.println("es negativo");
        }
        else{
            System.out.println("Ingreso el numero cero");
        }
    }
    
}
