/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.java_eats;

import java.util.List;

/**
 *
 * @author User
 */
public class Menú {
    protected String titulo;
    private List<String> comidas;
    private double precioVenta;
    private String fotografia;
    
    
    public Menú(String titulo, List<String> comidas, double precioVenta, String fotografia){
        this.comidas = comidas;
        this.fotografia = fotografia;
        this.precioVenta = precioVenta;
        this.titulo = titulo;
        
        
        
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<String> getComidas() {
        return comidas;
    }

    public void setComidas(List<String> comidas) {
        this.comidas = comidas;
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
    
}
