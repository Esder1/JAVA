/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras_arreglos;

import java.util.Scanner;

/**
 *
 * @author Cristóbal Ortíz UwU
 */
public class Letras_arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        int ingreso = 0;
        String in = "";
        
        String[] abecedario = new String [] {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
  
        
        while (ingreso != -1)
        {
            if(ingreso >=0 && ingreso <=26)
            {
            System.out.println("Ingese un número entre 1 a 26:");
            ingreso = ingresar.nextInt(); 
            in = in+abecedario[ingreso];
            }
            else
            {
                System.out.println("Por favor ingrese un número en el rango indicado");
            }
       
            
            
        }
        System.out.println(in);
        
    }
    
}
