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
public class Ej__11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Ingrese dos palabras:");
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();
        
        if (p1.equals(p2)){
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras no son iguales");
        }
    }
}
