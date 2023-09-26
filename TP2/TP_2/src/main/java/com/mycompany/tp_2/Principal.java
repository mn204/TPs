/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;
import java.util.Date;
/**
 *
 * @author Manuel
 */
public class Principal {
    public static void main(String[] args) {
        Date fecha= new Date();
        System.out.println("La fecha es " + FuncionesPrograma.getFechaString(fecha));
        System.out.println("La fecha usando metodo getFechaDate: " + FuncionesPrograma.getFechaDate(1, 9, 2023));
        
    }
    
}
