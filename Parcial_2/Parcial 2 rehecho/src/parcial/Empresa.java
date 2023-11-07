/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial;

import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class Empresa {
    private String cuit;
    private String razonSocial;
    private ArrayList<Empleado> empleados = new ArrayList<>();

    public Empresa(String cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public boolean agregarEmpleado(Empleado empleado) {
        for (Empleado e : empleados) {
            if (e.getLegajo() == empleado.getLegajo()) {
                return false; // Legajo duplicado
            }
        }
        empleados.add(empleado);
        return true;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
}
