/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosMultidimensionales;

import java.util.Scanner;

/**
 *
 * @author Manuel
 * 
 * Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o
igual a 10. Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite los 
valores necesarios para cargar cada una de las celdas de la matriz. Muestre por
pantalla la matriz resultante.
Al finalizar la carga sume cada una de las columnas del array y asigne los resultados
en una nueva matriz de una dimensión, finalmente sume los valores de esta última
matriz y muestre el resultado por pantalla.
 */
public class Ej_03 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int X = 0;
        do{
            System.out.print(" Ingrese un valor entero X mayor o igual a 3 y menor o igual a 10: ");
            X = sc.nextInt();
        } while (X<3 || X>10);
        
        int [][] matriz = crearArreglo(X,X);
        matriz= llenarArreglo(matriz);
        int [] columnasSumadas= new int[X];
        columnasSumadas = sumadorColumnas(matriz);
        int sumaFinal= 0;
        sumaFinal = sumadorFilas(columnasSumadas);
        mostrarArreglo(matriz);
        System.out.println("Las columnas sumadas: ");
        mostrarArregloUnidimensional(columnasSumadas);
        System.out.println("Los valores sumados: " + sumaFinal);      
              
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
    public static int [] sumadorColumnas( int [][] arreglo){
        int [] resultado = new int [arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                resultado[j]+= arreglo[i][j];
            }
        }
        return resultado;
    }
    public static int sumadorFilas(int []arreglo){
        int resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
                resultado += arreglo[i];
        }
        return resultado;
    }
    
    public static void mostrarArreglo(int [][] arreglo){
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    public static void mostrarArregloUnidimensional(int [] arreglo){
            for (int valor : arreglo) {
                System.out.print( valor + " ");
            }
            System.out.println();
    }
								
}
