/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_1;

import java.util.Scanner;
/**
 *
 * @author Manuel
 */
public class Ej__11 {
    public static void main(String[] args) {
       
      Scanner sc = new Scanner(System.in);
      
      String password = "laboratorio" ;
      int intentos = 3;
      boolean correcto = false ;
      
      while(intentos > 0  && !correcto){
        System.out.println("Ingrese la contraseña:(le quedan " + intentos + " intentos)");
        String passwordInput = sc.nextLine();
        
        if (passwordInput.equals(password)){
            
            System.out.println("Acceso correcto");
            correcto = true;
            
        } else {
        intentos--;
            }
        }
      
      if (!correcto) {
      System.out.println("Se ha quedado sin intentos");
      }
    }
}
