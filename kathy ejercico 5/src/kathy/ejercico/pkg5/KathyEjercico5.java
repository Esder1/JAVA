/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kathy.ejercico.pkg5;

import java.util.Scanner;

/**
 *
 * @author Yuliza937
 */
public class KathyEjercico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        
        String producto =  "";
        float valor = 0;
        float Descuento = (float) 0.35;
        float total = 0;
        float monto = 0;
        
        System.out.println("ingresar el producto a comprar");
        producto = ingresar.next();
        System.out.println("ingresar el valor del producto");
        valor = ingresar.nextInt();
        monto = valor*Descuento;
        total = valor - monto;
        System.out.println("el descuento del producto"+producto+"es:"+monto);
        System.out.println("el total a pagar con el descuento a pagar es de:\nQ"+total);
                
        
    }
    
}
