/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.java_eats;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import poo.java_eats.CarritoCompra;
import poo.java_eats.Cliente;
import poo.java_eats.Comida;
import poo.java_eats.Restaurantes;

/**
 *
 * @author User
 */
public class UtilApp {

    private static ArrayList<Restaurantes> restaurantes = new ArrayList<>();
    private static Restaurantes rest;

    public static ArrayList<Restaurantes> getRestaurantesPorNombre() {
        //Comparador para ordenar los Restaurantes por su nombre
        Comparator NomproComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Restaurantes r1 = (Restaurantes) o1;
                Restaurantes r2 = (Restaurantes) o2;
                return r1.getNombre().compareTo(r2.getNombre());
            }
        };
        //Ordenamos el array
        Collections.sort(restaurantes, NomproComp);
        return restaurantes;
    }

    public static ArrayList<Restaurantes> getRestaurantesPorPrecio() {
        //Comparador para ordenar los Restaurantes por su precio
        Comparator PrecioComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Restaurantes r1 = (Restaurantes) o1;
                Restaurantes r2 = (Restaurantes) o2;
                Double pr1 = r1.getGastosEnvio();
                Double pr2 = r2.getGastosEnvio();
                return pr1.compareTo(pr2);
            }
        };
        //Ordenamos el array
        Collections.sort(restaurantes, PrecioComp);
        return restaurantes;
    }
    
    
    public static ArrayList<Restaurantes> getRestaurantesPorCodigoPostal() {
        //Comparador para ordenar los Restaurantes por su codiog postal
        Comparator CodigoPost = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Restaurantes r1 = (Restaurantes) o1;
                Restaurantes r2 = (Restaurantes) o2;
                Direccion pr1 = r1.getDireccion();
                Direccion pr2 = r2.getDireccion();
                return pr1.compareTo(pr2);
            }
        };
        //Ordenamos el array
        Collections.sort(restaurantes, CodigoPost);
        return restaurantes;
    }
    public static ArrayList<Restaurantes> getRestaurantesPorTiempo() {
        //Comparador para ordenar los Restaurantes por su tiempo de envio
        Comparator TiempoComp;
        TiempoComp = new Comparator() {
            
            @Override
            public int compare(Object o1, Object o2) {
                Restaurantes r1 = (Restaurantes) o1;
                Restaurantes r2 = (Restaurantes) o2;
                Double t1 = r1.getTiempoEnvio();
                Double t2 = r2.getTiempoEnvio();
                return t1.compareTo(t2);
            }
        };
        //Ordenamos el array
        Collections.sort(restaurantes, TiempoComp);
        return restaurantes;
    }
    
    public static ArrayList<Restaurantes> getRestaurantesPorCalificacion() {
        //Comparador para ordenar los Restaurantes por su calificacion
        Comparator Calific = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Restaurantes r1 = (Restaurantes) o1;
                Restaurantes r2 = (Restaurantes) o2;
                Double pr1 = r1.getCalificacion();
                Double pr2 = r2.getCalificacion();
                return pr1.compareTo(pr2);
            }
        };
        //Ordenamos el array
        Collections.sort(restaurantes, Calific);
        return restaurantes;
    }

    /**
     * Da de alta un Restaurante
     *
     * @param objpro
     * @return
     */
    public static boolean altaProducto(Restaurantes rest) {
        if (consultaRestaurantesPorCif(rest.getCif()) == null) {
            restaurantes.add(rest);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Da de baja una Restaurante
     *
     * @param objpro
     * @return
     */
    public static boolean bajaRestaurante(Restaurantes objpro) {
        if (restaurantes.contains(rest)) {
            restaurantes.remove(rest);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devuelve un Restaurante por la posición dentro del ArrayList
     *
     * @param indice
     * @return
     */
    public static Restaurantes consultaProducto(int indice) {
        rest = restaurantes.get(indice);
        return rest;
    }

    /**
     * Carga los datos de Restaurantes del fichero
     */
    public static void cargarDatos() {
        try {
            try (FileInputStream istreampro = new FileInputStream("copiasegpro.dat")) {
                ObjectInputStream oispro = new ObjectInputStream(istreampro);
                restaurantes = (ArrayList) oispro.readObject();
            }
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        }
    }//fin cargarDatos

    /**
     * Guarda los datos de Restaurantes en el fichero
     */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!restaurantes.isEmpty()) {
                try (FileOutputStream ostreampro = new FileOutputStream("copiasegpro.dat")) {
                    ObjectOutputStream oospro = new ObjectOutputStream(ostreampro);
                    //guardamos el array de Productos
                    oospro.writeObject(restaurantes);
                }
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }//fin guardarDatos

    /**
     * Crea un fichero de texto con los datos de una venta
     *
     * @param pro
     * @param cantidad
     * @throws java.io.IOException
     */
    public static void generaFactura(Restaurantes rest,Cliente cli, CarritoCompra carri,  int cantidad, String fecha, Iterable<Comida> carrito) throws IOException {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fn = hoy.format(formatoCorto);
        String rutaFicheroFactura = "./Facturas/Factura(" + fn.replace('/', '_') + ").txt";
        double importe = rest.getGastosEnvio() * cantidad;
        try {
            //Si no existe el directorio Facturas, lo creamos
            File dirFacturas = new File("./Facturas");

            if (!dirFacturas.exists()) {
                dirFacturas.mkdir();
            }

            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {
                System.out.println("Factura de la venta:");
                System.out.println("====================");
                System.out.println("Fecha: " + fecha);
                System.out.println("Cliente:");
                System.out.println("DNI: " + cli.getDNI());
                System.out.println("Nombre: " + cli.getNombre());
                System.out.println("Restaurante:");
                System.out.println("CIF: " + rest.getCif());
                System.out.println("Nombre: " + rest.getNombre());
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

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        }//fin generaFactura

    }

    private static Object consultaRestaurantesPorCif(String cif) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
