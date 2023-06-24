package poo.java_eats;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
 
public class Comida {
    protected String titulo;
    private List<String> ingredientes;
    private double precioVenta;
    private String fotografia;
    private double Cantidad;
   
    
    public Comida(String titulo, List<String> ingredientes, double precioVenta, String fotografia,double Cantidad){
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.precioVenta = precioVenta;
        this.fotografia = fotografia;
        this.Cantidad = Cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
    
    
    
    
    
}
