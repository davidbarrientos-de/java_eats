package poo.java_eats;

import poo.java_eats.Comida;
import poo.java_eats.Restaurantes;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * @author User
 */
public class Ventas {

    private List<Comida> carrito;
    private Cliente cliente;
    private Restaurantes restaurante;
    private Date fecha;

    public Ventas(Cliente cliente, Restaurantes restaurante) {
        this.cliente = cliente;
        this.restaurante = restaurante;
        this.carrito = new ArrayList<>();
        this.fecha = new Date();
    }

    public void agregarAlCarrito(Comida comida) {
        carrito.add(comida);
    }

    public void eliminarDelCarrito(Comida comida) {
        carrito.remove(comida);
    }

    public void almacenarDatos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos_ventas.txt", true))) {
            writer.write("Fecha: " + fecha);
            writer.newLine();
            writer.write("Cliente:");
            writer.newLine();
            writer.write("DNI: " + cliente.getDNI());
            writer.newLine();
            writer.write("Nombre: " + cliente.getNombre());
            writer.newLine();
            writer.write("Restaurante:");
            writer.newLine();
            writer.write("CIF: " + restaurante.getCif());
            writer.newLine();
            writer.write("Nombre: " + restaurante.getNombre());
            writer.newLine();
            writer.write("Carrito de compras:");
            writer.newLine();

            for (Comida comida : carrito) {
                writer.write("- Título: " + comida.getTitulo());
                writer.newLine();
                writer.write("  Precio de venta: " + comida.getPrecioVenta());
                writer.newLine();
            }

            writer.newLine();
            writer.write("=======================================");
            writer.newLine();

            System.out.println("Los datos de la venta se han almacenado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al almacenar los datos de la venta: " + e.getMessage());
        }
    }

    public void generarFactura() {
        System.out.println("Factura de la venta:");
        System.out.println("====================");
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente:");
        System.out.println("DNI: " + cliente.getDNI());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Restaurante:");
        System.out.println("CIF: " + restaurante.getCif());
        System.out.println("Nombre: " + restaurante.getNombre());
        System.out.println("Carrito de compras:");

        double total = 0.0;
        for (Comida comida : carrito) {
            System.out.println("- Título: " + comida.getTitulo());
            System.out.println("  Precio de venta: " + comida.getPrecioVenta());
            total += comida.getPrecioVenta();
        }

        System.out.println("====================");
        System.out.println("Total: " + total);
    }
    
}
