package poo.java_eats;

import java.io.BufferedWriter;
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

public class UtilCliente{
    
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static Cliente objcli;

    public UtilCliente() {
        clientes = new ArrayList<>();
    }

    
    
    public static void setClientes(ArrayList<Cliente> c){
        clientes = c;
    }
    
    
    /** Registar un cliente
    * @param  objcli
    * @return */
    public static boolean registroCliente (Cliente objcli){
        if (consultaClientePorID(objcli.getIdentificacion()) == null){
            clientes.add(objcli);
            return true;
        } else {
            return false;
        }
    }
    
    public static String obtenerClaveporCorreo(String correo){
        for(Cliente cliente : clientes){
            if(cliente.getCorreo().equals(correo)){
                return cliente.getClave();
            }
        }
        return null;
    }
    
    public static String obtenerTCporCorreo(String correo){
        for(Cliente cliente : clientes){
            if(cliente.getCorreo().equals(correo)){
                return cliente.getTipoCliente();
            }
        }
        return null;
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
            objcli = clientes.get(pos);
        } else {
            objcli = null;
        }
        return objcli;
    }
    
    public static boolean IniciarSesion(Cliente objcli){
        if (consultaClientePorCorreo(objcli.getCorreo())==consultaClientePorClave(objcli.getClave())){
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
            objcli = clientes.get(pos);
        } else {
            objcli = null;
        }
        return objcli;
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
            objcli = clientes.get(pos);
        } else {
            objcli = null;
        }
        return objcli;
    }
    
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream fis = new FileInputStream("copiaclientes.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            clientes = (ArrayList) ois.readObject();
            fis.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    

    /** Guarda los datos de Productos en el fichero */
    public static void guardarDatos() {
         try {
            //Si hay datos los guardamos...
            if (!clientes.isEmpty()) {
                /****** Serialización de los objetos ******/
                //Serialización de las personas
                FileOutputStream fis = new FileOutputStream("copiaclientes.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fis);
                //guardamos el array de personas
                oos.writeObject(clientes);
                fis.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
    public static void almacenarClientes(Cliente objcli) throws IOException{
        FileWriter fw = new FileWriter("clientes.txt");
        try (PrintWriter salida = new PrintWriter(new BufferedWriter(fw))) {
            salida.println("-------------------------------------------------------------");
            salida.println("Tipo Cliente: "+ objcli.getTipoCliente());
            salida.println("Identificacion: "+ objcli.getIdentificacion());
            salida.println("Nombre: "+objcli.getNombre());
            salida.println("Calle: "+objcli.getCalle());
            salida.println("Numero: "+objcli.getNumeroDireccion());
            salida.println("Codigo Postal: "+objcli.getCP());
            salida.println("Ciudad: "+objcli.getCiudad());
            salida.println("Titular de la tarjeta: "+objcli.getTitularTarjeta());
            salida.println("Numero de la tarjeta: "+objcli.getNumeroTarjeta());
            salida.println("Fecha de caducidad de la tarjeta. "+objcli.getFechaCaducidad());
            salida.println("Numero de telefono: "+objcli.getTelefono());
            salida.println("Web: "+objcli.getWeb());
            salida.println("Correo: "+objcli.getCorreo());
            salida.println("-------------------------------------------------------------");
                
            salida.close();
        }    }
}
