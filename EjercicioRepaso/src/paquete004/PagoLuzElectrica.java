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
    double tarifaBase;
    double kilovatiosConsumidos;
    double costoKilovatio;
    
    public PagoLuzElectrica(String c) {
        ciudad = c;
    }
    
    @Override
    public void calcularPagos() {
        //double pago = 0;
        tarifaBase = 10.20;
        kilovatiosConsumidos = 80;
        costoKilovatio = 0.5;
        if (ciudad.equals("Loja")) {
            pagos = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pagos = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }
    
    @Override
    public String toString() {
        String reporte = "Pago Luz Electrica:\n";
        reporte = String.format("%Ciudad: %s\n"
                + "Tarifa Base: $%.2f\n"
                + "Kilovatios Consumidos: $%.2f\n"
                + "Costo Kilovatio: $%.2f\n"
                + "Total: $%.2f",
                reporte,
                ciudad,
                tarifaBase,
                kilovatiosConsumidos,
                costoKilovatio,
                pagos);
        return reporte;
    }
    
}
