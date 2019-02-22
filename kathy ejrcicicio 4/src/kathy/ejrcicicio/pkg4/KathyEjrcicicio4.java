/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kathy.ejrcicicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Yuliza937
 */
public class KathyEjrcicicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        float bolivares = 0;
        float Dolares = 0;
        float EUROS = (float) 3117.50;
        float cambio = 0;
        int opcion=0;
        System.out.println("ingresar que desea cambiar \n1.Dolares\n2.EUROS\n\nEscoja su opcion:");
        opcion = ingresar.nextInt();
        
        if(opcion== 1)
        {
            System.out.println("conversor de Bolivares Venezolanos a Dolares");
            System.out.println("ingresar los Bolivares que desea convertir");
            bolivares = ingresar.nextFloat();
            cambio = bolivares / Dolares;
            
            System.out.println("su cambio de:Bs"+bolivares+"bolivares a dolares es:");
            System.out.println("$"+cambio + "Euros");
        }
        else
        {
            System.out.println("ingrese lo que se le solicita");
            
        
        
        }
        
    }
    
}
