/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosFundamentales;

/**
 *
 * @author Manuel
 */
public class Ej_02 {
    public static void main(String[] args) {
        int A [] = {4,51,3,43,32,4,3,4,21,34} ;
        System.out.println("Ordenamiento por inserción");
        for (int i = 0; i < 10; i++) {
            int valor = A[i];
            int j= i-1;
            while (j>=0 && A[j] > valor ) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = valor;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(A[i]);
        }
        
        System.out.println("Algoritmo de la burbuja");
       int n = A.length;
       boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if(A[i-1] > A[i]) {
                    int aux = A[i-1];
                    A[i-1] = A[i];
                    A[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado == true);
        for (int i = 0; i < 10; i++) {
            System.out.println(A[i]);
        }
        System.out.println("Ordenamiento por selección");
        for (int i = 1; i < n-1; i++) {
            int minimo = i;
            for (int j = i+1; j < n; j++) {
                if(A[j] > A[minimo]) {
                    minimo= j;
                }
                int aux = A[minimo];
                A[minimo] = A[j];
                A[j] = aux;
            }     
        }
          for (int i = 0; i < 10; i++) {
            System.out.println(A[i]);
        }
        System.out.println("Búsqueda secuencial");
        int [] L= {2,5,3,4,5,13,3,4,3};
        int a = 2;
        n = L.length;
        boolean seEncontro = false;
        for (int i = 0; i < n-1; i++) {
            if (L[i] == a ){
                seEncontro = true;
            }   
        }
        System.out.println(seEncontro);
    }
    
}
