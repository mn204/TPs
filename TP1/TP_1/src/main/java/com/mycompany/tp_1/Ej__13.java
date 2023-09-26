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
public class Ej__13 {
    
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      int divisores = 0;
       System.out.println("Ingrese un número.");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n ; i++) {
             if (n % i == 0) {
            divisores ++;
             }
        } 
        if (divisores == 2){
          System.out.println(n + " es número primo");
        } else {
            System.out.println(n + " no es número primo");
        }
    }
}
