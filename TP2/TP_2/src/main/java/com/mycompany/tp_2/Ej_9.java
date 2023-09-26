/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;

/**
 *
 * @author Manuel
 */
public class Ej_9 {
    public static void main(String[] args) {
        String a = "La lluvia en Mendoza es escasa";
         for (int i = 0; i < a.length(); i++) {
            char caracter = a.charAt(i);
            int codigo = (int) caracter;
            
            System.out.print(codigo + " ");
        }
    }
    
}
