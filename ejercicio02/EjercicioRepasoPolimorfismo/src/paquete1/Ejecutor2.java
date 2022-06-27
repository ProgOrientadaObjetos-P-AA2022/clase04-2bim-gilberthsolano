/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;

public class Ejecutor2 {

    public static void main(String[] args) {

        ArrayList<PasajeUrbano> pasajes = new ArrayList<>();
        String[] nombres = {"Austin", "Monique", "Glen", "Richard", "Patrick"};
        String[] apellidos = {"Martinez", "Lyons", "Kim", "Tate", "Lee"};
        int[] edad = {9, 70, 35, 23, 10};
        double pasajeFijo = 0.4;

        /*
        Generar un proceso que permita iterar los arreglos; el objetivo es 
        crear objetos de tipo Pasaje Menor de edad, Pasaje Normal, Pasaje 
        Universitario y Pasaje Tercera Edad. Los arreglos tienen una 
        característica, las posiciones se corresponden; por ejemplo, todas las 
        posiciones 0, crearán un objeto de cualquiera de los tipos nombrados de
        Pasajes.
        Cada objeto creado será agregado a la lista pasajes.
        
        ¿Cómo saber a que tipo de Pasaje pertenece cada objeto? Usar la edad 
        como discriminatoria.
        
        menor de edad: mayor o igual a 0 y menor o igual a 18
        universitario: mayor a 18 y menor o igual a 25
        normal: mayor a 25 y menor 65
        tercera edad: mayor o igual a 65
        
         */
        //inicio de solucion
        for (int i = 0; i < edad.length; i++) {
            if (edad[i] >= 0 && edad[i] <= 18) {
                PasajeMenorEdad pasajeMenor1 = new PasajeMenorEdad(pasajeFijo);
                Persona pers1 = new Persona(nombres[i], apellidos[i], edad[i]);
                pasajeMenor1.establecerPersona(pers1);
                pasajes.add(pasajeMenor1);

            } else if (edad[i] > 18 && edad[i] <= 25) {
                PasajeUniversitario pasajeUni1 = new PasajeUniversitario(pasajeFijo);
                Persona pers2 = new Persona(nombres[i], apellidos[i], edad[i]);
                pasajeUni1.establecerPersona(pers2);
                pasajes.add(pasajeUni1);

            } else if (edad[i] > 25 && edad[i] < 65) {
                PasajeNormal pasajeNormal1 = new PasajeNormal(pasajeFijo);
                Persona pers3 = new Persona(nombres[i], apellidos[i], edad[i]);
                pasajeNormal1.establecerPersona(pers3);
                pasajes.add(pasajeNormal1);
            } else if (edad[i] >= 65) {
                PasajeTerceraEdad pasajeTerc1 = new PasajeTerceraEdad(pasajeFijo);
                Persona pers4 = new Persona(nombres[i], apellidos[i], edad[i]);
                pasajeTerc1.establecerPersona(pers4);
                pasajes.add(pasajeTerc1);
            }

        }

        //fin solucion
        // no incrementar líneas de código desde aquí
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).establecerValorPasaje();
        }

        for (int i = 0; i < pasajes.size(); i++) {
            System.out.printf("%s\n",
                    pasajes.get(i));
        }

    }
}
