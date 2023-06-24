package poo.java_eats;

/**
 * @author Alejandro Torres 
 */
public class CarritoCompra {
    private boolean Catering;
    private boolean Descuento;
    private boolean Pago;

    public CarritoCompra(boolean Catering, boolean Descuento, boolean Pago) {
        this.Catering = Catering;
        this.Descuento = Descuento;
        this.Pago = Pago;
    }

    public boolean isCatering() {
        return Catering;
    }

    public void setCatering(boolean Catering) {
        this.Catering = Catering;
    }

    public boolean isDescuento() {
        return Descuento;
    }

    public void setDescuento(boolean Descuento) {
        this.Descuento = Descuento;
    }

    public boolean isPago() {
        return Pago;
    }

    public void setPago(boolean Pago) {
        this.Pago = Pago;
    }

    @Override
    public String toString() {
        return "CarritoCompra{" + "Catering=" + Catering + ", Descuento=" + Descuento + ", Pago=" + Pago + '}';
    }
    
}
