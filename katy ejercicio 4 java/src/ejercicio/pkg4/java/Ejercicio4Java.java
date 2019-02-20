/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.java;

import java.util.Scanner;

/**
 *
 * @author Yuliza937
 */
public class Ejercicio4Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner mes = new Scanner(System.in);
        int dia ;
        int meses;
        int año;
        
        System.out.println("ingrese el dia que desea: ");
        dia=mes.nextInt();
        System.out.println("ingrese el mes que desea: ");
        meses=mes.nextInt();
        System.out.println("ingrese el año que desea: ");
        año=mes.nextInt();
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
    }
    
}
