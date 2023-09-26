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
public class Ej__23 {
    
    public static String invertida (String frase){
        if (frase.isEmpty()){
            return frase;
        } else {
            char primerLetra = frase.charAt(0);
            String fraseResto = frase.substring(1);
            return invertida(fraseResto) + primerLetra;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");
        String frase = sc.nextLine();
        
        System.out.println("La cadena invertida es: " + invertida(frase));
        
    }
}
