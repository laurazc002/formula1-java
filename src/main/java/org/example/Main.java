package org.example;

import Clases.Escuderia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int [10];
        String[] nombres = new String[5];

        Escuderia[] escuderias = new Escuderia[10];

        Scanner lea = new Scanner(System.in);

        //Recorriendo arreglo
        for (int i=0; i<nombres.length; i++){

            System.out.println("Digite el nombre: " +(i+1));
            nombres[i] = lea.next();

        }

        //Recorrer un arreglo para mostrar que tiene por dentro
        for (int i=0; i<nombres.length; i++){

            System.out.println(nombres[i]);

        }


    }
}