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
public class Ej_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Ingrese número de 3 digitos:(100-999)");
            n = sc.nextInt();
        } while (n <100 || n > 999);

        int d1 = n%10;
        int d2 = (n/10) %10;
        int d3 = n/100;    
        
        int sumadigitos = d1+d2+d3;
        System.out.println("La suma de los 3 digitos es: " + sumadigitos);
    }
    
}
