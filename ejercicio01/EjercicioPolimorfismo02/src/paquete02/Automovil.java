/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil{
    protected String nombresPropietario;
    protected String placa;
    protected double valorAPagar;
    
    public Automovil(){
        
    }
    public Automovil(String np, String p){
        nombresPropietario=np;
        placa=p;
       
    }

    public void establecerNombresPropietario(String nombresPropietario) {
        this.nombresPropietario = nombresPropietario;
    }

    public void establecerPlaca(String placa) {
        this.placa = placa;
    }
    public abstract void calcularValorApagar();

    public String obtenerNombresPropietario() {
        return nombresPropietario;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public double obtenerValorAPagar() {
        return valorAPagar;
    }

    @Override
    public String toString() {
        String cadena=String.format("Nombres propietario:%s\n"
                + "Placa:%s\n"
                + "Valor a pagar:%.2f\n", obtenerNombresPropietario(),
                obtenerPlaca(),
                obtenerValorAPagar()
                );
        return cadena;
    }
    
    
    
    
    
}
