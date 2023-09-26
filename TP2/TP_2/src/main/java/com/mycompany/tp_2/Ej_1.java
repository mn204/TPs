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
public class Ej_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor decimal:");
        Double valorDecimal= sc.nextDouble();
        
        System.out.println("Utilizando variables por referencia:");
        System.out.println("Entero(short)" + valorDecimal.shortValue());
        System.out.println("Entero(int): " + valorDecimal.intValue());
        System.out.println("Entero(long): " + valorDecimal.longValue());
        System.out.println("Cadena(String): " + valorDecimal.toString());
        System.out.println("Decimal(float): " + valorDecimal.floatValue());
        
             
    }
}
