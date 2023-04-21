package com.hedima.presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Escriba un número ->");
//        try {
//            //Líneas sensibles a error
//            int numero = s1.nextInt();
//        }catch(Exception e){
//            System.out.println("Ha escrito un valor inválido");
//            System.out.println(e.toString());
//            System.out.println(e.getClass());
//        }
        System.out.println("------Continua -----");

        //EJERCICIO: Declarar un array de números y posicionarse en una celda que no existe

        int[] array = {1,2,3,4,5};
        System.out.println("Que posición quieres ver del array");

        try {
            int pos = s1.nextInt();
            System.out.println("El valor de esa posición es: " + array[pos] + "");
        }catch (InputMismatchException e) {
            System.out.println("La posicion es un valor invalido tiene que ser numerico");
            System.out.println(e.toString());
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esa posición no existe en nuestro array");
            System.out.println(e.toString());
        }catch (Exception e){
            System.out.println("Entra a la excepcion padre");
        }
    }
}