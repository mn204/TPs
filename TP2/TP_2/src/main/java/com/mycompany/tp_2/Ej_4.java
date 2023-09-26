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
public class Ej_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valor de dinero:");
        double dinero = sc.nextDouble();
        //billetes
        int b200= 0,b100= 0,b50= 0,b20= 0,b10= 0,b5= 0,b2= 0,b1= 0;
        //monedas
        int m050 = 0,m025 = 0 ,m010 = 0, m005 = 0;
        
            while (dinero >= 200) {
            dinero = dinero-200;
            b200++;
        }
            while (dinero >= 100) {
            dinero = dinero-100;
            b100++;
        }
            while (dinero >= 50) {
            dinero = dinero-50;
            b50++;
        }
            while (dinero >= 20) {
            dinero = dinero-20;
            b20++;
        }
            while (dinero >= 10) {
            dinero = dinero-10;
            b10++;
        }
            while (dinero >= 5) {
            dinero = dinero-5;
            b5++;
        }
            while (dinero >= 2) {
            dinero = dinero-2;
            b2++;
        }
            while (dinero >= 1) {
            dinero = dinero-1;
            b1++;
        }
            while (dinero >= 0.5) {
            dinero = dinero-0.5;
            m050++;
        }
            while (dinero >= 0.25) {
            dinero = dinero-0.25;
            m025++;
        }
            while (dinero >= 0.1) {
            dinero = dinero-0.1;
            m010++;
        }
            while (dinero >= 0.05) {
            dinero = dinero-0.05;
            m005++;
        }
        
        System.out.println("Se necesitan:");
        if (b200 > 0) {
            System.out.println("Billetes 200: " + b200);
        }
        if (b100 > 0) {
            System.out.println("Billetes 100: " + b100);
        }
        if (b50 > 0) {
            System.out.println("Billetes 50: " + b50);
        }
        if (b20 > 0) {
            System.out.println("Billetes 20: " + b20);
        }
        if (b10 > 0) {
            System.out.println("Billetes 10: " + b10);
        }
        if (b5 > 0) {
            System.out.println("Billetes 5: " + b5);
        }
        if (b2 > 0) {
            System.out.println("Billetes 2: " + b2);
        }
        if (b1 > 0) {
            System.out.println("Billetes 1: " + b1);
        }
        if (m050 > 0) {
            System.out.println("Monedas 0,5: " + m050);
        }
        if (m025 > 0) {
            System.out.println("Monedas 0,25: " + m025);
        }
        if (m010 > 0) {
            System.out.println("Monedas 0,10: " + m010);
        }
        if (m005 > 0) {
            System.out.println("Monedas 0,05: " + m005);
        }       


    }
    
}
