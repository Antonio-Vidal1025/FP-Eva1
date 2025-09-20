/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA1_19_ANTRO {

    public static void main(String[] args) {
    Scanner captu = new Scanner (System.in);
    int edad;
    boolean INE;
    System.out.println("Cual es tu edad: ");
    edad = captu.nextInt();
    System.out.println("Tienes INE? (True/False)");
    INE = captu.nextBoolean();
    //USAMOS AND &&
    //mayor de edad y tener INE
    //if((edad >= 18) && (INE == true))
    if((edad >= 18) && (INE == true)){
        System.out.println("Puedes  entrar");
    }else{
        System.out.println("No puedes entrar");
    }
    }
}