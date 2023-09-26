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
public class Ej__12 {
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      
     int n;
      do {
        System.out.println("Ingrese un día de la semana(1 al 7): ");
            n = sc.nextInt();
      } while (n < 1 || n > 7);
      
        switch (n) {
            case 1, 2, 3, 4, 5 -> System.out.println("Es día laboral");
            case 6, 7 -> System.out.println("No es día laboral");
            default -> throw new AssertionError();
        }
      
    }
}
