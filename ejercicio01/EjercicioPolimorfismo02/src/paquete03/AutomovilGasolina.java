/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil{
    private int galoMax;
    private double costoGal;
    private int iva;

    public AutomovilGasolina(String np, String p,int a, double b) {
        super(np,p);
        galoMax = a;
        costoGal = b;
        iva = 10;
    }

    public void establecerGaloMax(int a) {
        galoMax = a;
    }

    public void establecerCostoGal(double a) {
        costoGal = a;
    }

    public void establecerIva(int a) {
        iva = a;
    }

    public int obtenerGaloMax() {
        return galoMax;
    }

    public double obtenerCostoGal() {
        return costoGal;
    }

    public int obtenerIva() {
        return iva;
    }

   

    @Override
    public void calcularValorApagar() {
        valorAPagar=(galoMax*costoGal)+((iva*costoGal/100)*(galoMax));
    }
    
     @Override
    public String toString() {
        String cadena=String.format(super.toString());
         cadena=String.format("Automovil Gasolina\n"
                + "%s\n"
                 + "Galon maximo: %d\n"
                 + "Costo galon: %.2f\n", cadena,
                 obtenerGaloMax(),
                 obtenerCostoGal());
         return cadena;
    }

    

}
