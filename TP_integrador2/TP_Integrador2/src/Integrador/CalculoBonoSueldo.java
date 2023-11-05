/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Integrador;

import java.util.List;
import java.util.Scanner;
import java.time.YearMonth; //obtener anio actual

/**
 *
 * @author Manuel
 */
public class CalculoBonoSueldo {
    static Scanner sc =new Scanner(System.in);
    static int anio = YearMonth.now().getYear();
    public static void main(String[] args) {
        
        String[][] haberes = {{"100","Presentismo", "9"} , {"101"," Titulo Profesional" , "9"} , {"102","Horas Extraordinarias", "M"} , {"103","Horas Nocturnas", "M"} , {"104"," Otros Haberes", "M"}};
        String [][] deducciones = {{"200"," Obra Social", "3"} , {"201","Jubilacion", "11"} , {"202","Sindicato", "2"} , {"203"," Seguro", "1.5"} , {"204","Otros", "M"}};
        List<Integer> codigosIngresados;
        System.out.println("Comenzar carga de bono de Sueldo......");
        System.out.println("---------------------------------------");
         do {            
            Empleado persona = new Empleado();  // instancia de nuevo empleado
            System.out.println("Ingrese el nombre del empleado: ");
            persona.setNombreEmpleado(sc.nextLine());
            System.out.println("Ingrese el CUIL del empleado: ");
            persona.setCuil(sc.nextLong());
            sc.nextLine();
            
             while (true) {  // ciclo para ingresar años y verificar que no hayan errores    
                 System.out.println("Ingrese el anio de ingreso del empleado: ");
                 int anioingreso = sc.nextInt();
                 sc.nextLine();
                 System.out.println("Ingrese el mes de liquidacion del empleado: ");
                 int mesliq = sc.nextInt();
                 sc.nextLine();
                 System.out.println("Ingrese el anio de liquidacion del empleado: ");
                 int anioliq = sc.nextInt();
                 sc.nextLine();
                 if (anioingreso >=anio || anioliq >= anio) {
                     System.out.println("Los anios de liquidacion o ingreso superan el anio actual comience nuevamente...");
                     continue;
                 }
                 System.out.println("Ingrese el sueldo basico");
                 double sueldobasico = sc.nextDouble();
                 sc.nextLine();
                 
                 double montoAntiguedad = (anio - anioingreso) * 0.02;
                 persona.setMontoAntiguedad(montoAntiguedad);
                 
                 BonoSueldo bono = new BonoSueldo();
                 bono.setEmpleado(persona);
                 bono.setMesLiquidacion(mesliq);
                 bono.setAnioLiquidacion(anioliq);
             }
            
             
             
             
             
             
             
             
             
        } while (true);
        
        
    }
    
    public static String completarConEspacios(String cadena){
    int cantidadEspacios = 20-cadena.length();
    for (int i = 0; i < cantidadEspacios; i++) {
        cadena+= " ";
        }
    return cadena;
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
