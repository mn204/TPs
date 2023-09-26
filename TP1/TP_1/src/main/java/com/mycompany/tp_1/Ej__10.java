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
public class Ej__10 {
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
        int n;
        do{
        System.out.println("Ingrese un número mayor o igual a 0");
        n = sc.nextInt();
        } while(n < 0);
       
       System.out.println("El número ingresado es: " + n);
    }
}
