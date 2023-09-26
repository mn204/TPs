/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosUnidimensionales;

/**
 *
 * @author Manuel
 */
/**. Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
del 1 al 100, de los cuales se desea saber:
a) su promedio aritmético
b) cuántos de los números son iguales al promedio aritmético
c) cuántos de los números son mayores que el promedio aritmético
d) cuántos de los números son menores que el promedio aritmético */
public class Ej_05 {
    public static void main (String[] args){
        int [] positivosPares = new int [20];
        int suma = 0;
        int contadorMayores = 0, contadorMenores = 0, contadorIguales = 0;
        double promedio;
        for (int i = 0; i < 20; i++){
            positivosPares[i] = new Double(Math.random() * 100).intValue();
            if (positivosPares[i] %2 != 0 || positivosPares[i] == 0){
                i--;
            }
        }
        for (int i = 0; i < 20; i++) {
            suma += positivosPares[i];
        }
        promedio = (double)suma/20;
        for (int i = 0; i < 20; i++) {
            if (positivosPares[i] == promedio) {
                contadorIguales++;
            }else if (positivosPares[i] > promedio) {
                contadorMayores++;
            }else {
                contadorMenores++;
            }
        }
        
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de nros iguales al promedio: " + contadorIguales);
        System.out.println("Cantidad de nros mayores al promedio: " + contadorMayores);
        System.out.println("Cantidad de nros menores al promedio: " + contadorMenores);
    }
}
