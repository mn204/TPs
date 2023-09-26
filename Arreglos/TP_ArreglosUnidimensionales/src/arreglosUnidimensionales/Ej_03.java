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
public class Ej_03 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo:");
        int tamanio = sc.nextInt();
        int [] arreglo = new int[tamanio];
        int contadorFunciondistinta = 0;
        System.out.println("Ingrese el numero para llenar el arreglo con sus multiplos");
        int n = sc.nextInt();
        for( int i = 0; i <tamanio; i++){
            arreglo[i]= n * (i+1);
        }
        do{
            System.out.println(arreglo[contadorFunciondistinta]);
            contadorFunciondistinta ++;
        }while (contadorFunciondistinta<(tamanio));
    } 
    
}
