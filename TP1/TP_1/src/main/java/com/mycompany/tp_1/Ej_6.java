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
public class Ej_6 {
    public static void main (String[] args) {
        double iva = 0.21;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto:");
        double n = sc.nextDouble();
        
        double precioIva = n * iva + n;
        
        System.out.println("El precio del producto con iva es: " + precioIva);
    }
    
}
