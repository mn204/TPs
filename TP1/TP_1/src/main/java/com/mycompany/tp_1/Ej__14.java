/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_1;

import java.util.Scanner;
/**
 *
 * @author Manuel
 */
public class Ej__14 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int x = new Double(Math.random() * 100).intValue(); 
       int intentos = 0;
       int n;
       boolean correcto = false;
       System.out.println("Número aleatorio generado: " + x);
       
       while (!correcto){
       System.out.println("Ingrese un número del 0 al 100");
            n = sc.nextInt();
            intentos ++;
            if (n == x){
                System.out.println("El número ingresado es correcto. Cantidad de intentos: " + intentos);
                correcto = true;                
            }else if (n > x){
                System.out.println("El número ingresado es mayor.");
            } else if (n < x){
                System.out.println("El número ingresado es menor.");
            }

       }
       
    }
}
