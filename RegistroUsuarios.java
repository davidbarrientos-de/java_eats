package poo.java_eatsLogica;

import java.util.ArrayList;
import java.util.List;

public class RegistroUsuarios {
    private List<Usuario> clientes;
    
    public RegistroUsuarios(){
        clientes = new ArrayList<>();
    }
    
    public void registrarUsuarios(String Identificacion, String Nombre,String Calle, int Numero, int CP, String Ciudad, String TitularTarjeta, String NumeroTarjeta, String FechaCaducidad, String Telefono, String Correo, String Clave){
        
        Usuario nuevoUsuario = new Usuario(Identificacion, Nombre, Calle,Numero, CP, Ciudad, TitularTarjeta, NumeroTarjeta, FechaCaducidad, Telefono, Correo, Clave);
        clientes.add(nuevoUsuario);
    }
}

