package poo.java_eatsLogica;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
/**
 * @author aleja
 */
public class Usuario {
    protected String Identificacion;
    protected String Nombre; //Nombre del cliente, empresa o restaurante//
    protected String Calle;
    protected int numeroDireccion;
    protected int CP;
    protected String Ciudad;
    protected String titularTarjeta;
    protected String numeroTarjeta;
    protected String fechaCaducidad; // Caducidad de la tatrjeta de credito//
    protected String Telefono;
    protected String Correo;
    protected String Clave;

    public Usuario(String Identificacion, String Nombre, String Calle, int numeroDireccion, int CP, String Ciudad, String titularTarjeta, String numeroTarjeta, String fechaCaducidad, String Telefono, String Correo, String Clave) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.Calle = Calle;
        this.numeroDireccion = numeroDireccion;
        this.CP = CP;
        this.Ciudad = Ciudad;
        this.titularTarjeta = titularTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Clave = Clave;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public int getNumeroDireccion() {
        return numeroDireccion;
    }

    public void setNumeroDireccion(int numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getTitularTarjeta() {
        return titularTarjeta;
    }

    public void setTitularTarjeta(String titularTarjeta) {
        this.titularTarjeta = titularTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
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

    @Override
    public String toString() {
        return "Usuario{" + "Identificacion=" + Identificacion + ", Nombre=" + Nombre + ", Calle=" + Calle + ", numeroDireccion=" + numeroDireccion + ", CP=" + CP + ", Ciudad=" + Ciudad + ", titularTarjeta=" + titularTarjeta + ", numeroTarjeta=" + numeroTarjeta + ", fechaCaducidad=" + fechaCaducidad + ", Telefono=" + Telefono + ", Correo=" + Correo + ", Clave=" + Clave + '}';
    }

 

    
}


