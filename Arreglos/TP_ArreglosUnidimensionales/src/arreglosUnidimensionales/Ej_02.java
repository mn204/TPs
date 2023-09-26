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
public class Ej_02 {
    public static void main(String[] args) {
        
        int [] arreglo = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.println("Ingrese el numero del arreglo en posicion " + (i+1));
            arreglo[i] = sc.nextInt();    
        }
        for (int i = 0; i < 5; i++){
            System.out.println("El numero del arreglo en posicion " + (i+1) + " es: " + arreglo[i]);
        }
        
    }
}
