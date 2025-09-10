/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califica;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce la calificación: ");
        califica = captu.nextInt();
        //ESTRUCTURA DE CONTROL IF
        if(califica >= 70){//bloque verdadero
        System.out.println("ACREDITADO!!");
    }else{//bloque falso --> opcional SI-NO
        System.out.println("NO ACREDITADO");
        }
    }
}