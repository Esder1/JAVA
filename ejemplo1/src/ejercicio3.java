
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esder Xoná
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner producto = new Scanner(System.in);
        
        int precio_producto = 0;
        int acumulador = 0;
        
        
        float PORCENTAJE1 = (float) 0.05;
        float PORCENTAJE2 = (float) 0.1;
        float descuento = 0;
        float total = 0;
        
        System.out.println("ingrese el precio");
        precio_producto=Integer.valueOf(producto.next());
        
        while(precio_producto > 0){
            acumulador = acumulador+precio_producto;
            System.out.print("ingrese el precio");
            precio_producto=Integer.valueOf(producto.next());            
        }
        if(acumulador >= 1500){
            descuento = acumulador * PORCENTAJE2;
            System.out.println("Tu descuento es.:"+descuento);
            System.out.println("Tu total a pagar es.:"+acumulador);
        }
        else
        if(acumulador >= 500){
            descuento = acumulador * PORCENTAJE1;
            System.out.println("Tu descuento es.:"+descuento);
            System.out.println("Tu total a pagar es.:"+acumulador);
        }
        
    }
    
}
