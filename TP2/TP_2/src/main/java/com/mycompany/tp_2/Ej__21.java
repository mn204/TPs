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
public class Ej__21 {
    public static int suma (int n){
        int resultado;
        if (n == 1){
            resultado = 1;
        }else {
            resultado= n + suma(n-1);
        }
    return resultado;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 0;
        do {
            System.out.println("Ingrese un número mayor a 0");
            n = sc.nextInt();
        } while (n<=0);
        
        System.out.println("La suma de todos los valores hasta llegar al numero es: " + suma(n));
        
    }
}
