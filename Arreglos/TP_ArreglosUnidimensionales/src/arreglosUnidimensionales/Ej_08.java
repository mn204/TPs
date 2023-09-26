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
/**Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por
ejemplo:
45-9-8-6-45-23-21-74-96-32-45-25
Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en
un arreglo, y calcular la suma total de los elementos y el valor promedio calculado.*/
public class Ej_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de numeros separados por guiones medio");
        String numeros = sc.nextLine();
        String[] cadenaSeparada = numeros.split("-");
         int sumar = 0;
         int cantidad = 0;
         for (String elemento : cadenaSeparada) {
                int n = Integer.parseInt(elemento);
                sumar += n; 
                cantidad++; 
            }
         double promedio = (double) sumar / cantidad;
         System.out.println("La suma total es " + sumar);
         System.out.println("El promedio es " + promedio);
    }
}
