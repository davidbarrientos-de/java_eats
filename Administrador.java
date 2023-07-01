package poo.java_eatsLogica;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;

public class Administrador extends Cliente { 
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    private HashSet<String> clientes;

    public Administrador(String Identificacion, String Nombre, String Calle, int numeroDireccion, int CP, String Ciudad, String titularTarjeta, String numeroTarjeta, String fechaCaducidad, String Telefono, String Correo, String Clave) {
        super(Identificacion, Nombre, Calle, numeroDireccion, CP, Ciudad, titularTarjeta, numeroTarjeta, fechaCaducidad, Telefono, Correo, Clave);
    }

 

    public void AccesoAdministrador(){
    try {
        System.out.println("Correo: ");
        Correo = entrada.readLine();
        System.out.println("Clave: ");
        Clave = entrada.readLine();
    } catch (IOException ioe){
        System.out.println("Error entrada/salida: " +ioe.toString());
    }
    if (Correo.equals("admin@javaeats.com")){
        if (Clave.equals("admin")){
            System.out.println("Credenciales correctas, iniciando sesison");
        } else {
            System.out.println("Clave Incorrecta");}
    } else {
       System.out.println("Usuario o contraseñas incorrectos");}
    }
    
    public static void main(String[] args){
        HashSet<String> clientes = new HashSet<>();
        for (String elementos : clientes){
           System.out.println(elementos);
        }
    } 
    public void ConsultarRestaurantes(){
        
    }
    public void ConsultarVentas(){
        String cadena;
        try{
            FileInputStream fis = new FileInputStream ("datos_ventas.txt");
            InputStreamReader isr = new InputStreamReader(fis, " ");
            try (BufferedReader br = new BufferedReader(isr)) {
                while ((cadena = br.readLine()) != null){
                    System.out.println(cadena);
                }
            }
        } catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}

    

