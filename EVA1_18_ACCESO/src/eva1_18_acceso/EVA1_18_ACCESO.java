/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA1_18_ACCESO {
    //CONSTANTES: indentificadores que no pueden
    //Cambiar de valor. Es con la palabra final
    //Stactic: es para que se pueda usar en el main
    final static String USUARIO = "antonio";
    final static String PWD = "2510";
    
    public static void main(String[] args) {
    String usu, contra;
    Scanner input = new Scanner (System.in);
    System.out.println("****BIENVENIDO****");
    System.out.println("Sistema de ventana Restaurante");
    System.out.println("Usuario: ");
    usu = input.nextLine();
    System.out.print("Contraseña: ");
    contra = input.nextLine();
    //equals compara texto
    if(usu.equals(USUARIO)){//usuario correcto
    if(contra.equals(PWD)) {//contraseña correcta
        System.out.println("ACCESO CONCEDIDO");
    }else{//contraseña incorrecta 
        System.out.println("ACCESO DENEGADO");
    }
    }else{//Usuario incorrecto
        System.out.println("ACCESO DENEGADO");
        }
      }    
}
