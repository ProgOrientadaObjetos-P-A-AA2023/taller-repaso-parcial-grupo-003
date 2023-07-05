/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;
import paquete003.*;

/**
 *
 * @author reroes
 */
public class PagoPredial extends TipoPago {
    
    double valorPropiedad;
    double porcentaje;
    
    @Override
    public void calcularPagos(){
        valorPropiedad = 56000;
        porcentaje = 10;
        pagos = valorPropiedad - ((valorPropiedad*porcentaje)/100);
    }
    
    @Override
    public String toString() {
        String reporte = "Pago Predial:\n";
        reporte = String.format("%sValor Propiedad: $%.2f\n"
                + "Porcentaje: $%.2f\n"
                + "Total: $%.2f",
                reporte,
                valorPropiedad,
                porcentaje,
                pagos);
        return reporte;
    }
    
}
