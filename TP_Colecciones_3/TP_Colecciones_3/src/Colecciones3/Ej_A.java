/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones3;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Manuel
 * A- HashMap
Empleando la clase HashMap()(con un String de clave y un entero largo de valor) implemente una
agenda de teléfonos.
HashMap<String, Long> agenda = new HashMap<String, Long>();
El algoritmo debe contener un menú inicial con 3 opciones
1- Cargar Datos en la Agenda
2- Buscar Teléfono por Nombre
3- Listar Agenda
El usuario deberá elegir que desea hacer:
Cargar Datos en la Agenda
Debe solicitar el nombre completo de la persona y su respectivo teléfono, el nombre será usado
como clave y el teléfono como valor del HashMap.
Se deben poder solicitar todas las personas que se deseen hasta que se indique que no se quiere
seguir cargando, cada vez que se ingrese una nueva persona se deberá validar si la clave ya existe
(puede usar la función containsKey), si existe deberá informar de la situación al usuario, si no existe
se agregara al HashMap. Al terminar la carga se debe mostrar el menú nuevamente.
Buscar Teléfono por Nombre
Se debe solicitar el nombre de la persona a buscar, si no se encuentra mostrar el mensaje “La
persona buscada no se encuentra en la agenda”, caso contrario mostrar por pantalla el teléfono de
la persona que se encontró en el HashMap. Al finalizar mostrar nuevamente el menú.
Listar Agenda
Recorrer la totalidad de elementos que posee el HashMap agenda, mostrando cada uno de los
nombres y teléfonos que se encuentran almacenados. Al finalizar volver al menú.
 */
public class Ej_A {
    static Scanner sc =  new Scanner(System.in);
    static HashMap<String, Long> agenda = new HashMap<String, Long>(); 
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        String opcion;
        do {
        System.out.println("""
                           -------------------------------
                           Menu Agenda
                           1- Cargar Datos en la Agenda
                           2- Buscar Teléfono por Nombre
                           3- Listar Agenda
                           -------------------------------
                           """);
        System.out.print("Ingrese que desea realizar: ");
        opcion = sc.nextLine();
        switch (opcion) {
                case "1":
                    System.out.println("Inicializando carga de Datos.....");
                    cargarAgenda();
                    break;
                case "2":
                    buscarAgenda();
                     break;
                case "3":
                    listarAgenda();
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (true);
    }
    
    public static void cargarAgenda(){
        String nombre;
        Long telefono;
        boolean salida = false;
        while (!salida) {
            System.out.print("Ingrese el nombre del contacto a agendar: ");
            nombre = sc.nextLine();            
            if (agenda.containsKey(nombre)) {
                System.out.println("Ese nombre ya esta agendado.");
                System.out.println("Desea agregar otro contacto(si,no)");
                String opcion= sc.nextLine();
                if (opcion.equalsIgnoreCase("no")){
                    salida = true;
                } 
            } else {
                System.out.print("Ingrese su numero de telefono: ");
                telefono = sc.nextLong();
                sc.nextLine();
                agenda.put(nombre, telefono);
                System.out.println("Contacto Agregado Exitosamente.");
                System.out.println("Desea agregar otro contacto(si,no)");
                String opcion= sc.nextLine();
                if (opcion.equalsIgnoreCase("no")){
                    salida = true;
                }   
            }
        }    
    }
    
    public static void buscarAgenda(){
        String nombreBuscado;
        System.out.print("Ingrese el nombre del contacto a buscar: ");
        nombreBuscado =sc.nextLine();
        if (agenda.containsKey(nombreBuscado)){
            System.out.println("EL numero de telefono es: " + agenda.get(nombreBuscado) );
        } else {
            System.out.println("La persona buscada no se encuentra en la agenda");
        }
    }
    
    public static void listarAgenda(){
        
        if (agenda.isEmpty()){
            System.out.println("La agenda esta vacia.");
        } else{
            System.out.println("----- Agenda de Telefonos -----");
            for(String i : agenda.keySet()){
            System.out.println("Nombre: " + i + " Telefono: " + agenda.get(i));
            }
        }
    }
}
