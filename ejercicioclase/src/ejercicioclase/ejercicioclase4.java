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
public class ejercicioclase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner d= new Scanner(System.in);
        int dia;
        int meses;
        int año;
        
        System.out.println("ingrese el dia");        
        dia=d.nextInt();
        System.out.println("ingrese el mes");
        meses=d.nextInt();
        System.out.println("ingrese el año");
        año=d.nextInt();
        
        if (dia<30){
            System.out.println("el dia es:"+dia);
         
        }
        else {
            System.out.println("incorrecto");
        }
        if( meses<=12){
            System.out.println("el mes es:"+meses);

        }
        else {
            System.out.println("incorrecto");
        }
        if(año>0){
            System.out.println("el dia es:." + dia + "/" + "el mes es:." + meses + "/" + "el año es:." + año);
            System.out.println("La fecha es valida");
        }
        else {
            System.out.println("Invalido");
        }
    }
    
}
