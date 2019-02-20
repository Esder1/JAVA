/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;



/**
 *
 * @author Yuliza937
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        Scanner numb = new Scanner (System.in);
        
        int numero = 0;
        
        System.out.println("Ingrese un numero entre 0 y 0.999 para saber cuantas cifras tiene");
        numero = numb.nextInt();
        
        if (numero >=0 && numero < 10)
        {
            System.out.println("su numero ingresado tiene un digito");
        }
        else if (numero >=10 && numero < 100)
        {
            System.out.println("su numero ingresado tiene dos digitos");
        }
        else if (numero >100 && numero < 1000)
        {
          System.out.println("su numero ingresado tiene tres digitos ");
        }
        else if (numero >1000 && numero <10000)
        {
            System.out.println(" su numero ingresado tiene cuatro digitos");
        }
         else
        {
            System.out.println("***porfavor ingresar lo que se le esta solicitando***");
       
           
        }
    
    
   
    
        
    }
    
}
