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
public class Ej__22 {
    public static int sumaRecursiva (int n){
       
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumaRecursiva(n / 10);
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
            System.out.println("Ingrese un número");
            n = sc.nextInt();
        
        System.out.println("La suma de los digitos es " + sumaRecursiva(n));
        
    }
}
