/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosUnidimensionales;
import java.util.Scanner;
import java.util.Random;

        
/**
 *
 * @author Manuel
 */
/** Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado
aleatoriamente mediante la función java random.
Realice una búsqueda secuencial de la siguiente forma:
- se lee el valor que se desea buscar,
- se compara la primera posición;
- si son iguales,
- fin de la búsqueda.
- De lo contrario, compararlo con la segunda posición, y así sucesivamente.
- Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje
apropiado.
- Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por
primera vez.
*/
public class Ej_06 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int [] arreglo = new int [50];
        int posicion = 0;
       

        for (int i = 0; i < 50; i++) {
            arreglo[i] = rnd.nextInt(100);
        }
        
        System.out.println("Ingrese el numero que desea buscar:");
        int n = sc.nextInt();
        for (int i = 0; i < 50; i++) {
            if (n == arreglo[i]){
                posicion = i ;
                System.out.println("El numero ingresado se encuentra por primera vez en la posicion " + posicion);
                i = 50;
            }
        }
        if (n != arreglo[posicion]){
            System.out.println("El numero ingresado no se encuentra en ninguna posicion");
        }
        
    }
    
}
