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
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner rivas= new Scanner(System.in);
        int dia ;
        int meses;
        int año;
        
        System.out.println("ingrese el dia que desea: ");
        dia=rivas.nextInt();
        System.out.println("ingrese el mes que desea: ");
        meses=rivas.nextInt();
        System.out.println("ingrese el año que desea: ");
        año=rivas.nextInt();
        if (dia<30){
            System.out.println("el dia es "+dia);
            }
        else{
            System.out.println("Inchorecti");
        }
        if (meses<=12){
            System.out.println("el meses"+ meses);  
        }
        else{
            System.out.println("inchorecti x2");
        }
        if(año>0){
            System.out.println("el dia es: "+dia+" el mes es: "+meses+" el año es: "+año);
            System.out.println("la fecha es valuida:)");
        }
        else{
            System.out.println("invalido: ");
        }   
        if ((año % 4 == 0 && año % 100 != 0)|| año % 400 ==0) {
             System.out.println("es un año bisiesto");
        }
        else{
            System.out.println("el año no es bisiesto");
        }
    }
    
}
