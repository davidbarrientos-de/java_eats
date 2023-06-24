package poo.java_eats;

import java.util.ArrayList;
import java.util.List;

/**
 * @author User
 */
public class Catering {

    private List<Comida> comidas;
    private double precioTotal;
    private List<String> servicios;
    private boolean espacioPrivado;

    public Catering(List<Comida> comidas, List<String> servicios,
            boolean espacioPrivado) {
        this.comidas = comidas;
        this.servicios = servicios;
        this.espacioPrivado = espacioPrivado;
    }

    public double calcularPrecioTotal() {
        double totalComidas = 0.0;
        for (Comida comida : comidas) {
            totalComidas += comida.getPrecioVenta();
        }
        double totalServicios = 0.0;
        for (String servicio : servicios) {
            if (servicio.equals("camareros")) {
                totalServicios += 800;
            } else if (servicio.equals("cocineros")) {
                totalServicios += 1000;
            } else if (servicio.equals("decoracion")) {
                totalServicios += 500;
            }
        }
        double espacio = 0.0;
        if (espacioPrivado) {
            espacio = 1000;
        }

        double precioTotal = totalComidas + totalServicios + espacio;
        return precioTotal;
        
    }

    public List<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(List<Comida> comidas) {
        this.comidas = comidas;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    public boolean isEspacioPrivado() {
        return espacioPrivado;
    }

    public void setEspacioPrivado(boolean espacioPrivado) {
        this.espacioPrivado = espacioPrivado;
    }
    
    

}
