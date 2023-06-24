package poo.java_eats;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashSet;
import poo.java_eats.Comida;

/**
 * @author Alejandro Torres
 */
public class Cliente extends Usuario{
    private String TipoCliente;
    private String DNI;
    private String CIF;
    private String Web;
    Boolean Registrarse;
    Boolean IniciarSesion;
    
    public HashSet<Comida> comidas;
    public HashSet<String> clientes;

    public Cliente(String TipoCliente, String DNI, String CIF, String Web, Boolean Registrarse, Boolean IniciarSesion, String Calle, String Ciudad, String Correo, String Clave, String CP, Date fechaCaducidad, String Nombre, int numeroDireccion, String numeroTarjeta, String nombreTitular, String titularTarjeta, String Telefono, String tipoUsuario) {
        super(Calle, Ciudad, Correo, Clave, CP, fechaCaducidad, Nombre, numeroDireccion, numeroTarjeta, nombreTitular, titularTarjeta, Telefono, tipoUsuario);
        this.TipoCliente = TipoCliente;
        this.DNI = DNI;
        this.CIF = CIF;
        this.Web = Web;
        this.Registrarse = Registrarse;
        this.IniciarSesion = IniciarSesion;
    } 

    
    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getWeb() {
        return Web;
    }

    public void setWeb(String Web) {
        this.Web = Web;
    }

    public BufferedReader getEntrada() {
        return entrada;
    }

