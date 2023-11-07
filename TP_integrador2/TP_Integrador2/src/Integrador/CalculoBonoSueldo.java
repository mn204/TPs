/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Integrador;

import java.util.List;
import java.util.Scanner;
import java.time.YearMonth; 
import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class CalculoBonoSueldo {
    static Scanner sc =new Scanner(System.in);
    static int anio = YearMonth.now().getYear(); //obtener anio actual
    public static void main(String[] args) {
        
        String[][] haberes = {{"100","Presentismo", "9"} , {"101"," Titulo Profesional" , "9"} , {"102","Horas Extraordinarias", "M"} , {"103","Horas Nocturnas", "M"} , {"104"," Otros Haberes", "M"}};
        
        String [][] deducciones = {{"200"," Obra Social", "3"} , {"201","Jubilacion", "11"} , {"202","Sindicato", "2"} , {"203"," Seguro", "1.5"} , {"204","Otros", "M"}};
        
        
        System.out.println("Comenzar carga de bono de Sueldo......");
        System.out.println("---------------------------------------");
        
        Empleado persona = new Empleado();  // instancia de nuevo empleado
        System.out.println("Ingrese el nombre del empleado: ");
        persona.setNombreEmpleado(sc.nextLine());
        
        System.out.println("Ingrese el CUIL del empleado: ");
        persona.setCuil(sc.nextLong());
        sc.nextLine();
        
        int anioingreso, mesliq, anioliq;
        while (true) {  // ciclo para ingresar años se corrigio aqqui
            System.out.println("Ingrese el anio de ingreso del empleado: ");
            anioingreso = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Ingrese el mes de liquidacion del empleado: ");
            mesliq = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Ingrese el anio de liquidacion del empleado: ");
            anioliq = sc.nextInt();
            sc.nextLine();
            
            if (anioingreso >=anio || anioliq >= anio) {
                System.out.println("Los anios de liquidacion o ingreso superan el anio actual comience nuevamente...");
            } else {
                System.out.println("Ingrese el sueldo basico");
                double sueldobasico = sc.nextDouble();
                sc.nextLine();
                double montoAntiguedad = ((anio - anioingreso) * 0.02) * sueldobasico;
                persona.setSueldoBasico(sueldobasico);
                persona.setMontoAntiguedad(montoAntiguedad);
                persona.setAnioIngreso(anioingreso);
                List<BonoSueldo> bonos= new ArrayList<>();
                persona.setBonos(bonos);
                break;
            }
        }
        
        boolean salidaBonos = false;
        
        do {      // se crea un nuevo bono de sueldo para el empleado
           List<Integer> codigosIngresados = new ArrayList<Integer>(); // se mueve la lista de codigos al bucle ya que al intetar agregar un nuevo bono como esta lista estaba afuera nunca se reiniciaba y siempre estaba llena
           BonoSueldo bono = new BonoSueldo();
           bono.setEmpleado(persona);
           bono.setMesLiquidacion(mesliq);
           bono.setAnioLiquidacion(anioliq);

           String [][] bonoCalculado = new String[10][4]; // se crea el array
           System.out.println("----------------------------------------------------------------------------------------");
           System.out.println("Comenzando carga de haberes....");
           System.out.println("----------------------------------------------------------------------------------------");
           
           while (true) {     // comienza el ciclo de carga de haberes.            
               double sumaHaberes = 0; //variable local del ciclo para llevar la suma por cada bono  
               System.out.println("Ingrese los Haberes del Empleado");
                System.out.println("Ingrese el código del ítem: (si desea salir ingrese el codigo '000')");
                Integer codIngresado = sc.nextInt();
                sc.nextLine();
                if (codIngresado == 000){ //verifico codigo de salida y que haya al menos 1 haber cargado
                    if (codigosIngresados.isEmpty()) {
                        System.out.println("Debe ingresar al menos 1 haber, Reiniciando.....");
                        System.out.println("----------------------------------------------------------------------------------------");
                        continue;
                    } else{
                        System.out.println("Codigo de salida ingresado, saliendo de la carga de haberes");
                        bono.setSumaHaberes(sumaHaberes); // se guarda la suma antes de salir
                        break; // el unico break que sale de la carga de haberes
                    }
                }

                if (codigosIngresados.contains(codIngresado)){ //verifico que no haya el codigo en la lista
                    System.out.println("El código ya ha sido cargado, ingrese otro codigo");
                    System.out.println("Comenzando nuevamente....");
                    System.out.println("----------------------------------------------------------------------------------------");
                    continue;
                }
                boolean codEncontrado = false; // booleano en caso de que el codigo sea incorrecto
                for (int i = 0; i < 5; i++) {
                   if (haberes[i][0].equals(String.valueOf(codIngresado))) {
                       codEncontrado = true; // se encuentra el cod en la lista haberes se ejecuta el codigo
                       bonoCalculado[i][0]= haberes[i][0];
                       bonoCalculado[i][1]= haberes[i][1];
                       if (haberes[i][2].equals("M")) {
                           System.out.println("Ingrese el porcentaje del haber a calcular en base al sueldo basico");
                           double porcentaje = sc.nextDouble();
                           sc.nextLine();
                           bonoCalculado[i][2]= String.valueOf(porcentaje * 0.01 * persona.getSueldoBasico());                            
                           System.out.println("Haberes agregado al calculo.... Comenzando nuevamente");
                           System.out.println("----------------------------------------------------------------------------------------");
                       } else {
                           bonoCalculado[i][2] = String.valueOf(Double.parseDouble(haberes[i][2])* 0.01 * persona.getSueldoBasico());
                           System.out.println("Haberes agregado al calculo.... Comenzando nuevamente");
                           System.out.println("----------------------------------------------------------------------------------------");
                       }
                       codigosIngresados.add(codIngresado);
                       sumaHaberes += Double.parseDouble(bonoCalculado[i][2]); // se agrega el haber a la suma
                   }
               }
               if (!codEncontrado) {
                   System.out.println("El codigo ingresado es incorrecto. Comenzando nuevamente....");
                   System.out.println("----------------------------------------------------------------------------------------");
                   continue;
               }    
           }
           
           System.out.println("----------------------------------------------------------------------------------------");
           System.out.println("Comenzando carga de Deducciones....");
           System.out.println("----------------------------------------------------------------------------------------");
           int contadorDeducciones = 0; // debido a que ya cargue los haberes en la lista no puedo utilizar isEmpty asique si se agrega una deduccion aumenta el contador 
           // se agrego afuera del ciclo para que no se reinicie siempre la variable
           while (true) {     // comienza el ciclo de carga de deducciones. 
                double sumaDeducciones = 0; //variable local del ciclo para llevar la suma por cada bono
                System.out.println("Ingrese las deducciones del Empleado");
                System.out.println("Ingrese el código del ítem: (si desea salir ingrese el codigo '000')");
                Integer codIngresado = sc.nextInt();
                sc.nextLine();
                if (codIngresado == 000){ //verifico codigo de salida y que haya al menos 1 haber cargado en este caso utilizando un contador
                    if (contadorDeducciones >= 1) {
                        System.out.println("Codigo de salida ingresado, saliendo de la carga de deducciones....");
                        System.out.println("----------------------------------------------------------------------------------------");
                        bono.setSumaDeducciones(0);
                        break; // el unico break que sale de la carga de deducciones                         

                    } else{
                        System.out.println("Debe ingresar al menos 1 deducción, Reiniciando.....");
                        System.out.println("----------------------------------------------------------------------------------------");
                        continue;
                    }
                }

                if (codigosIngresados.contains(codIngresado)){ //verifico que no haya el codigo en la lista
                    System.out.println("El código ya ha sido cargado, ingrese otro codigo");
                    System.out.println("Comenzando nuevamente....");
                    System.out.println("----------------------------------------------------------------------------------------");
                    continue;
                }
                boolean codEncontrado = false; // booleano en caso de que el codigo sea incorrecto
                for (int i = 0; i < 5; i++) {
                   if (deducciones[i][0].equals(String.valueOf(codIngresado))) {
                       codEncontrado = true; // se encuentra el cod en la lista deducciones y se ejecuta el codigo
                       bonoCalculado[i+5][0]= deducciones[i][0]; //en el array de bonoCalculado los primeros 5 elementos reservados para los haberes
                       bonoCalculado[i+5][1]= deducciones[i][1]; // se agrega un +5 para empezar a llenar con deducciones a partir de ese lugar
                       if (deducciones[i][2].equals("M")) {
                           System.out.println("Ingrese el porcentaje de la deduccion a calcular en base al sueldo basico");
                           double porcentaje = sc.nextDouble();
                           sc.nextLine();
                           bonoCalculado[i+5][3]= String.valueOf(porcentaje * 0.01 * persona.getSueldoBasico());                            
                           System.out.println("Deduccion agregada al calculo.... Comenzando nuevamente");
                           System.out.println("----------------------------------------------------------------------------------------");
                       } else {
                           bonoCalculado[i+5][3] = String.valueOf(Double.parseDouble(deducciones[i][2])* 0.01 * persona.getSueldoBasico());
                           System.out.println("Deduccion agregada al calculo.... Comenzando nuevamente");
                           System.out.println("----------------------------------------------------------------------------------------");
                       }
                       codigosIngresados.add(codIngresado);
                       sumaDeducciones += Double.parseDouble(bonoCalculado[i+5][3]); //se agrega la deduccion a la suma
                       contadorDeducciones++; // se suma una deduccion al ingresar 000 se sale de la carga de deducciones
                   }
               }
               if (!codEncontrado) {
                   System.out.println("El codigo ingresado es incorrecto. Comenzando nuevamente....");
                   System.out.println("----------------------------------------------------------------------------------------");
                   continue;
               }    
           }            

           //comienzo de todos los calculos del bono
           double neto = (persona.getSueldoBasico() + persona.getMontoAntiguedad() + bono.getSumaHaberes()) - bono.getSumaDeducciones();
           bono.setMontoLiquidacion(neto);
           bono.setBonoCalculado(bonoCalculado);
           persona.getBonos().add(bono);// se agrega el bono a la lista de bonos de sueldo del empleado
           
            do {
            System.out.println("Desea agregar otro bono de sueldo al empleado: (SI/NO): "); //verificacion de salida
            String opcion = sc.nextLine();
            if (opcion.equalsIgnoreCase("si")) {
                break;
                } else if(opcion.equalsIgnoreCase("no")) {
                    salidaBonos = true;
                    break;
                } else {
                    System.out.println("Ingrese una respuesta valida!");
                }
            } while (true);
           
           
       } while (!salidaBonos); // termina la carga de bonos
        
       //comienzo de mostrar la informacion por pantalla
        for (BonoSueldo bono : persona.getBonos()) {
            System.out.println("El bono de sueldo a Liquidar es:");
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Nombre:" +"\t"+ persona.getNombreEmpleado());
            System.out.println("CUIL:" +"\t" + persona.getCuil());
            System.out.println(completarConEspacios("Mes Liquidacion:") + completarConEspacios(String.valueOf(bono.getMesLiquidacion())) + completarConEspacios("Anio Liquidacion:") + completarConEspacios(String.valueOf(bono.getAnioLiquidacion())));
            System.out.println(completarConEspacios("Sueldo Basico:") + completarConEspacios(String.valueOf(persona.getSueldoBasico())) + completarConEspacios("Anio Ingreso:") + completarConEspacios(String.valueOf(persona.getAnioIngreso())));
            System.out.println(completarConEspacios("Codigo Item") + completarConEspacios("Denominacion") + completarConEspacios("Haberes") + completarConEspacios("Deducciones"));
            System.out.println(completarConEspacios(" ") + completarConEspacios("Sueldo Basico") + completarConEspacios(String.valueOf(persona.getSueldoBasico())));
            System.out.println(completarConEspacios(" ") + completarConEspacios("Antiguedad") + completarConEspacios(String.valueOf(persona.getMontoAntiguedad())));
            
        }
        
        
    }
    
    public static String completarConEspacios(String cadena){
    int cantidadEspacios = 25-cadena.length();
    for (int i = 0; i < cantidadEspacios; i++) {
        cadena+= " ";
        }
    return cadena;
    }
}
