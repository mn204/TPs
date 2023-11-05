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
<<<<<<< HEAD
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
        for (String string : dna) {
            System.out.println(string);
        }
    }
=======
        String[] dna = new String[6];
        System.out.println("Ingrese el array de strings:");
        for (i = 0; i < 6; i++) {
        
        }
}

>>>>>>> f4dc27fb566a6e615d1c1638cba1698b4879eeda
    static boolean isMutant(String[] dna){
    return true;
    }

    
}
