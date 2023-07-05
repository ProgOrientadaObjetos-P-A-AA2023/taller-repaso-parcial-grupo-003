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
        Ciudad c1 = new Ciudad("Loja");
        Persona p1 = new Persona("Santiago","Riofrio",20,"1104661168",
                c1);
        
        ArrayList<TipoPago> lista = new ArrayList<>();
        
        PagoAguaPotable aguaCasa = new PagoAguaPotable("casa");
        lista.add(aguaCasa);
        PagoAguaPotable aguaComercio = new PagoAguaPotable("comercio");
        lista.add(aguaComercio);
        
        PagoLuzElectrica luzCasa = new PagoLuzElectrica("Loja");
        lista.add(luzCasa);
        PagoLuzElectrica luzComercio = new PagoLuzElectrica("Quito");
        lista.add(luzComercio);
        
        PagoPredial casa1 = new PagoPredial();
        lista.add(casa1);
        PagoPredial casa2 = new PagoPredial();
        lista.add(casa2);
        
        PagoTelefonoConvencional telefonoCasa = new PagoTelefonoConvencional();
        lista.add(telefonoCasa);
        PagoTelefonoConvencional telefonoFinca = new PagoTelefonoConvencional();
        lista.add(telefonoFinca);
        
        for(TipoPago p : lista) {
            p.calcularPagos();
        }
        
        BilleteraPagos pago = new BilleteraPagos(p1,"Junio",lista);
        pago.calcularGastoPagos();
        System.out.println(pago);
    }
}
