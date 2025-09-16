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
        Scanner input = new Scanner(System.in);
        System.out.println("****BIENVENIDO AL ANTRO XALAPAEÑO****");
        System.out.println("Verificación de edad.");

        System.out.print("¿Tiene INE? (Si/No): ");
        String respuestaINE = input.nextLine();

        if (respuestaINE.equalsIgnoreCase("Si")) {
            System.out.print("Edad: ");
            int edad = input.nextInt();

            if (edad >= 18) {
                System.out.println("ACCESO CONCEDIDO");
            } else {
                System.out.println("ACCESO DENEGADO (Eres menor de edad)");
            }
        } else {
            System.out.println("ACCESO DENEGADO (No tienes INE)");
        }
    }
}