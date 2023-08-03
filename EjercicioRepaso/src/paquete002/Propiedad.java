/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author reroes
 */
public class Propiedad {
    private double costoPropiedad;
    private double porcentaje;
    public Propiedad(double c, double porcen) {
        costoPropiedad = c;
        porcentaje = porcen;
    }
    public void establecerPorcentaje(double p) {
        porcentaje = p;
    }
       
    public void establecerCostoPropiedad(double c) {
        costoPropiedad = c;
    }
    
    public double obtenerCostoPropiedad() {
        return costoPropiedad;
    }
    
    public double obtenerPorcentaje() {
        return porcentaje;
    }
    
}
