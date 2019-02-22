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
public class ejercasa32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cen=new Scanner(System.in);
        
        double cm=0;
        double pulgada=0.39737;
        double medida=0;
        
        
        System.out.println("Ingrese cualquier cantidad que desee");
        cm=Double.valueOf(cen.next());
        medida=cm*pulgada;
        System.out.println("La medida es:." + medida);
    }
    
}
