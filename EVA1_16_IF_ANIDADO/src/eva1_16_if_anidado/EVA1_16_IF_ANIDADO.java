/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_if_anidado;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA1_16_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //día de la semana 1 a 7
    int dia;
    Scanner input =new Scanner (System.in);
    System.out.println("Captura un número del (1 al 7): ");
    dia = input.nextInt();
    
    if(dia == 1){
         System.out.println("Domingo");
    }else if(dia == 2){
         System.out.println("Lunes");
        }else if(dia == 3){
         System.out.println("Martes");
     }else if(dia == 4){
         System.out.println("Miercoles"); 
     }else if(dia == 5){
         System.out.println("Jueves");
     }else if(dia == 6){
         System.out.println("Viernes");
     }else if(dia == 7){
         System.out.println("Sabado");
     }else{ //Opcional
         System.out.println("¡Número no valido!");
    }
    }
    
}
