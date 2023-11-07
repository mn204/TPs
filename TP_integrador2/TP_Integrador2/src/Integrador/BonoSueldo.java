/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Integrador;

/**
 *
 * @author Manuel
 */
public class BonoSueldo {
    private Empleado empleado;
    private int mesLiquidacion;
    private int anioLiquidacion;
    private double montoLiquidacion;
    private String[][] bonoCalculado; // se agrega este array para guardar la informacion y que no se pierda en bucle
    private  double sumaHaberes; // se pasan estas variables aca para que se relacionen con cada bono de sueldo especifico

    public double getSumaHaberes() {
        return sumaHaberes;
    }

    public void setSumaHaberes(double sumaHaberes) {
        this.sumaHaberes = sumaHaberes;
    }

    public double getSumaDeducciones() {
        return sumaDeducciones;
    }

    public void setSumaDeducciones(double sumaDeducciones) {
        this.sumaDeducciones = sumaDeducciones;
    }
    private  double sumaDeducciones;

    public String[][] getBonoCalculado() {
        return bonoCalculado;
    }

    public void setBonoCalculado(String[][] bonoCalculado) {
        this.bonoCalculado = bonoCalculado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public int getMesLiquidacion() {
        return mesLiquidacion;
    }

    public void setMesLiquidacion(int mesLiquidacion) {
        this.mesLiquidacion = mesLiquidacion;
    }

    public int getAnioLiquidacion() {
        return anioLiquidacion;
    }

    public void setAnioLiquidacion(int anioLiquidacion) {
        this.anioLiquidacion = anioLiquidacion;
    }

    public double getMontoLiquidacion() {
        return montoLiquidacion;
    }

    public void setMontoLiquidacion(double montoLiquidacion) {
        this.montoLiquidacion = montoLiquidacion;
    }
}
