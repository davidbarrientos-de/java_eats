package poo.java_eats;

/**
 * @author Alejandro Torres
 */

public abstract class Pedido{
    private int cantidad;
    private String comidas;  

    public Pedido(int cantidad, String Comidas) {
        this.cantidad = cantidad;
        this.comidas = Comidas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getComidas() {
        return comidas;
    }

    public void setComidas(String Comidas) {
        this.comidas = Comidas;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cantidad=" + cantidad + ", comidas=" + comidas + '}';
    }
}
