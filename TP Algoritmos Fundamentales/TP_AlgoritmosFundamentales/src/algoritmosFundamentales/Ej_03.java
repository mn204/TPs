/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmosFundamentales;

/**
 *
 * @author Manuel
 */
public class Ej_03 {
    static int A [] = {4,51,3,43,32,4,3,4,21,34} ;
    public static void main(String[] args) {
        insercion(A, "ASC");
        insercion(A, "DESC");
        burbuja(A, "ASC");
        burbuja(A, "DESC");
        seleccion(A, "ASC");
        seleccion(A, "DESC");
        
 
    }
    public static void insercion(int [] arreglo, String orden ){
        System.out.println("Ordenamiento por inserción " + orden);
        for (int i = 0; i < 10; i++) {
            int valor = arreglo[i];
            int j= i-1;
            if (orden.equals("ASC")){
                while (j>=0 && arreglo[j] > valor ) {
                arreglo[j+1] = arreglo[j];
                j--;
                }
            }else if(orden.equals("DESC")){
                while (j>=0 && arreglo[j] < valor ) {
                arreglo[j+1] = arreglo[j];
                j--;
                }  }
            arreglo[j+1] = valor;
            }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    public static void burbuja(int [] arreglo, String orden){
       System.out.println("Algoritmo de la burbuja " + orden );
       int n = arreglo.length;
       boolean intercambiado;
        do {
            intercambiado = false;
            for (int i = 1; i < n; i++) {
                if((orden.equals("ASC") && arreglo[i - 1] > arreglo[i]) || (orden.equals("DESC") && arreglo[i - 1] < arreglo[i])) {
                    int aux = arreglo[i-1];
                    arreglo[i-1] = arreglo[i];
                    arreglo[i] = aux;
                    intercambiado = true;
                }
            }
        } while (intercambiado == true);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
    public static void seleccion(int [] arreglo, String orden){
        int n = arreglo.length;
        System.out.println("Ordenamiento por selección " + orden);
        for (int i = 0; i < n-1; i++) {
            int minimo = i;
            for (int j = i+1; j < n; j++) {
                if((orden.equals("DESC") && arreglo[j] < arreglo[minimo]) || (orden.equals("ASC") && arreglo[j] > arreglo[minimo])) {
                    minimo= j;
                }
                int aux = arreglo[minimo];
                arreglo[minimo] = arreglo[j];
                arreglo[j] = aux;
            }     
        }
          for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
    
}
   

