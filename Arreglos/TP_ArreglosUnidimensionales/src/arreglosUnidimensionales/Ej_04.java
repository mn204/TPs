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
/**
 *Escriba una aplicación que:
a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
arreglo unidimensional.
b) determine y muestre el mayor de los números en el arreglo
c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
(diferencia entre el mayor y el menor) de los elementos en el arreglo
 */
public class Ej_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] arreglo = new double[20];
            double mayores = 0;
            double menores = 100000;
            
            System.out.println("Ingrese 20 numeros decimales:");
            for (int i= 0; i<20; i++){
                arreglo[i] = sc.nextDouble();
                if (arreglo[i] > mayores){
                mayores = arreglo[i];
                } else if (arreglo[i]< menores){
                menores = arreglo[i];
                }   
            }
        										
        double diferencia = mayores - menores;
        System.out.println("Nro mayor: " + mayores);
        System.out.println("Nro menor: " + menores);
        System.out.println("Diferencia: " + diferencia);
    } 
        
}

