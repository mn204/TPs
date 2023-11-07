/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Manuel
 */
public class LiquidacionEmpresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Ingresar datos de la empresa
        System.out.print("Ingrese el nombre de la empresa: ");
        String razonSocial = scanner.nextLine().trim();
        while (razonSocial.isEmpty()) {
            System.out.println("El nombre de la empresa no puede estar vacío.");
            System.out.print("Ingrese el nombre de la empresa: ");
            razonSocial = scanner.nextLine().trim();
        }

        System.out.print("Ingrese el CUIT de la empresa (11 dígitos): ");
        String cuit = scanner.nextLine().trim();
        while (cuit.length() != 11) {
            System.out.println("El CUIT debe tener 11 dígitos.");
            System.out.print("Ingrese el CUIT de la empresa (11 dígitos): ");
            cuit = scanner.nextLine().trim();
        }

        Empresa empresa = new Empresa(cuit, razonSocial);

        // Paso 2: Cargar empleados
        ArrayList<NivelAcademico> nivelesAcademicos = new ArrayList<NivelAcademico>();
        nivelesAcademicos.add(new NivelAcademico(10, "Secundario Completo", 10));
        nivelesAcademicos.add(new NivelAcademico(20, "Universitario Completo", 30));
        nivelesAcademicos.add(new NivelAcademico(30, "Maestría Completo", 40));
        nivelesAcademicos.add(new NivelAcademico(40, "Doctorando Completo", 50));

        boolean cargarEmpleado = true;

        while (cargarEmpleado) {
            System.out.print("Ingrese el nombre completo del empleado: ");
            String nombreCompleto = scanner.nextLine().trim();

            System.out.print("Ingrese el legajo del empleado: ");
            int legajo = Integer.parseInt(scanner.nextLine().trim());

            boolean legajoDuplicado = false;
            for (Empleado e : empresa.getEmpleados()) {
                if (e.getLegajo() == legajo) {
                    legajoDuplicado = true;
                    break;
                }
            }

            if (legajoDuplicado) {
                System.out.println("El legajo ingresado ya fue cargado anteriormente.");
                continue;
            }

            System.out.print("Ingrese el salario del empleado: ");
            double salario = Double.parseDouble(scanner.nextLine().trim());

            int codigoNivel;
            NivelAcademico nivelEmpleado = null;

            while (nivelEmpleado == null) {
                System.out.print("Ingrese el código del nivel académico: ");
                codigoNivel = Integer.parseInt(scanner.nextLine().trim());

                for (NivelAcademico na : nivelesAcademicos) {
                    if (na.getCodigo() == codigoNivel) {
                        nivelEmpleado = na;
                        break;
                    }
                }

                if (nivelEmpleado == null) {
                    System.out.println("El código ingresado no existe, intente nuevamente.");
                }
            }

            Empleado empleado = new Empleado(nombreCompleto, legajo, salario, nivelEmpleado);
            boolean empleadoAgregado = empresa.agregarEmpleado(empleado);

            if (empleadoAgregado) {
                System.out.println("Empleado agregado exitosamente.");
            } else {
                System.out.println("El legajo ingresado ya fue cargado anteriormente.");
            }

            System.out.print("¿Desea cargar otro empleado? (S/N): ");
            String respuesta = scanner.nextLine().trim().toUpperCase();
            cargarEmpleado = respuesta.equals("S");
        }

        // Paso 4: Mostrar información de los empleados y resumen
        System.out.println("Empresa: " + empresa.getRazonSocial());
        System.out.println("CUIT: " + empresa.getCuit());
        System.out.println("------------------------Empleados------------------------------");
        double totalSalarios = 0;
        Empleado empleadoConMejorSalario = null;
        double mejorSalario = 0;

        for (Empleado empleado : empresa.getEmpleados()) {
            double salarioTotal = empleado.salarioTotalCalculado();
            totalSalarios += salarioTotal;

            if (salarioTotal > mejorSalario) {
                mejorSalario = salarioTotal;
                empleadoConMejorSalario = empleado;
            }

            System.out.println(empleado);
            System.out.println("---------------------------------------------------------------------");
        }

        double promedioSalarios = totalSalarios / empresa.getEmpleados().size();

        System.out.println("Resumen:");
        System.out.println("El promedio de los salarios de la empresa es: $" + promedioSalarios);
        System.out.println("El empleado con mejor salario es:");
        System.out.println(empleadoConMejorSalario);
    }
}
