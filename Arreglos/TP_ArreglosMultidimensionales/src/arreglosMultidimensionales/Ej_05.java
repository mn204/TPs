/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosMultidimensionales;

import java.util.Scanner;

/**
 *
 * @author Manuel
 * Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una máquina
expendedora de golosinas donde la columna 1 es la golosina, la columna 2 el precio
y la columna 3 la cantidad (stock) actual de golosinas
* Tendremos un pequeño menú con las siguientes opciones:
a. Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina
tiene golosinas en cada posición, identificados por su fila y columna, que
será lo que introduzca el usuario al pedir una golosina, por ejemplo si el
usuario teclea 2 significa que está pidiendo la golosina que está en la fila 2.
Al seleccionar una golosina debe disminuir la cantidad disponible de la
golosina. En caso de agotar el stock de la golosina deberá informar de la
situación al cliente y solicitarle que seleccione otra golosina.
b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual
disponible.
c. Rellenar golosinas: esta es una función exclusiva de un técnico por lo que
para su ejecución nos pedirá una contraseña, si el usuario escribe
“AdminXYZ” nos autorizara y pedirá la posición de la golosina y la cantidad a
recargar. La cantidad ingresada se sumara a la cantidad actual existente.
d. Apagar maquina: sale del programa, antes de salir mostrara las ventas
totales durante la ejecución del programa. Es decir la suma de todos los
precios de las golosinas seleccionadas desde el inicio del programa.
 */
public class Ej_05 {
    static String [][] golosina = {{"KitKat", "32", "10"}, {"Chicles", "2", "50"}, {"Caramelos de Menta", "2", "50"}, {"Huevo Kinder", "25", "10" }, {"Chetoos", "30", "10" }, {"Twix", "26", "10" }, {"M&M'S", "35", "10" }, {"Papas Lays", "40", "20" },{"Milkybar", "30", "10" },{"Alfajor Tofi", "20", "15" },{"Lata Coca", "50", "20" },{"Chitos", "45", "10"}};
    static int ventasTotales = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        mostrarGolosinas();
        menuMaquina();   
    }
    public static void menuMaquina() {
         char opcion;
         boolean salida= false;
        do {
        System.out.println("Menu:");
        System.out.println("-------------------------------------");
        System.out.println("a. Pedir golosina");
        System.out.println("b. Mostrar golosinas");
        System.out.println("c. Rellenar golosinas");
        System.out.println("d. Apagar maquina");
        System.out.println("-------------------------------------");
        System.out.print("Ingrese que operacion desea realizar: ");
        opcion = sc.next().charAt(0);
        switch (opcion) {
                case 'a':
                    pedirGolosina();
                    break;
                case 'b':
                    mostrarGolosinas();
                     break;
                case 'c':
                    llenarGolosinas();
                    break;
                case 'd':
                    System.out.println("Las ventas de la maquina fueron: $" +ventasTotales );
                    System.out.println("Apagando maquina .....");
                    salida = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (!salida);
    }
    
    public static void pedirGolosina(){
        int productoRestante= 0;
        boolean compraRealizada = false;
        do{ 
            System.out.print("Ingrese que golosina desea pedir: ");
            int pedido = sc.nextInt();
            codigoIncorrecto(pedido);
            if (Integer.parseInt(golosina[pedido][2]) > 0){
                ventasTotales+= Integer.parseInt(golosina[pedido][1]);
                productoRestante =Integer.parseInt(golosina[pedido][2])-1;
                golosina[pedido][2] = String.valueOf(productoRestante);
                System.out.println("Ha comprado " + golosina[pedido][0] + ".");
                System.out.println("Volviendo al menu ..........");
                compraRealizada = true;
            } else {
                    System.out.println("Stock agotado ingrese otra golosina: ");
                }
        }  while (!compraRealizada);
    }
    public static void mostrarGolosinas(){
        System.out.println("Golosina // Precio // Cantidad");
        System.out.println("--------------------------------");
        for (int i = 0; i < 12; i++) {
            System.out.println( i + ". " +golosina[i][0] + " // $" + golosina[i][1] + " // " + golosina[i][2] );
        }
    }
    public static void llenarGolosinas(){
        String contrasenia = "AdminXYZ";
        System.out.println("Ingrese contrasenia de la maquina: ");
        sc.skip("\n");
        String entrada = sc.nextLine();
        
        if (contrasenia.equals(entrada)) {
            System.out.print("Indique la posición de la golosina que desea recargar: ");
            int posicionRecarga = sc.nextInt();
            codigoIncorrecto(posicionRecarga);
            System.out.print("Indique la cantidad que desea recargar: ");
            int cantidadRecarga = sc.nextInt();
            golosina[posicionRecarga][2]= String.valueOf(Integer.parseInt(golosina[posicionRecarga][2]) + cantidadRecarga);
        } else {
            System.out.println("La contrasenia ingresada no es valida.");
        }
        System.out.println("Volviendo al menu ..........");
    }
    public static boolean codigoIncorrecto( int codigo){
        if (codigo <1 || codigo>11) {
            System.out.println("Error. El codigo ingresado no es valido.");
            System.out.println("Se volvera al menu .....");
            menuMaquina();
            return false;
        }
        return true;
        
    }
}
