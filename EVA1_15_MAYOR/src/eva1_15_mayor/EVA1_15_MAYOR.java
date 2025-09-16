/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA1_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num1, num2;
    Scanner input = new Scanner (System.in);
    System.out.println("Número 1: ");
    num1 = input.nextInt();
    System.out.println("Número 2: ");
    num2 = input.nextInt();
    if(num1 > num2) {
        System.out.println("El valor mayor es ");
        System.out.print (num1);
    }else{
        if(num2 > num1){
        System.out.println("El valor mayor es ");
        System.out.print (num2); 
        
        }else{
            System.out.println("Los valores son iguales");
        }
    }
    
    }
}