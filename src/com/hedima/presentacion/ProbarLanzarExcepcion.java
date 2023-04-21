package com.hedima.presentacion;

import com.hedima.modelo.Fecha;
import com.hedima.modelo.Producto;

import java.util.InputMismatchException;

public class ProbarLanzarExcepcion {
    public static void main(String[] args)  {

        Producto p1 = new Producto(-1,"Leche");

        try {
            p1.comprobarId();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---Continua la programación");

        Fecha f1 = new Fecha(10,10,2023);
        try {
            f1.comprobar();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
