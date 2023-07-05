package paquete003;

import java.util.ArrayList;

public abstract class TipoPago {
    
    protected double pagos;
    
    public abstract void calcularPagos();
    
    public double obternerPagos() {
        return pagos;
    }

    
}
