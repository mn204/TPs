/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;
import java.util.Scanner;
/**
 *
 * @author Manuel
 */
public class Ej_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String cadena = sc.nextLine();
        
        System.out.println("La cadena tiene " + cadena.length() + " caracteres.");
        int cantidadVocales = 0;
        for (int i = 0; i < cadena.length(); i++){
            char letra = Character.toUpperCase(cadena.charAt(i));
           if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                cantidadVocales++;
            }
        }
        System.out.println("La cantidad de vocales es: " + cantidadVocales);
    }
}
