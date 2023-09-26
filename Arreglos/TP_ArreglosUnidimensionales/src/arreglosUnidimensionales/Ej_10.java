/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Ej_10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] arreglo1 = new int[5];
        int[] arreglo2 = new int[10];
        int[] arreglo3 = new int[5];
        System.out.println("Ingrese 5 numeros del arreglo 1:");
        for(int i = 0; i< 5; i++){
            arreglo1[i]= sc.nextInt();
        }
        System.out.println("Ingrese 10 numeros del arreglo 2:");
        for(int i = 0; i< 10; i++){
            arreglo2[i]= sc.nextInt();
        }
        
         for(int i = 0; i< 5; i++){
              for(int j = 0; j < 10; j++){
              arreglo3[i]+= (arreglo1[i] * arreglo2[j]);
              }
        }
    }
}
