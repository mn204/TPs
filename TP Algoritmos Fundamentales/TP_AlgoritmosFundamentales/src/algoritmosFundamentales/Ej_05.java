/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosFundamentales;

import java.util.Scanner;

/**
 *
 * @author Manuel
 * Codifique un algoritmo que solicite un 2 valores enteros mayores o iguales a 2, que se
corresponden a cantidad de filas y columnas. Cree un arreglo de tamaño[X,Y]de tipo
entero, el tamaño se corresponde a los 2 valores enteros ingresados inicialmente.
Solicite al usuario que ingrese números enteros para cargar cada una de las celdas de
la matriz. Finalizada la carga calcule el promedio entero de los elementos asignados y
cargados en la matriz. Para terminar determine si el promedio calculado se encuentra
asignado en alguna de las celdas, si es así indique la posición o posiciones
correspondientes, caso contrario muestre el mensaje “No se encontró ninguna
coincidencia”.
Ejemplo: Ingreso 3 y 4 como valores enteros
Creo la matriz 3 filas por 4 columnas y cargo los valores
 */
public class Ej_05 {
    public static void main(String[] args) {
        int X, Y;
        boolean coincidencia = false;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print(" Ingrese un valor entero X mayor o igual a 2: ");
            X = sc.nextInt();
            System.out.print(" Ingrese un valor entero Y mayor o igual a 2: ");
            Y = sc.nextInt();
        } while (X<2 || X>10);
        
        
        System.out.println("Arreglo nro 1:");
        int [][] arreglo1= crearArreglo(X,Y);
        arreglo1= llenarArreglo(arreglo1);
        System.out.println("El promedio entero es: " + promedio(arreglo1));
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                if (promedio(arreglo1)== arreglo1[i][j]){
                    System.out.println("El valor " + promedio(arreglo1)+  " se encuentra en la posición con índice (" + i +"," + j +")");
                    coincidencia = true;
                }
            }
        }
        if (!coincidencia){
            System.out.println("No se encontro ninguna coincidencia.");
        }
        
    }
    
    public static int[][] crearArreglo (int X, int Y){
    int [][]resultado = new int[X][Y];
    return resultado;
    }
    public static int[][] llenarArreglo (int [][] arreglo){
        Scanner sc2 = new Scanner(System.in);
        int [][]resultado = arreglo;
        System.out.println("Ingrese los numeros para llenar el arreglo");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                resultado[i][j]= sc2.nextInt();
            }
        }
        return resultado;
    }
    public static int promedio (int [][]arreglo){
        int resultado = 0;
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                suma += arreglo[i][j];
                contador ++;
            }
        }
       resultado = suma/contador;
      return resultado;
    }
}
