/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones3;
import java.util.HashSet;
/**
 *
 * @author Manuel
 */
public class Computadora {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public HashSet<ComponentesCPU> getObjetosCPU() {
        return objetosCPU;
    }

    public void setObjetosCPU(HashSet<ComponentesCPU> objetosCPU) {
        this.objetosCPU = objetosCPU;
    }
    private String modelo;
    private HashSet<ComponentesCPU> objetosCPU = new HashSet<>();
    
    
}
