package poo.java_eats;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author User
 */
public class Restaurantes {

    private String cif;
    private String nombre;
    private Direccion direccion;
    private String especialidad;
    private double calificacion;
    private double gastosEnvio;
    private int tiempoEnvio;
    private boolean cateringparaEmpresas;
    private List<Comida> menu;

    public Restaurantes(String cif, String nombre, Direccion direccion, String especialidad, double calificacion, double gastosEnvio, int tiempoEnvio, boolean cateringParaEmpresas) {

        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.calificacion = calificacion;
        this.gastosEnvio = gastosEnvio;
        this.tiempoEnvio = tiempoEnvio;
        this.cateringparaEmpresas = cateringparaEmpresas;
        this.menu = new ArrayList<>();

    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getTiempoEnvio() {
        return tiempoEnvio;
    }

    public void setTiempoEnvio(int tiempoEnvio) {
        this.tiempoEnvio = tiempoEnvio;
    }

    public boolean isCateringparaEmpresas() {
        return cateringparaEmpresas;
    }

    public void setCateringparaEmpresas(boolean cateringparaEmpresas) {
        this.cateringparaEmpresas = cateringparaEmpresas;
    }

    public List<Comida> getMenu() {
        return menu;
    }

    public void setMenu(List<Comida> menu) {
        this.menu = menu;
    }

    public void guardarDatos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos_restaurante.txt"))) {
            writer.write("CIF: " + cif);
            writer.newLine();
            writer.write("Nombre: " + nombre);
            writer.newLine();
            writer.write("Dirección: " + direccion.getCalle() + " " + direccion.getNumero());
            writer.newLine();
            writer.write("Código Postal: " + direccion.getCodigoPostal());
            writer.newLine();
            writer.write("Ciudad: " + direccion.getCiudad());
            writer.newLine();
            writer.write("Especialidad: " + especialidad);
            writer.newLine();
            writer.write("Calificación: " + calificacion);
            writer.newLine();
            writer.write("Gastos de envío: " + gastosEnvio);
            writer.newLine();
            writer.write("Tiempo de envío: " + tiempoEnvio);
            writer.newLine();
            writer.write("Ofrece catering para empresas: " + cateringparaEmpresas);
            writer.newLine();

            for (Comida comida : menu) {
                writer.newLine();
                writer.write("Comida:");
                writer.newLine();
                writer.write("Título: " + comida.getTitulo());
                writer.newLine();
                writer.write("Ingredientes: " + comida.getIngredientes());
                writer.newLine();
                writer.write("Precio de venta: " + comida.getPrecioVenta());
                writer.newLine();
                writer.write("Fotografía: " + comida.getFotografia());
                writer.newLine();
            }

            System.out.println("Los datos del restaurante se han guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar los datos del restaurante: " + e.getMessage());
        }
    }

}
