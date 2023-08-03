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
public class PagoTelefonoConvencional extends TipoPago {

    private final double tarifa;
    private final double minutosConsumidos;
    private final double costoMinuto;

    public PagoTelefonoConvencional(double tar, double minConsumidos,
            double costoMin) {
        tarifa = tar;
        minutosConsumidos = minConsumidos;
        costoMinuto = costoMin;
    }

    @Override
    public void calcularPagos() {
        pagos = tarifa + (minutosConsumidos * costoMinuto);
    }

    @Override
    public String toString() {
        String reporte = "Pago Telefono Convencional:\n";
        reporte = String.format("%sTarifa normal: $%.2f\n"
                + "Minutos consumidos: %.2f\n"
                + "Costo de minutos: $%.2f\n"
                + "Total: %.2f\n",
                reporte,
                tarifa,
                minutosConsumidos,
                costoMinuto,
                pagos);
        return reporte;
    }

}
