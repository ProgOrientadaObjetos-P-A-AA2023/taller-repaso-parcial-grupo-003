/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete002.Propiedad;
import paquete003.*;

/**
 *
 * @author reroes
 */
public class PagoPredial extends TipoPago {

    private final Propiedad propiedad;

    public PagoPredial(Propiedad p1) {
        propiedad = p1;
    }

    @Override
    public void calcularPagos() {
        pagos = propiedad.obtenerCostoPropiedad()
                - ((propiedad.obtenerCostoPropiedad() * propiedad.obtenerPorcentaje()) / 100);
    }

    @Override
    public String toString() {
        String reporte = "Pago Predial:\n";
        reporte = String.format("%sValor Propiedad: $%.2f\n"
                + "Porcentaje descuento: %.1f\n"
                + "Total: $%.2f\n",
                reporte,
                propiedad.obtenerCostoPropiedad(),
                propiedad.obtenerPorcentaje(),
                pagos);
        return reporte;
    }

}
