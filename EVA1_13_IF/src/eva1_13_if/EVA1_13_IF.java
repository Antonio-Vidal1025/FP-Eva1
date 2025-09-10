/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año;
        Scanner input = new Scanner (System.in);
        System.out.println("Tienes que ser mayor de edad para comprar bebidad alcolicas: ");
        año = input.nextInt();
        
        if(año >=18) {
            System.out.println("SI PUEDES COMPRAR");
        }else{
            System.out.println("NO PUEDES COMPRAR");
            
            
    }
   
    }
}