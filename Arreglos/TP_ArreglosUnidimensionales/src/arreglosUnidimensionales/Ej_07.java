/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosUnidimensionales;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
/**Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros, luego cree
dos nuevos arreglos y asigne al primero los números ingresados por el usuario de forma
ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla.*/
public class Ej_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] enteros = new int [10];
        System.out.println("Ingrese 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nro " + (i+1));
            enteros[i] = sc.nextInt();
        }
        int [] ascendente= new int[10];
        int [] descendente = new int[10];
        
        for (int i = 0; i < 10; i++) {
            ascendente[i] = enteros[i];
            descendente[i] = enteros[i];
        }
       Arrays.sort(ascendente);
       Arrays.sort(descendente);
        for (int i = 0; i < 10; i++) {
            descendente[i]= ascendente[(10-i-1)]; 
        }
         System.out.println("Arreglo ascendente:");
         for (int i = 0; i < 10; i++) {
            System.out.println(ascendente[i]);
        }
         System.out.println("Arreglo descendente:");
         for (int i = 0; i < 10; i++) {
            System.out.println(descendente[i]);
        }

       
    }
}
