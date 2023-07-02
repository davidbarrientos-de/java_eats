package poo.java_eats;

import java.io.Serializable;


public class Cliente implements Serializable{
    private String TipoCliente;
    private String Identificacion;
    private String Nombre; //Nombre del cliente, empresa o restaurante//
    private String Calle;
    private int numeroDireccion;
    private int CP;
    private String Ciudad;
    private String titularTarjeta;
    private String numeroTarjeta;
    private String fechaCaducidad; // Caducidad de la tatrjeta de credito//
    private String Telefono;
    private String Web;
    private String Correo;
    private String Clave;

    public Cliente() {
    }

    public Cliente(String TipoCliente, String Identificacion, String Nombre, String Calle, int numeroDireccion, int CP, String Ciudad, String titularTarjeta, String numeroTarjeta, String fechaCaducidad, String Telefono, String Web, String Correo, String Clave) {
        this.TipoCliente = TipoCliente;
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
        this.Web = Web;
        this.Correo = Correo;
        this.Clave = Clave;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public void setTipoCliente(String TipoCliente) {
        this.TipoCliente = TipoCliente;
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

    public String getWeb() {
        return Web;
    }

    public void setWeb(String Web) {
        this.Web = Web;
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
        return "Cliente{" + "TipoCliente=" + TipoCliente + ", Identificacion=" + Identificacion + ", Nombre=" + Nombre + ", Calle=" + Calle + ", numeroDireccion=" + numeroDireccion + ", CP=" + CP + ", Ciudad=" + Ciudad + ", titularTarjeta=" + titularTarjeta + ", numeroTarjeta=" + numeroTarjeta + ", fechaCaducidad=" + fechaCaducidad + ", Telefono=" + Telefono + ", Web=" + Web + ", Correo=" + Correo + ", Clave=" + Clave + '}';
    }

   

    
}


