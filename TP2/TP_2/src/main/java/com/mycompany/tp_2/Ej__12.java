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
public class Ej__12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        do {
        System.out.println("Ingrese una palabra de 5 letras como minimo");
        frase = sc.nextLine();
        } while (frase.length() <5);
        System.out.println("La cuarta y quinta letra son:" + frase.substring(3,5));
    }
}
