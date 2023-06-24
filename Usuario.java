package poo.java_eats;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
/**
 * @author aleja
 */
public abstract class Usuario {
    private String Calle;
    private String Ciudad;
    protected String Correo;
    protected String Clave;
    private String CP;
    private Date fechaCaducidad; // Caducidad de la tatrjeta de credito//
    private String Nombre; //Nombre del cliente, empresa o restaurante//
    private int numeroDireccion;
    private String numeroTarjeta;
    private String nombreTitular;
    private String titularTarjeta;
    private String Telefono;
    private String tipoUsuario;

    public Usuario(String Calle, String Ciudad, String Correo, String Clave, String CP, Date fechaCaducidad, String Nombre, int numeroDireccion, String numeroTarjeta, String nombreTitular, String titularTarjeta, String Telefono, String tipoUsuario) {
        this.Calle = Calle;
        this.Ciudad = Ciudad;
        this.Correo = Correo;
        this.Clave = Clave;
        this.CP = CP;
        this.fechaCaducidad = fechaCaducidad;
        this.Nombre = Nombre;
        this.numeroDireccion = numeroDireccion;
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.titularTarjeta = titularTarjeta;
        this.Telefono = Telefono;
        this.tipoUsuario = tipoUsuario;
    }



    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public int getNumeroDireccion() {
        return numeroDireccion;
    }

    public void setNumeroDireccion(int numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre (String Nombre){
        this.Nombre = Nombre;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTitularTarjeta() {
        return titularTarjeta;
    }

    public void setTitularTarjeta(String titularTarjeta) {
        this.titularTarjeta = titularTarjeta;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    } 

    @Override
    public String toString() {
        return "Usuario{" + "Calle=" + Calle + ", Ciudad=" + Ciudad + ", Correo=" + Correo + ", Clave=" + Clave + ", CP=" + CP + ", fechaCaducidad=" + fechaCaducidad + ", Nombre=" + Nombre + ", numeroDireccion=" + numeroDireccion + ", numeroTarjeta=" + numeroTarjeta + ", nombreTitular=" + nombreTitular + ", titularTarjeta=" + titularTarjeta + ", Telefono=" + Telefono + ", tipoUsuario=" + tipoUsuario + '}';
    }

}
