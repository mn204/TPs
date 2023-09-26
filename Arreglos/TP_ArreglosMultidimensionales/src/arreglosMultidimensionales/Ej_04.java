/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosMultidimensionales;

import java.util.Scanner;

/**
 *
 * @author Manuel
 */
/**
Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o 
igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú 
con estas opciones:
a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
c) Suma de una columna que se pedirá al usuario (controlar que elija una 
correcta)
d) Sumar la diagonal principal
e) Sumar la diagonal inversa 
f) La media de s los valores de la matriz
IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se 
deberán de ejecutar, simplemente mostrar un mensaje que diga que debes 
rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de 
las opciones del menú.
*/
public class Ej_04 {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int X = 0;
        do{
            System.out.print(" Ingrese un valor entero X mayor o igual a 4 y menor o igual a 10 para crear una matrix (X,X): ");
            X = sc.nextInt();
        } while (X< 4 || X>10);
            menu(X,X);
        
        
        
        
    }
    
    public static void menu( int X, int Y){
        Scanner sc = new Scanner(System.in);
        int [][] matriz = crearArreglo(X,X);
        char opcion;
        boolean aSeCumple = false;
        do {
        System.out.println("Menu:");
        System.out.println("a) Rellenar TODA la matriz de números.(necesaria para ejecutar otras opciones)");
        System.out.println("b) Suma de una fila");
        System.out.println("c) Suma de una columna");
        System.out.println("d) Sumar la diagonal principal");
        System.out.println("e) Sumar la diagonal inversa");
        System.out.println("f) La media de los valores de la matriz");
        System.out.println("Ingrese que operacion desea realizar:");
        opcion = sc.next().charAt(0);
        switch (opcion) {
                case 'a':
                    matriz = llenarArreglo(matriz);
                    aSeCumple = true;
                    System.out.println("Matriz creada: ");
                    mostrarArreglo(matriz);
                    
                    break;
                case 'b':
                    if (!aSeCumple) {
                        System.out.println("Debe llenar la matriz primero.");
                    } else {
                        sumadorFilas(matriz);
                    }
                    break;
                case 'c':
                    if (!aSeCumple) {
                        System.out.println("Debe llenar la matriz primero.");
                    } else {
                        sumadorColumnas(matriz);
                    }
                    break;
                case 'd':
                    if (!aSeCumple) {
                        System.out.println("Debe llenar la matriz primero.");
                    } else {
                        sumadorDiagonal(matriz);
                    }
                    break;
                case 'e':
                    if (!aSeCumple) {
                        System.out.println("Debe llenar la matriz primero.");
                    } else {
                        sumadorDiagonalInversa(matriz);
                    }
                    break;
                case 'f':
                    if (!aSeCumple) {
                        System.out.println("Debe llenar la matriz primero.");
                    } else {
                        media(matriz);
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        
        } while (true);
        
            
        
       
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
    public static void mostrarArreglo(int [][] arreglo){
        for (int[] fila : arreglo) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
    
    public static void sumadorFilas(int [][]arreglo){
        Scanner sc2= new Scanner(System.in);
        System.out.print("Ingrese la fila que desea sumar: (0-" + (arreglo.length-1)+")");
        int fila = sc2.nextInt();
        int resultado = 0;
        if (fila < 0 || fila >= arreglo.length) {
            System.out.println("Fila no válida.");
        } else {
        for (int i = 0; i < arreglo[fila].length; i++) {
                resultado += arreglo[fila][i];
        }
        System.out.println("La suma de la fila selecionada es: " + resultado);
        }
    }
    public static void sumadorColumnas(int [][]arreglo){
        Scanner sc2= new Scanner(System.in);
        System.out.print("Ingrese la columna que desea sumar: (0-" + (arreglo.length-1)+")");
        int columna = sc2.nextInt();
        int resultado = 0;
        if (columna < 0 || columna >= arreglo[0].length) {
            System.out.println("Columna no válida.");
        } else {
        for (int i = 0; i < arreglo.length; i++) {
                resultado += arreglo[i][columna];
        }
        System.out.println("La suma de la columna selecionada es: " + resultado);
        }
    }
    public static void sumadorDiagonal(int [][]arreglo){
        int resultado = 0;
        for (int i = 0; i < (arreglo.length); i++) {
                resultado += arreglo[i][i];
             }
        System.out.println("La suma de la diagonal principal es: " + resultado);
    }
        
    public static void sumadorDiagonalInversa(int [][]arreglo){
        int resultado = 0;
        for (int i = 0; i < arreglo.length; i++) {
                resultado += arreglo[i][arreglo.length-1-i];
        }
        System.out.println("La suma de la diagonal inversa es: " + resultado);
    }
    public static void media (int [][]arreglo){
        double media = 0;
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                suma += arreglo[i][j];
                contador ++;
            }
        }
        media = (double)suma/contador;
        System.out.println("La media es: " + media);
    }
}
