/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones3;
import java.util.Scanner;
import java.util.HashSet;

/**
 *
 * @author Manuel
 * El algoritmo debe permitir cargar la marca y el modelo de una computadora y para cada
computadora indicar los N componentes de CPU que posee indicando la cantidad y el precio por
ejemplo componente “Memoria RAM 2 Gb”, marca “Kingston”, cantidad “2”, precio “8000”
Al finalizar la carga de los componentes mostrar la información cargada, y determinar el costo de la
computadora el cual será el equivalente de sumar el precio por la cantidad usada de cada
componente y el precio de venta sugerido para la computadora el cual será equivalente a el precio
de costo más el 40% del precio de costo si el precio de costo es menor a 50000, o equivalente a el
precio de costo más el 30% del precio de costo si el precio de costo es mayor a 50000.
Al terminar de mostrar los datos y precio de la computadora deberá preguntar si desea cotizar una
nueva computadora, si la respuesta es “SI” deberá iniciar nuevamente el programa, si la respuesta
es “NO”, terminar la ejecución del programa.
 */
public class CostoComputadora {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean salida = false;
        do {
            Computadora nuevaPC = new Computadora();
            System.out.print("Ingrese la marca de la computadora: ");
            nuevaPC.setMarca(sc.nextLine());
            
            System.out.println("Ingrese el modelo de la computadora");
            nuevaPC.setModelo(sc.nextLine());
            
            System.out.println("Comenzando ingreso de componentes.....");
            HashSet<ComponentesCPU> componentesNuevaPc = new HashSet<>();
            boolean salidaComponentes = false;
            
            while (!salidaComponentes) {                
                ComponentesCPU nuevoComponente = new ComponentesCPU();
                
                System.out.println("Ingrese nuevo componente: ");
                nuevoComponente.setComponente(sc.nextLine());
                
                System.out.println("Ingrese marca del componente: ");
                nuevoComponente.setMarca(sc.nextLine());
                
                System.out.println("Ingrese cantidad: ");
                nuevoComponente.setCantidad(sc.nextInt());
                sc.nextLine();
                
                System.out.println("Ingrese precio unitario del componente: ");
                nuevoComponente.setPrecio(sc.nextDouble());
                sc.nextLine();
                
                componentesNuevaPc.add(nuevoComponente);
                System.out.println("Componente Agregado!");
                System.out.println("----------------------------");
                
                System.out.print("Desea agregar otro componente:");      
                salidaComponentes = salidaSubmenu();
            }
            
            nuevaPC.setObjetosCPU(componentesNuevaPc);
            calcularCosto(nuevaPC);
            System.out.print("Desea cotizar una nueva computadora:");
            salida = salidaSubmenu();
    
        } while (!salida);   
    }
    
    public static String completarConEspacios(String cadena){
    int cantidadEspacios = 20-cadena.length();
    for (int i = 0; i < cantidadEspacios; i++) {
        cadena+= " ";
        }
    return cadena;
    }
    
    public static void calcularCosto(Computadora nuevaPC){
        double costoTotal = 0;
        double precioSugerido = 0;
        System.out.println("---------------- Computadora ----------------");
        System.out.println("Marca: " + nuevaPC.getMarca());
        System.out.println("Modelo: " + nuevaPC.getModelo());
        System.out.println("Compónentes:");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(completarConEspacios("Componente")+ completarConEspacios("Marca") + completarConEspacios("Cantidad")+ completarConEspacios("Precio X Unidad") + "Subtotal" );
        System.out.println("-----------------------------------------------------------------------------------------");

        for (ComponentesCPU comp : nuevaPC.getObjetosCPU()) {
            double subTotal = comp.getCantidad() * comp.getPrecio();
            System.out.println( completarConEspacios(comp.getComponente()) + completarConEspacios(comp.getMarca()) + completarConEspacios(String.valueOf(comp.getCantidad())) + completarConEspacios(String.valueOf(comp.getPrecio())) + subTotal);
            costoTotal += subTotal;
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(completarConEspacios(" ")+ completarConEspacios(" ") + completarConEspacios(" ")+ completarConEspacios("Costo Total") + costoTotal );
        
        if (costoTotal < 50000 ) {
            precioSugerido = costoTotal + costoTotal * 0.4;
        } else {
            precioSugerido = costoTotal + costoTotal * 0.3;
        }
        
        System.out.println("El precio sugerido es: " +  precioSugerido);
        
    }
    
    public static boolean salidaSubmenu(){
        boolean respuesta = false;
        do{
            System.out.print("(SI/NO): ");
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("si")) {
                break;
            } else if(opcion.equalsIgnoreCase("no")) {
                respuesta = true;
                break; 
            }else {
                System.out.println("Ingrese una respuesta valida!");
            }
        } while (true);
        return respuesta;
    }
}
