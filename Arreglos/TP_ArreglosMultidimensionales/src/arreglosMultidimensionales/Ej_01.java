/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosMultidimensionales;
import java.util.Scanner;
/**
 *
 * @author Manuel
 * Crea un programa que pida por pantalla cuatro países y a continuación tres
ciudades de cada uno de estos países. Los nombres de ciudades deben
almacenarse en un array multidimensional cuyo primer índice sea el número
asignado a cada país y el segundo índice el número asignado a cada ciudad. Es decir
el array deberá tener un tamaño de 4x4
Ejemplo de resultados que debe mostrar el programa:
País: Argentina Ciudades: Buenos Aires Cordoba La Plata
País: España Ciudades: Madrid Lugo Sevilla
País: Francia Ciudades: Paris Niza Lyon
País: Italia Ciudades: Roma Napoles Sicilia
 */
public class Ej_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] geografia = new  String[4][4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el pais nro " + (i+1));
            geografia[i][0] = sc.nextLine();
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese ciudad nro " + (j+1)+ " del pais ingresado");
                geografia[i][j+1] = sc.nextLine(); 
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Pais: " + geografia[i][0] + " Ciudades: " + geografia[i][1] + " " + geografia[i][2] + " " + geografia[i][3]);
        }
    }
    
    
}
