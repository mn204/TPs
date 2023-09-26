/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_1;

import java.util.Scanner;
import javax.swing.JOptionPane;
        

/**
 *
 * @author Manuel
 */
public class Ej_2 {
    public static void main (String [] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Cadena");
        String name = sc.nextLine();
        
        JOptionPane.showMessageDialog (null, "Bienvenido " + name);
    }
}
