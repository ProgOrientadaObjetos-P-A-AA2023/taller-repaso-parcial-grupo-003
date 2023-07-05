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
    
    @Override
    public void calcularPagos(){
        double valorPropiedad = 56000;
        double porcentaje = 10;
        pagos = valorPropiedad - ((valorPropiedad*porcentaje)/100);
    }
}
