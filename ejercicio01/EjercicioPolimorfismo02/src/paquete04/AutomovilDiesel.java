/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;
import paquete02.Automovil;
/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil{
    private int litrosMax;
    private double costoLitro;
    private double descuento;
    private int numLiDes;
    
    public AutomovilDiesel(String np, String p,int a, double b, double d) {
        super(np,p);
        litrosMax = a;
        costoLitro = b;
        descuento=d;
        
        
    }
      public void establecerLitrosMax(int a) {
        litrosMax = a;
    }

    public void establecerCostoLitro(double a) {
        costoLitro = a;
    }

    public void establecerDescuento() {
        descuento = litrosMax*(descuento/100);
    }

    public int obtenerLitrosMax() {
        return litrosMax;
    }

    public double obtenerCostoLitro() {
        return costoLitro;
    }

    public double obtenerDescuento() {
        return descuento;
    }

   
    
    @Override
    public void calcularValorApagar() {
        valorAPagar=(costoLitro*(litrosMax-descuento));
    }
     @Override
    public String toString() {
        String cadena= String.format(super.toString());
        cadena=String.format("Automovil Diesel\n"
                + "%s\n"
                + "Litros Maximo:%d\n"
                + "Costo Litro:%.2f\n"
                + "Descuento:%.2f\n", cadena,
                obtenerLitrosMax(),
                obtenerCostoLitro(),
                obtenerDescuento());
        return cadena;
    }
   
    
}
