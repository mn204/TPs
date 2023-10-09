/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class MenuRestaurant {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Plato> platosMenu = new ArrayList<>();
        boolean salidaPlatos = false;
        System.out.println("Comenzando programa para ingresar nuevos platos al menu.... ");
        do {
            
            Plato nuevoPlato = new Plato();
            System.out.println("Ingrese un nuevo plato para agregar al menu: ");
            String nombrePlatoNuevo = sc.nextLine();
            nuevoPlato.setNombreCompleto(nombrePlatoNuevo);
            
            
            do {
                System.out.println("El plato es una bebida? Si/No ");        
                String bebida = sc.nextLine();   
                if (bebida.equalsIgnoreCase("si")) {
                    nuevoPlato.setEsBebida(true);
                    break;
                } else if (bebida.equalsIgnoreCase("no")) {
                    nuevoPlato.setEsBebida(false);
                    break;
                } else {
                    System.out.println("Ingrese una respuesta valida!");
                }
            } while (true);
            
            System.out.println("Ingrese el precio del plato: ");
            double precioPlatoNuevo = sc.nextDouble();
            sc.nextLine();
            
            nuevoPlato.setPrecio(precioPlatoNuevo);
            ArrayList<Ingrediente> ingredientesNuevoPlato = new  ArrayList<>();
            
            
            while (!nuevoPlato.isEsBebida()) {
                

                System.out.println("Comienzo de ingreso de ingredientes....");
                Ingrediente nuevoIngrediente = new Ingrediente();
                System.out.println("Ingrese Ingrediente: ");
                String nombreIngrediente = sc.nextLine();
                nuevoIngrediente.setNombre(nombreIngrediente);
                
                System.out.println("Ingrese cantidad del ingrediente: ");
                double cantidadIngrediente = sc.nextDouble();
                sc.nextLine();
                nuevoIngrediente.setCantidad(cantidadIngrediente);
                
                boolean salidaUnidad = true;
                while (salidaUnidad) {
                    System.out.println("Ingrese la unidad de medida:");
                    System.out.println("Opciones:");
                    System.out.println("kilogramos , gramos, unidad/es, ml .");
                    String unidadMedida = sc.nextLine();
                    switch (unidadMedida.toLowerCase()) {
                    case "kilogramos":
                        nuevoIngrediente.setUnidadDeMedida(unidadMedida);
                        salidaUnidad = false;
                        break;
                    case "gramos":
                        nuevoIngrediente.setUnidadDeMedida(unidadMedida);
                        salidaUnidad = false;
                        break;
                    case "unidad":
                        nuevoIngrediente.setUnidadDeMedida(unidadMedida);
                        salidaUnidad = false;
                        break;
                    case "unidades":
                        nuevoIngrediente.setUnidadDeMedida(unidadMedida);
                        salidaUnidad = false;
                        break;
                    case "ml":
                        nuevoIngrediente.setUnidadDeMedida(unidadMedida);
                        salidaUnidad = false;
                        break;
                    default:
                        System.out.println("Ingrese un valor valido!");
                    }
                }
                
                ingredientesNuevoPlato.add(nuevoIngrediente);
                String otroIngrediente;
                do {
                    System.out.println("Desea agregar otro ingrediente al plato? Si/no");      
                    otroIngrediente = sc.nextLine();   
                    if (otroIngrediente.equalsIgnoreCase("si") || otroIngrediente.equalsIgnoreCase("no") ) {
                        break;
                    } else {
                        System.out.println("Ingrese una respuesta valida!");
                    }
                } while (true);

                if (otroIngrediente.equalsIgnoreCase("no")) {
                    nuevoPlato.setIngredientes(ingredientesNuevoPlato);
                    break;
                } 
            }
            
        platosMenu.add(nuevoPlato);
        
        do {
            System.out.println("Desea agregar otro Plato: Si/no");      
            String otroPlato = sc.nextLine();   
            if (otroPlato.equalsIgnoreCase("si")) {
                break;
            } else if(otroPlato.equalsIgnoreCase("no")) {
                salidaPlatos = true;
                break; 
            }else {
                System.out.println("Ingrese una respuesta valida!");
            }
            } while (true);
        
        } while (!salidaPlatos);
        
        System.out.println("------------------------- MENU -------------------------");
        for (Plato plato : platosMenu) {
            System.out.println(plato.getNombreCompleto());
            System.out.println("Precio: $ "+ plato.getPrecio());
            if (!plato.isEsBebida()){
            System.out.println("Ingredientes:");
            System.out.println(completarConEspacios("Nombre")+ completarConEspacios("Cantidad") + "Unidad de Medida");
            System.out.println("________________________________________________________");
            for (Ingrediente ingrediente : plato.getIngredientes()) {
                System.out.println(completarConEspacios(ingrediente.getNombre()) + completarConEspacios(String.valueOf(ingrediente.getCantidad())) + ingrediente.getUnidadDeMedida());
            }
            }
            System.out.println("--------------------------------------------------------");

        }
    }
    
    public static String completarConEspacios(String cadena){
        int cantidadEspacios = 20-cadena.length();
        for (int i = 0; i < cantidadEspacios; i++) {
            cadena+= " ";
        }
       return cadena;
    } 
    
}
