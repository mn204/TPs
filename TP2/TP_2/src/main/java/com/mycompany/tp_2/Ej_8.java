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
public class Ej_8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String cadena = sc.nextLine();
        System.out.println("El string es: " + cadena);
        System.out.println("El string remplazando a por e es: " + cadena.replace("a", "e"));
    }
}
