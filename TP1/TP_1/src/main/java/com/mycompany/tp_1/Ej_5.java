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
public class Ej_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println(n + " si es divisible entre 2");
          
        } else{
            System.out.println(n + " no es divisible entre 2");
        }
            
    }
    
}
