/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import java.util.ArrayList;
import paquete001.Persona;
import paquete004.*;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {
    protected Persona persona;
    protected double gastoPagos;
    protected String mes;
    private ArrayList<TipoPago> listaPagos;
    /*public PagoAguaPotable aguaCasa;
    public PagoAguaPotable aguaComercio;
    public PagoLuzElectrica luzCasa;
    public PagoLuzElectrica luzComercio;
    public PagoPredial casa1;
    public PagoPredial casa2;
    public PagoTelefonoConvencional telefonoCasa;
    public PagoTelefonoConvencional telefonoFinca;*/
    
    public BilleteraPagos(Persona p, String m, ArrayList<TipoPago> l) {
        persona = p;
        mes = m;
        listaPagos = l;
    }
    
    public void establecerPersona(Persona p) {
        persona = p;
    }
    
    public void calcularGastoPagos() {
        double suma = 0;
        for(TipoPago l : listaPagos) {
            suma = suma + l.pagos;
        }
        
        gastoPagos = suma;
    }
    
    public void establecerMes(String m) {
        mes = m;
    }
    
    public void establecerListaPagos(ArrayList<TipoPago> l) {
        listaPagos = l;
    }
    
    public Persona obtenerPersona() {
        return persona;
    }
    
    public double obtenerGastoPagos() {
        return gastoPagos;
    }
    
    public String obtenerMes() {
        return mes;
    }
    
    public ArrayList<TipoPago> obtenerListaPagos() {
        return listaPagos;
    }
    
    public String toString(){
        /*
            Se debe presentar el reporte que incluya
            información correspondiente oportuna
        */
        String reporte = "BILLETRA PAGO\n";
        
        reporte = String.format("%sCliente: %s %s\n"
                + "Edad: %d\n"
                + "Cedula: %s\n"
                + "Ciudad: %s\n"
                + "Mes: %s\n\n"
                + "Gasto Total: $%.2f\n",
                reporte,
                persona.obtenerNombre(),
                persona.obtenerApellido(),
                persona.obtenerEdad(),
                persona.obtenerCedula(),
                persona.obtenerCiudad().obtenerNombreCiudad(),
                mes,
                gastoPagos);
        
        return reporte;
    }
    
}
