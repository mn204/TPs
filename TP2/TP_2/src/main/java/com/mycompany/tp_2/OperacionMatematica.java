/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;

/**
 *
 * @author Manuel
 */
public class OperacionMatematica {
    private double valor1;
    private double valor2;
    private String operacion;

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    private double sumarNumeros(){
    return valor1 + valor2;
    }
    private double restarNumeros(){
    return valor1 - valor2;
    }
    private double multiplicarNumeros(){
    return valor1 * valor2;
    }
    private double dividirNumeros(){
    return valor1 / valor2;
    }
    public double aplicarOperacion(String operacion){
        double resultado = 0;
        
        switch (operacion) {
            case "+":
                resultado =  sumarNumeros();
                break;
            case "-":
                resultado = restarNumeros();
                break;
            case "*":
                 resultado = multiplicarNumeros();
                 break;
            case "/":
                resultado= dividirNumeros();
                break;
            default:
                throw new AssertionError();
        }
        return resultado;
    }
}
