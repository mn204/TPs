/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosMultidimensionales;

import java.util.Scanner;

/**
 *
 * @author Manuel
 * Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
entero que deberá ser ingresado por el usuario. A continuación cree un segundo
array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y] que será
el resultante de multiplicar cada una de las posiciones de las filas del array uno por
cada una de las posiciones de las columnas del array 2.
Muestre por pantalla cada uno de los arrays con sus valores.
 */
public class Ej_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de X: ");
        int X = sc.nextInt();
        System.out.print("Ingrese el valor de Y: ");
        int Y = sc.nextInt();
        System.out.println("Arreglo nro 1:");
        int [][] arreglo1= crearArreglo(X,Y);
        arreglo1= llenarArreglo(arreglo1);
        System.out.println("Arreglo nro 2:");
        int [][] arreglo2= crearArreglo(Y,X);
        arreglo2= llenarArreglo(arreglo2);
        int [][] arreglo3= crearArreglo(X,Y);
        arreglo3 = multiplicarArreglo(arreglo1, arreglo2, X, Y);
        System.out.println("Arreglo nro 1:");
        mostrarArreglo(arreglo1);
        System.out.println("Arreglo nro 2:");
        mostrarArreglo(arreglo2);
        System.out.println("Arreglo nro 3:");
        mostrarArreglo(arreglo3);

        
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
    public static int[][] multiplicarArreglo (int [][] arreglo1,int [][] arreglo2, int X, int Y){
         int [][]resultado = new int[X][Y];
         for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] =(arreglo1[i][j] * arreglo2[j][i]); 
            }
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
    
}
