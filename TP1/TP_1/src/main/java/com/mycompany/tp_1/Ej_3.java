/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_1;


/**
 *
 * @author Manuel
 */
public class Ej_3 {
    public static void main (String[] args) {
        int n1 = 6;
        int n2 = 5;
                
        int suma = n1 + n2;
        int resta = n1 - n2;
        int multiplicacion = n1 * n2;
        double division = (double) n1 / n2;
        int modulo = n1 % n2;

        System.out.println("La suma de " + n1 + " más " + n2 + " es: " + suma);
        System.out.println("La resta de " + n1 + " menos " + n2 + " es: " + resta);
        System.out.println("La multiplicación de " + n1 + " por " + n2 + " es: " + multiplicacion);
        System.out.println("La division de " + n1 + " sobre " + n2 + " es: " + division);
        System.out.println("El módulo de " + n1 + " dividido " + n2 + " es: " + modulo);
        
    }
    
}
