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
public class OperacionesFraccion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numerador y denominador de la primera fraccion:");
        Fraccion f1 = new Fraccion(sc.nextInt(),sc.nextInt());
        System.out.println("Ingrese el numerador y denominador de la segunda fraccion:");
        Fraccion f2 = new Fraccion(sc.nextInt(),sc.nextInt());
                
        Fraccion suma = new Fraccion();        
        suma = suma.sumarFracciones(f1, f2);
        Fraccion resta = new Fraccion();        
        resta = resta.restarFracciones(f1,f2);
        Fraccion multiplicacion  = new Fraccion();
        multiplicacion = multiplicacion.multiplicarFracciones(f1,f2);
        Fraccion division= new  Fraccion();
        division = division.dividirFracciones(f1, f2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
