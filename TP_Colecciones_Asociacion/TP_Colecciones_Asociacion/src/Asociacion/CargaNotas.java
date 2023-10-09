/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociacion;
import  java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Manuel
 */
public class CargaNotas {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        boolean salidaAlumno = false;
        while (!salidaAlumno){
            boolean salidaNotas = false;
            Alumno alumnoAgregado = new Alumno();
            System.out.println("Ingrese Datos del alumno:");
            System.out.println("Ingrese Nombre Completo:");
            String  nombre = sc.nextLine();
            alumnoAgregado.setNombreCompleto(nombre);
            
            System.out.println("Ingrese Legajo:");
            long legajo = sc.nextLong();
            sc.nextLine();
            alumnoAgregado.setLegajo(legajo);
            
            ArrayList<Nota> notasAlumnoNuevo = new  ArrayList<>();
            
            while (!salidaNotas){
                
                Nota nuevaNota = new Nota();
                
                System.out.println("Ingrese la catedra");
                String nombreCatedra = sc.nextLine();
                nuevaNota.setCatedra(nombreCatedra);
                
                
                double notaExamen;
                do {
                System.out.println("Ingrese nota del examen: (Valor entre 0 y 10)");
                notaExamen = sc.nextDouble();
                        
                } while (notaExamen < 0 || notaExamen > 10);
                
                sc.nextLine();
                
                nuevaNota.setNotaExamen(notaExamen);
                notasAlumnoNuevo.add(nuevaNota);
                
                System.out.println("Desea salir de la carga de notas:(si,no)");
                String opcion= sc.nextLine();
                if (opcion.equalsIgnoreCase("si")){
                    salidaNotas = true;
                }
            }
            alumnoAgregado.setNotas(notasAlumnoNuevo);
            alumnos.add(alumnoAgregado);
            System.out.println("Desea salir de la carga de Alumnos:(si,no)");
            String opcion= sc.nextLine();
               if (opcion.equalsIgnoreCase("si")){
                    salidaAlumno = true;
                }
        }
        
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombreCompleto());
            System.out.println("   Legajo: " + alumno.getLegajo());
            for (Nota nota : alumno.getNotas()) {
                System.out.print("   Catedra: " + nota.getCatedra() + " | ");
                System.out.println("Nota: " + nota.getNotaExaman());
            }
            System.out.println("   El promedio de notas es: " + alumno.promedioAlumno(alumno));
        }
    }
}