    public void setEntrada(BufferedReader entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Cliente{" + "TipoCliente=" + TipoCliente + ", DNI=" + DNI + ", CIF=" + CIF + ", Web=" + Web + ", Registrarse=" + Registrarse + ", IniciarSesion=" + IniciarSesion + ", entrada=" + entrada + '}';
    }

    BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
    public void RegistroCliente() throws IOException {
        System.out.println("Iniciar Sesion o Registrarse");
        if (Registrarse==true){
            System.out.println("Particular o Empresa");
            TipoCliente = entrada.readLine();
            if(TipoCliente.equals("Particular")){
                try (BufferedWriter writer = new BufferedWriter (new FileWriter("Cliente_Particulares.txt", true))){
                    Cliente cli = new Cliente();
                    writer.write("Tipo Cliente: "+getTipoCliente());
                    cli.setTipoCliente("Tipo de Cliente: "+getTipoCliente());
                    writer.newLine();
                    writer.write("DNI: "+getDNI());
                    cli.setDNI("DNI: "+getDNI());
                    writer.newLine();
                    writer.write("Nombre: "+super.getNombre());
                    cli.setNombre("Nombre: "+getNombre());
                    writer.newLine();
                    writer.write("Correo: "+super.getCorreo());
                    cli.setCorreo("Correo: "+getCorreo());
                    writer.newLine();
                    writer.write("Clave: "+super.getClave());
                    cli.setClave("Clave: "+getClave());
                    writer.newLine();
                    writer.write("Calle: "+super.getCalle());
                    cli.setCalle("Calle: "+getCalle());
                    writer.newLine();
                    writer.write("Numero: "+super.getNumeroDireccion());
                    cli.setNumeroDireccion(getNumeroDireccion());
                    writer.newLine();
                    writer.write("Codigo Postal: "+super.getCP());
                    cli.setCP("Codigo Postal: "+getCP());
                    writer.newLine();
                    writer.write("Ciudad: "+super.getCiudad());
                    cli.setCiudad("Ciudad: "+getCiudad());
                    writer.newLine();
                    writer.write("Nombre del titular de la tarjeta: "+super.getNombreTitular());
                    cli.setNombreTitular("Nombre del titular de la tarjeta: "+getNombreTitular());
                    writer.newLine();
                    writer.write("Numero de la Tarjeta: "+super.getNumeroTarjeta());
                    cli.setNumeroTarjeta("Numero de la Tarjeta: "+getNumeroTarjeta());
                    writer.newLine();
                    writer.write("Fecha de caducidad de la tarjeta: "+super.getFechaCaducidad());
                    cli.setFechaCaducidad(getFechaCaducidad());
                    writer.newLine();
                    writer.write("Telefono: "+super.getTelefono());
                    cli.setTelefono("Telefono: "+super.getTelefono());
                    clientes.add(cli);
                }
            } else if (TipoCliente.equals("Empresa")){
                try (BufferedWriter writer = new BufferedWriter (new FileWriter("Clientes_Empresas.txt",true))){
                    Cliente cli = new Cliente();
                    writer.write("Tipo Cliente: "+getTipoCliente());
                    cli.setTipoCliente("Tipo de Cliente: "+getTipoCliente());
                    writer.newLine();
                    writer.write("CIF: "+getCIF());
                    cli.setCIF("CIF: "+getCIF());
                    writer.newLine();
                    writer.write("Nombre: "+super.getNombre());
                    cli.setNombre("Nombre: "+getNombre());
                    writer.newLine();
                    writer.write("Correo: "+super.getCorreo());
                    cli.setCorreo("Correo: "+getCorreo());
                    writer.newLine();
                    writer.write("Clave: "+super.getClave());
                    cli.setClave("Clave: "+getClave());
                    writer.newLine();
                    writer.write("Calle: "+super.getCalle());
                    cli.setCalle("Calle: "+getCalle());
                    writer.newLine();
                    writer.write("Numero: "+super.getNumeroDireccion());
                    cli.setNumeroDireccion(getNumeroDireccion());
                    writer.newLine();
                    writer.write("Codigo Postal: "+super.getCP());
                    cli.setCP("Codigo Postal: "+getCP());
                    writer.newLine();
                    writer.write("Ciudad: "+super.getCiudad());
                    cli.setCiudad("Ciudad: "+getCiudad());
                    writer.newLine();
                    writer.write("Nombre del titular de la tarjeta: "+super.getNombreTitular());
                    cli.setNombreTitular("Nombre del titular de la tarjeta: "+getNombreTitular());
                    writer.newLine();
                    writer.write("Numero de la Tarjeta: "+super.getNumeroTarjeta());
                    cli.setNumeroTarjeta("Numero de la Tarjeta: "+getNumeroTarjeta());
                    writer.newLine();
                    writer.write("Fecha de caducidad de la tarjeta: "+super.getFechaCaducidad());
                    cli.setFechaCaducidad(getFechaCaducidad());
                    writer.write("Telefono: "+super.getTelefono());
                    writer.newLine();
                    cli.setTelefono("Telefono: "+super.getTelefono());
                    writer.newLine();
                    writer.write("Web: "+getWeb());
                    cli.setWeb("Web: "+getWeb());
                    clientes.add(cli);
                }
            }
        }  
    }
    
    public void IniciarSesion() throws IOException{
        if (IniciarSesion==true){
            System.out.println("Correo: ");
            Correo = entrada.readLine();
            System.out.println("Contraseña: ");
            Clave = entrada.readLine();
            if (clientes.contains(Correo) && clientes.contains(Clave)){
                System.out.println("Iniciando Sesion...");
            } else {
                System.out.println("El correo electronico o la contraseña son incorrectos");
            }
        }
    }
    public void BuscarComida() throws IOException{
        String Busqueda;
        System.out.println("Buscar: ");
        Busqueda = entrada.readLine();
        if (comidas.contains(Busqueda)){
            System.out.println(comidas.toString());
        } else {
            System.out.println(""+Busqueda+" no encotrada");
        }
    }
    public void ComprarComida(){
        
        
    }
    
    public void OpinarRestaurantes() throws IOException{
        int estrellas;
        String Reseña;
        System.out.println("Estrellas (0-5): ");
        estrellas=entrada.read();
        if ((estrellas>=0)&&(estrellas<=5)){
            System.out.println("Deje su reseña: ");
            Reseña=entrada.readLine();
        } else {
            System.out.println("Puntuacion no valida");
        }
        
        
    }
    
    public void ModificarDatos(){
        clientes.put(cli.getDNI(), cli);
        System.out.println(clientes.toString());
        Cliente obj = clientes.get(""+DNI);
        System.out.println("Nombre: "+obj.getNombre());
        obj.setNombre("Nuevo Nombre: ");
        
        System.out.println(clientes.toString());
    }
    
}

