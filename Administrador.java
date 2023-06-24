package poo.java_eats;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;

/**
 * @author Alejandro Torres
 */


public class Administrador extends Usuario { 
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public Administrador(String Calle, String Ciudad, String Correo, 
            String Clave, String CP, Date fechaCaducidad, String Nombre, 
            int numeroDireccion, String numeroTarjeta, String nombreTitular, 
            String titularTarjeta, String Telefono, String tipoUsuario, 
            ArrayList lista_clientes) {
        super(Calle, Ciudad, Correo, Clave, CP, fechaCaducidad, Nombre, 
                numeroDireccion, numeroTarjeta, nombreTitular, titularTarjeta, 
                Telefono, tipoUsuario, lista_clientes);
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
    
    public void ConsultaUsuarios(){
        for (int i=0; i<1000; i++){
           System.out.println(clientes.get(i));
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


    

