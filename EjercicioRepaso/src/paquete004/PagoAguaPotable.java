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
public class PagoAguaPotable extends TipoPago {

    private final String tipo;
    double tarifaFija;
    double metrosCubicosConsumo;
    double costoConsumoCubicos;

    public PagoAguaPotable(String t, double tF, double meCubicos,
            double costoConsumo) {
        tipo = t;
        tarifaFija = tF;
        metrosCubicosConsumo = meCubicos;
        costoConsumoCubicos = costoConsumo;
    }

    @Override
    public void calcularPagos() {
        //double pago = 0;
        if (tipo.equals("comercial")) {
            pagos = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        } else {
            pagos = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }
    }

    @Override
    public String toString() {
        String reporte = "Pago Agua Potable:\n";
        reporte = String.format("%sTipo: %s\n"
                + "Tarifa Fija: $%.2f\n"
                + "Metros Cubicos Consumo: %.2f\n"
                + "Costo Consumo Cubicos: $%.2f\n"
                + "Total: $%.2f\n",
                reporte,
                tipo,
                tarifaFija,
                metrosCubicosConsumo,
                costoConsumoCubicos,
                pagos);
        return reporte;
    }
}
