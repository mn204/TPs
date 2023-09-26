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
public class Ej__10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        int n = 0;
        do {
        System.out.println("Seleccione a que desea convertir:");
        System.out.println("1. Mayúsculas  2. Minúsculas");
        n = sc.nextInt();
        }while (n < 1 || n > 2);
        
        if (n == 1){
            System.out.println("La frase en mayúsculas es:");
            System.out.println(frase.toUpperCase());
        } else {
            System.out.println("La frase en minúsculas es:");
            System.out.println(frase.toLowerCase());
        }
    }
}
