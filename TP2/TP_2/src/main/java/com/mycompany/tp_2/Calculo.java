/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;

/**
 *
 * @author Manuel
 */
public class Calculo {
    public static void main(String[] args) {
        OperacionMatematica cuenta = new OperacionMatematica();
        cuenta.setValor1(20);
        cuenta.setValor2(10);
        System.out.println("Suma: " +  cuenta.aplicarOperacion("+"));
        System.out.println("Resta: " +  cuenta.aplicarOperacion("-"));
        System.out.println("Multiplicacion: " +  cuenta.aplicarOperacion("*"));
        System.out.println("Division: " +  cuenta.aplicarOperacion("/"));
        
    } 
    
}
