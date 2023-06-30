package poo.java_eatsFicheros;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class FicheroClientes {

    public static void main(String[] args) {
        // TODO code application logic here
        leer();
    }

    public static void leer() {
        String cad;
        try {
            FileInputStream fis = new FileInputStream("clientes.txt");
            InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-1");
            BufferedReader br = new BufferedReader(isr);

            String cadena = "";
            String array[];
            while ((cad = br.readLine()) != null) {
                System.out.println(cad);
                array = cad.split(";");
            }
            //Cerramos el stream
            br.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}