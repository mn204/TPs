/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asociacion;

import java.util.ArrayList;

/**
 *
 * @author Manuel
 */
public class Alumno {
    String nombreCompleto;
    long legajo;
    private ArrayList<Nota> notas = new ArrayList<>();

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    public double promedioAlumno(Alumno alumno){
        ArrayList<Nota> promedio = new ArrayList<>();
        promedio = alumno.getNotas();
        double sumador= 0.0;
        for (Nota nota : promedio) {
                sumador += nota.getNotaExaman();
            }
        return  sumador / promedio.size();
    }
}
