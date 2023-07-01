package poo.java_eatsLogica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UtilCliente {
    
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static Cliente cli;
    
    public static void setClientes(ArrayList<Cliente> c){
        clientes = c;
    }
    
    
    /** Registar un cliente
    * @param  cli
    * @return */
    public static boolean registroCliente (Cliente cli){
        if (consultaClientePorID(cli.getIdentificacion()) == null){
            clientes.add(cli);
            return true;
        } else {
            return false;
        }
    }
    
    public static Cliente consultaClientePorID(String Identificacion){
        //Comparador para ordenar los clientes por su identificacion
        Comparator IDcliComp = new Comparator(){
            
            
            @Override
            public int compare(Object o1, Object o2){
                Cliente c1 = (Cliente) o1;
                Cliente c2 = (Cliente) o2;
                return c1.getIdentificacion().compareTo(c2.getIdentificacion());
            }
        };
        //Ordenamos el array
        Collections.sort(clientes, IDcliComp);
        //creamos un Cliente con la ID a buscar
        Cliente c = new Cliente();
        c.setIdentificacion(Identificacion);
        int pos = Collections.binarySearch(clientes, c, IDcliComp);
        if (pos>=0){
            cli = clientes.get(pos);
        } else {
            cli = null;
        }
        return cli;
    }
    
    public static boolean IniciarSesion(Cliente cli){
        if (consultaClientePorCorreo(cli.getCorreo())==consultaClientePorClave(cli.getClave())){
            return true;
        } else {
            return false;
        }
    }
    
    public static Cliente consultaClientePorCorreo(String Correo){
        //Comparador para ordenar los clientes por su identificacion
        Comparator CorreocliComp = new Comparator(){
            
            
            @Override
            public int compare(Object o1, Object o2){
                Cliente c1 = (Cliente) o1;
                Cliente c2 = (Cliente) o2;
                return c1.getCorreo().compareTo(c2.getCorreo());
            }
        };
        //Ordenamos el array
        Collections.sort(clientes, CorreocliComp);
        //creamos un Cliente con la ID a buscar
        Cliente c = new Cliente();
        c.setCorreo(Correo);
        int pos = Collections.binarySearch(clientes, c, CorreocliComp);
        if (pos>=0){
            cli = clientes.get(pos);
        } else {
            cli = null;
        }
        return cli;
    }
    
    public static Cliente consultaClientePorClave(String Clave){
        //Comparador para ordenar los clientes por su identificacion
        Comparator ClavecliComp = new Comparator(){
            
            
            @Override
            public int compare(Object o1, Object o2){
                Cliente c1 = (Cliente) o1;
                Cliente c2 = (Cliente) o2;
                return c1.getClave().compareTo(c2.getClave());
            }
        };
        //Ordenamos el array
        Collections.sort(clientes, ClavecliComp);
        //creamos un Cliente con la ID a buscar
        Cliente c = new Cliente();
        c.setClave(Clave);
        int pos = Collections.binarySearch(clientes, c, ClavecliComp);
        if (pos>=0){
            cli = clientes.get(pos);
        } else {
            cli = null;
        }
        return cli;
    }
    
    public static void cargarDatos() {
        try{
            try(FileInputStream fiscli = new FileInputStream("DatosClientes.dat")){
                ObjectInputStream oiscli = new ObjectInputStream(fiscli);
                clientes = (ArrayList) oiscli.readObject();
            }
        } catch (IOException ioe){
            System.out.println("Error de IO: "+ioe.getMessage());
        } catch (ClassNotFoundException cnfe){
            System.out.println("Error de clase no encontrada: "+cnfe.getMessage());
        }
    }
    
    public static void guardarDatos(){
        try{
            if (!clientes.isEmpty()){
                try(FileOutputStream foscli = new FileOutputStream("DatosClientes.dat")){
                    ObjectOutputStream ooscli = new ObjectOutputStream(foscli);
                    ooscli.writeObject(clientes);
                }
            } else {
                System.out.println("Error no hay datos");
            }
        } catch (IOException ioe){
            System.out.println("Error de IO: " +ioe.getMessage());
        }   
    }
    
    public static void leerClientes(Cliente cli) throws IOException{
        String  rutaFicheroFactura = "/.Clientes.txt";
        
        try {
            File dirClientes = new File("/.Clientes");
            
            if (!dirClientes.exists()){
                dirClientes.mkdir();
            }
            
            FileWriter fw = new FileWriter(rutaFicheroFactura);
            try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {
                salida.println("-------------------------------------------------------------");
                salida.println("Tipo Cliente: "+ cli.getTipoCliente());
                salida.println("Identificacion: "+ cli.getIdentificacion());
                salida.println("Nombre: "+cli.getNombre());
                salida.println("Calle: "+cli.getCalle());
                salida.println("Numero: "+cli.getNumeroDireccion());
                salida.println("Codigo Postal: "+cli.getCP());
                salida.println("Ciudad: "+cli.getCiudad());
                salida.println("Titular de la tarjeta: "+cli.getTitularTarjeta());
                salida.println("Numero de la tarjeta: "+cli.getNumeroTarjeta());
                salida.println("Fecha de caducidad de la tarjeta. "+cli.getFechaCaducidad());
                salida.println("Numero de telefono: "+cli.getTelefono());
                salida.println("Web: "+cli.getWeb());
                salida.println("Correo: "+cli.getCorreo());
                salida.println("-------------------------------------------------------------");
            }
        } catch (IOException ioe){
            System.out.println("Error de IO: " + ioe.getMessage());
        }
    }
}
