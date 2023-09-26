/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;

/**
 *
 * @author Manuel
 */
public class Fraccion {
    int numerador,denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(){
        
    }
  
    private int mcd(){
     int u=Math.abs(numerador);
     int v=Math.abs(denominador);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
    }
     public Fraccion simplificar(){
     int dividir=mcd();
     numerador/=dividir;
     denominador/=dividir;
     return this;
  }
    public Fraccion sumarFracciones(Fraccion f1, Fraccion f2){
        Fraccion resultado = new Fraccion();
        resultado.numerador = f1.numerador * f2.denominador +  f2.numerador *f1.denominador;
        resultado.denominador = f1.denominador*f2.denominador;
        resultado.simplificar();
        return resultado;
    } 
    public Fraccion restarFracciones(Fraccion f1, Fraccion f2){
        Fraccion resultado = new Fraccion();
        resultado.numerador = f1.numerador * f2.denominador -  f2.numerador *f1.denominador;
        resultado.denominador = f1.denominador*f2.denominador;
        resultado.simplificar();
        return resultado;
    }
    public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2){
        Fraccion resultado = new Fraccion();
        resultado.numerador = f1.numerador*f2.numerador;
        resultado.denominador =  f1.denominador*f2.denominador;
        resultado.simplificar();
        return resultado;
    }
    public Fraccion dividirFracciones(Fraccion f1, Fraccion f2){
        Fraccion resultado = new Fraccion();
        resultado.numerador =f1.numerador*f2.denominador;
        resultado.denominador = f1.denominador*f2.numerador;
        resultado.simplificar();
        return resultado;
  
    }
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}
