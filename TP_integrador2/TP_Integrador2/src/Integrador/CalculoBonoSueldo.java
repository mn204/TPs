/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Integrador;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class CalculoBonoSueldo {
    static Scanner sc =new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String[][] haberes = {{"100","Presentismo", "9"} , {"101"," Titulo Profesional" , "9"} , {"102","Horas Extraordinarias", "M"} , {"103","Horas Nocturnas", "M"} , {"104"," Otros Haberes", "M"}};
        String [][] deducciones = {{"200"," Obra Social", "3"} , {"201","Jubilacion", "11"} , {"202","Sindicato", "2"} , {"203"," Seguro", "1.5"} , {"204","Otros", "M"}};
        List<Integer> codigosIngresados;
        System.out.println("Comenzar carga de bono de Sueldo......");
        System.out.println("---------------------------------------");
         do {            
            Empleado persona = new Empleado();
             System.out.println("Ingrese el nombre del empleado: ");
            persona.setNombreEmpleado(sc.nextLine());
           
             
             
             
             
             
             
             
             
        } while (true);
        
        
    }
}
