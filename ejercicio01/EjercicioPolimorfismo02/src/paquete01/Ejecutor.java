/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;
import paquete02.Automovil;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
//        ArrayList<Automovil> listaAutomovil
        AutomovilGasolina autog1 = new AutomovilGasolina("Arturo Palacios", "LBA1122", 20, 3);
        AutomovilGasolina autog2 = new AutomovilGasolina("Maria Jimenez", "LBC2233", 10, 2.45);
        autog1.calcularValorApagar();
        System.out.println(autog1);
        System.out.println("---------------");
        AutomovilDiesel autod1 = new AutomovilDiesel("Andrea Perez", "LBA1233", 20, 2, 10);
//        AutomovilDiesel autod2= new AutomovilDiesel("Ronny Carrion", "LBC3728", 6, 1.50, 5);
        autod1.establecerDescuento();
        autod1.calcularValorApagar();
//        autod2.calcularValorApagar();
        System.out.println(autod1);
//        System.out.println(autod2);
    }
}
