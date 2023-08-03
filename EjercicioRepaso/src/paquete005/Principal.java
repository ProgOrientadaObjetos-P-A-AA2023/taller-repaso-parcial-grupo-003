/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import java.util.ArrayList;
import paquete001.*;
import paquete002.*;
import paquete003.*;
import paquete004.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<TipoPago> lista = new ArrayList<>();

        Ciudad c1 = new Ciudad("Loja");
        Persona p1 = new Persona("Santiago", "Riofrio", 20, "1104661168",
                c1);

        PagoAguaPotable aguaCasa = new PagoAguaPotable("casa", 15.2, 245, 0.25);
        lista.add(aguaCasa);
        PagoAguaPotable aguaComercio = new PagoAguaPotable("comercial", 2.20,
                145, 0.25);
        lista.add(aguaComercio);

        PagoLuzElectrica luzCasa = new PagoLuzElectrica("Loja", 12.2, 120, 0.15);
        lista.add(luzCasa);
        PagoLuzElectrica luzComercio = new PagoLuzElectrica("Quito", 12.2, 155, 0.15);
        lista.add(luzComercio);

        Propiedad propiedad1 = new Propiedad(56000, 10);
        Propiedad propiedad2 = new Propiedad(12000, 20);

        PagoPredial casa1 = new PagoPredial(propiedad1);
        PagoPredial casa2 = new PagoPredial(propiedad2);

        lista.add(casa1);
        lista.add(casa2);

        PagoTelefonoConvencional telefonoCasa = new PagoTelefonoConvencional(16,
                277.5, 0.45);
        lista.add(telefonoCasa);
        PagoTelefonoConvencional telefonoFinca = new PagoTelefonoConvencional(16,
                301.2, 0.45);
        lista.add(telefonoFinca);

        for (TipoPago p : lista) {
            p.calcularPagos();
        }

        BilleteraPagos pago = new BilleteraPagos(p1, "Junio", lista);
        pago.calcularGastoPagos();
        System.out.println(pago);
    }
}
