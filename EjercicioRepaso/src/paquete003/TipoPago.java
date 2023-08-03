package paquete003;


public abstract class TipoPago {
    
    protected double pagos;
    
    public abstract void calcularPagos();
    
    public double obternerPagos() {
        return pagos;
    }

    
}
