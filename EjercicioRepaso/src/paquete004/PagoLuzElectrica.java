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
    
    private final String ciudad;
    double tarifaBase;
    double kilovatiosConsumidos;
    double costoKilovatio;
    
    public PagoLuzElectrica(String c, double tB, double kVconsumidos,
            double costoKv) {
        ciudad = c;
        tarifaBase = tB;
        kilovatiosConsumidos = kVconsumidos;
        costoKilovatio = costoKv;
    }
    
    @Override
    public void calcularPagos() {             
        if (ciudad.equals("Loja")) {
            pagos = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            pagos = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }
    
    @Override
    public String toString() {
        String reporte = "Pago Luz Electrica:\n";
        reporte = String.format("%sCiudad: %s\n"
                + "Tarifa Base: $%.2f\n"
                + "Kilovatios Consumidos: %.2f\n"
                + "Costo Kilovatio: $%.2f\n"
                + "Total: $%.2f\n",
                reporte,
                ciudad,
                tarifaBase,
                kilovatiosConsumidos,
                costoKilovatio,
                pagos);
        return reporte;
    }
    
}
