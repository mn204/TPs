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
public class Ej__13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos cadenas:");
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();
        if (cadena1.contains(cadena2)) {
            System.out.println("La cadena 1 contiene a la cadena 2");
        } else {
            System.out.println("La cadena 1 no contiene a la cadena 2");
        }
        
    }
}
