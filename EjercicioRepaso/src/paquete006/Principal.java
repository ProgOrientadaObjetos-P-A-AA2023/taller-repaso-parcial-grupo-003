/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete006;

import java.util.ArrayList;
import paquete001.Persona;
import paquete002.*;
import paquete003.BilleteraPagos;
import paquete003.TipoPago;
import paquete004.*;
import paquete006.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<TipoPago> lista = new ArrayList<>();
        Ciudad c1 = new Ciudad("Loja");
        Persona p1 = new Persona("Melany", "Pinzon", 18, "1150981809",
                c1);

        String[] ciudades = {"Ciudad Tomate", "Pisos Picados", "Oasis Ostentoso"};

        for (int i = 0; i < DatosAgua.datosCasas().length; i++) {

            PagoAguaPotable aguaCasa
                    = new PagoAguaPotable("casa",
                            DatosAgua.datosCasas()[i][0],
                            DatosAgua.datosCasas()[i][1],
                            DatosAgua.datosCasas()[i][2]);
            lista.add(aguaCasa);

            PagoAguaPotable aguaComercio
                    = new PagoAguaPotable("comercial",
                            DatosAgua.datosComerciales()[i][0],
                            DatosAgua.datosComerciales()[i][1],
                            DatosAgua.datosComerciales()[i][2]);
            lista.add(aguaComercio);

        }

        for (int i = 0; i < DatosLuz.datosLoja().length; i++) {

            PagoLuzElectrica luzCasa
                    = new PagoLuzElectrica("Loja",
                            DatosLuz.datosLoja()[i][0],
                            DatosLuz.datosLoja()[i][1],
                            DatosLuz.datosLoja()[i][2]);
            lista.add(luzCasa);

            PagoLuzElectrica luzComercio
                    = new PagoLuzElectrica(ciudades[i],
                            DatosAgua.datosComerciales()[i][0],
                            DatosAgua.datosComerciales()[i][1],
                            DatosAgua.datosComerciales()[i][2]);
            lista.add(luzComercio);

        }

        for (int i = 0; i < DatosPropiedades.datos().length; i++) {

            Propiedad propiedad1 = new Propiedad(DatosPropiedades.datos()[i][0],
                    DatosPropiedades.datos()[i][1]);

            PagoPredial casa1
                    = new PagoPredial(propiedad1);
            lista.add(casa1);

        }

        for (int i = 0; i < DatosTelefono.datos().length; i++) {

            PagoTelefonoConvencional telefonoCasa
                    = new PagoTelefonoConvencional(
                            DatosTelefono.datos()[i][0],
                            DatosTelefono.datos()[i][1],
                            DatosTelefono.datos()[i][2]);

            lista.add(telefonoCasa);

        }

        for (TipoPago p : lista) {
            p.calcularPagos();
        }

        BilleteraPagos pago = new BilleteraPagos(p1, "Julio", lista);
        pago.calcularGastoPagos();
        System.out.println(pago);
    }
}
