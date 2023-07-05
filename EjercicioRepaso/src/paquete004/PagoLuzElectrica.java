/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;
import paquete003.*;

/**
 *
 * @author reroes
 */
public class PagoLuzElectrica extends TipoPago {
    
    private String ciudad;
    
    public PagoLuzElectrica(String c) {
        ciudad = c;
    }
    
    @Override
    public void calcularPagos() {
        //double pago = 0;
        double tarifaBase = 10.20;
        double kilovatiosConsumidos = 80;
        double costoKilovatio = 0.5;
        if (ciudad.equals("Loja")) {
            pagos = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pagos = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }
}
