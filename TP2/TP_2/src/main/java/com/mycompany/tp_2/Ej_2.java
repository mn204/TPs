/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;

/**
 *
 * @author Manuel
 */
public class Ej_2 {
    public static void main(String[] args) {
        System.out.println("Asigne dos variables 'int' a y b, con valores de 127. Cree una variable resultado de tipo 'byte' que es la suma de a y b.");
        int a = 127;
        int b = 127;
        byte resultado = (byte) (a + b);
        System.out.println("Resultado: " + resultado +  "(incorrecto"); 
        System.out.println("Ocurre un overflow(desbordamiento), byte no puede almacenar valores mayores a 127 entonces se reinicia y empieza a contar en el valor minimo.");
        System.out.println("Puedo resolverlo con una variable short que acepta valores mas grandes");
        short resultado2 = (short) (a+b);
        System.out.println("Resultado con 'short': " + resultado2 + "(correcto)");
              
    }
}

