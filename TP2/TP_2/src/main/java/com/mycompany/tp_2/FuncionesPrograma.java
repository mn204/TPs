/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author Manuel
 */
public class FuncionesPrograma {
    
    public static String getFechaString(Date fecha){
        SimpleDateFormat FechaActual = new SimpleDateFormat("dd-MM-yyyy");
        return FechaActual.format(fecha);
    }
    public static Date getFechaDate(int dia, int mes, int anio){
        Calendar fechaCalendario = Calendar.getInstance();
        fechaCalendario.set(anio,mes -1, dia);
        return fechaCalendario.getTime();
    }
        
    }

