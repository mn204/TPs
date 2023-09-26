/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosFundamentales;

import java.util.Scanner;

/**
 *
 * @author Manuel
 * - Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos
enteros. Finalizada la carga de los 20 elementos el programa debe solicitar como se
desea ordenar el array ASCENDENTE O DESCENDENTE y que método de ordenamiento
aplicar (inserción, burbuja, selección), según las opciones elegidas aplique el
algoritmos fundamental de ordenamiento que corresponda. Muestre por pantalla el
array original desordenado y su resultante ordenado según las opciones elegidas.
 */
public class Ej_04 {
    public static void main(String[] args) {
        int [] desordenados= new int [20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros enteros: ");
        for (int i = 0; i < 20; i++) {
           desordenados[i]= sc.nextInt();
        }
        System.out.print("Si desea ordenar el arreglo ascendente ingrese 'ASC', si lo desea ordenar descendente ingrese 'DESC': ");
        sc.skip("\n");
        String tipoDeOrden = sc.nextLine();
        System.out.print("Ingrese que metodo de orden desea realizar: 'insercion' , 'burbuja' , 'seleccion' : ");
        String opcion = sc.nextLine();
        System.out.println("Arreglo desordenado: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(desordenados[i]);
        }
        switch (opcion) {
            case "insercion":
                Ej_03.insercion(desordenados, tipoDeOrden);
                break;
            case "burbuja":
                Ej_03.burbuja(desordenados, tipoDeOrden);
                break;
            case "seleccion":
                Ej_03.seleccion(desordenados, tipoDeOrden);
                break;
            default:
                throw new AssertionError();
        }
        
    }
}
