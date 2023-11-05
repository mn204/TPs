/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mutantes;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] dna = new String[6];
        System.out.println("Comienzo de programa mutantes....");
        
        for (int i = 0; i < 6; i++) {
            while (true) { // se abre un ciclo para ingresar la cadena
                System.out.println("Ingrese la fila nro " +  (i+1) + ": ");
                System.out.println("(Recuerde que solo debe ingresar 6 letras y solo pueden ser: A,T,C,G)");
                String base= sc.nextLine().toUpperCase();
                System.out.println("La cadena ingresada es: " + base);
                if (base.length() == 6){ //verifico que la cadena sea de 6
                    int letraValida = 0; // comienzo un contador para ver si se cumple la cantidad de letras validas
                    for (int j = 0; j < 6; j++){
                        char letra = base.charAt(j);
                        if (letra == 'A' || letra == 'T' || letra == 'C' || letra == 'G') {
                            letraValida++; //si se cumple aumenta en 1
                        }
                    }
                    if (letraValida == 6) { // al verificarse que son 6 letras validas se añade la base al array
                        System.out.println("La base ingresada es valida, añadiendo a la fila.");
                        dna[i]= base;
                        break; // se rompe el ciclo while para pasar a la otra posicion del array
                    } else {
                        System.out.println("La base ingresada contiene caracteres no validos, comience nuevamente");
                    }
                } else {
                    System.out.println("La cadena no tiene 6 caracteres, comience nuevamente.");
                }
            }
        }
        System.out.println("Se han encontrado mutantes: " + isMutant(dna));
    }

    static boolean isMutant(String[] dna){
        int contadorSecuencias = 0; //si se encuentra una secuencia valida aumenta en 1
        char[][] dna2D = new char[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                dna2D[i][j] = dna[i].charAt(j);// se cargan los valores de la matriz unidimensional en una de char de 2 dimensiones
            }
        }
        
        System.out.println("La matriz de adn es:");
        for (char[] cs : dna2D) {
            for (char c : cs) {
                System.out.print(c + "\t");
            }
            System.out.println("");   
        }
        
        for (int i = 0; i < 6; i++) { // veo las cadenas horizontales
            for (int j = 0; j <  3; j++) {
                if (dna2D[i][j] == dna2D[i][j + 1] && dna2D[i][j] == dna2D[i][j + 2] && dna2D[i][j] == dna2D[i][j + 3]) {
                    contadorSecuencias++;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) { // veo las cadenas verticales
            for (int j = 0; j < 6; j++) {
                if (dna2D[i][j] == dna2D[i + 1][j] && dna2D[i][j] == dna2D[i + 2][j] && dna2D[i][j] == dna2D[i + 3][j]) {
                    contadorSecuencias++;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) { // veo las cadenas diagonales
            for (int j = 0; j < 3; j++) {
                if (dna2D[i][j] == dna2D[i + 1][j + 1] && dna2D[i][j] == dna2D[i + 2][j + 2] && dna2D[i][j] == dna2D[i + 3][j + 3]) {
                    contadorSecuencias++;
                }
            }
        }
        
        return contadorSecuencias >= 2;
    }   
}
