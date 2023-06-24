package Java_EatsGrfica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import poo.java_eats.Cliente;

public class Registrar extends javax.swing.JFrame {

    public HashSet<String> clientes = new HashSet<>();
    public Registrar() {
        initComponents();
    }

    public Registrar(JButton jButtonRegistarse, JComboBox<String> jComboBoxTipoCliente, JFormattedTextField jFormattedTextFieldCP, JFormattedTextField jFormattedTextFieldTelefono, JFormattedTextField jFormattedTextNumero, JFormattedTextField jFormatted_Identificacion, JTextField jTextField4, JTextField jTextFieldCalle, JTextField jTextFieldCiudad, JTextField jTextFieldClave, JTextField jTextFieldClave2, JTextField jTextFieldCorreo, JTextField jTextFieldNombre, JTextField jTextFieldWeb) {
        this.jButtonRegistarse = jButtonRegistarse;
        this.jComboBoxTipoCliente = jComboBoxTipoCliente;
        this.jFormattedTextFieldCP = jFormattedTextFieldCP;
        this.jFormattedTextFieldTelefono = jFormattedTextFieldTelefono;
        this.jFormattedTextNumero = jFormattedTextNumero;
        this.jFormatted_Identificacion = jFormatted_Identificacion;
        this.jTextField4 = jTextField4;
        this.jTextFieldCalle = jTextFieldCalle;
        this.jTextFieldCiudad = jTextFieldCiudad;
        this.jTextFieldClave = jTextFieldClave;
        this.jTextFieldClave2 = jTextFieldClave2;
        this.jTextFieldCorreo = jTextFieldCorreo;
        this.jTextFieldNombre = jTextFieldNombre;
        this.jTextFieldWeb = jTextFieldWeb;
    }

    public JButton getjButtonRegistarse() {
        return jButtonRegistarse;
    }

    public void setjButtonRegistarse(JButton jButtonRegistarse) {
        this.jButtonRegistarse = jButtonRegistarse;
    }

    public JComboBox<String> getjComboBoxTipoCliente() {
        return jComboBoxTipoCliente;
    }

    public void setjComboBoxTipoCliente(JComboBox<String> jComboBoxTipoCliente) {
        this.jComboBoxTipoCliente = jComboBoxTipoCliente;
    }

    public JFormattedTextField getjFormattedTextFieldCP() {
        return jFormattedTextFieldCP;
    }

    public void setjFormattedTextFieldCP(JFormattedTextField jFormattedTextFieldCP) {
        this.jFormattedTextFieldCP = jFormattedTextFieldCP;
    }

    public JFormattedTextField getjFormattedTextFieldTelefono() {
        return jFormattedTextFieldTelefono;
    }

    public void setjFormattedTextFieldTelefono(JFormattedTextField jFormattedTextFieldTelefono) {
        this.jFormattedTextFieldTelefono = jFormattedTextFieldTelefono;
    }

    public JFormattedTextField getjFormattedTextNumero() {
        return jFormattedTextNumero;
    }

    public void setjFormattedTextNumero(JFormattedTextField jFormattedTextNumero) {
        this.jFormattedTextNumero = jFormattedTextNumero;
    }

    public JFormattedTextField getjFormatted_Identificacion() {
        return jFormatted_Identificacion;
    }

    public void setjFormatted_Identificacion(JFormattedTextField jFormatted_Identificacion) {
        this.jFormatted_Identificacion = jFormatted_Identificacion;
    }

    public JTextField getjTextField4() {
        return jTextField4;
    }

    public void setjTextField4(JTextField jTextField4) {
        this.jTextField4 = jTextField4;
    }

    public JTextField getjTextFieldCalle() {
        return jTextFieldCalle;
    }

    public void setjTextFieldCalle(JTextField jTextFieldCalle) {
        this.jTextFieldCalle = jTextFieldCalle;
    }

    public JTextField getjTextFieldCiudad() {
        return jTextFieldCiudad;
    }

    public void setjTextFieldCiudad(JTextField jTextFieldCiudad) {
        this.jTextFieldCiudad = jTextFieldCiudad;
    }

    public JTextField getjTextFieldClave() {
        return jTextFieldClave;
    }

    public void setjTextFieldClave(JTextField jTextFieldClave) {
        this.jTextFieldClave = jTextFieldClave;
    }

    public JTextField getjTextFieldClave2() {
        return jTextFieldClave2;
    }

    public void setjTextFieldClave2(JTextField jTextFieldClave2) {
        this.jTextFieldClave2 = jTextFieldClave2;
    }

    public JTextField getjTextFieldCorreo() {
        return jTextFieldCorreo;
    }

    public void setjTextFieldCorreo(JTextField jTextFieldCorreo) {
        this.jTextFieldCorreo = jTextFieldCorreo;
    }

    public JTextField getjTextFieldNombre() {
        return jTextFieldNombre;
    }

    public void setjTextFieldNombre(JTextField jTextFieldNombre) {
        this.jTextFieldNombre = jTextFieldNombre;
    }

    public JTextField getjTextFieldWeb() {
        return jTextFieldWeb;
    }

    public void setjTextFieldWeb(JTextField jTextFieldWeb) {
        this.jTextFieldWeb = jTextFieldWeb;
    }
    
    BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
    public void RegistroCliente() throws IOException {
        try (BufferedWriter writer = new BufferedWriter (new FileWriter("Cliente_Particulares.txt", true))){
                    
                    writer.write("Tipo Cliente: "+getjComboBoxTipoCliente());
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
                }}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelTipoCliente = new javax.swing.JLabel();
        jLabel_Identificaion = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelClave = new javax.swing.JLabel();
        jLabelCalle = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelCP = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelWeb = new javax.swing.JLabel();
        jLabelClave2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldNombre = new javax.swing.JTextField();
        jFormattedTextNumero = new javax.swing.JFormattedTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jFormattedTextFieldCP = new javax.swing.JFormattedTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldWeb = new javax.swing.JTextField();
        jFormatted_Identificacion = new javax.swing.JFormattedTextField();
        jTextFieldCalle = new javax.swing.JTextField();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jTextFieldClave = new javax.swing.JTextField();
        jTextFieldClave2 = new javax.swing.JTextField();
        jComboBoxTipoCliente = new javax.swing.JComboBox<>();
        jButtonRegistarse = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaEats - Registrar");

        jLabelTipoCliente.setText("Tipo de Cliente");

        jLabel_Identificaion.setText("DNI/CIF");

        jLabelNombre.setText("Nombre:");

        jLabelCorreo.setText("Correo:");

        jLabelClave.setText("Contraseña:");

        jLabelCalle.setText("Calle: ");

        jLabelNumero.setText("Numero:");

        jLabelCP.setText("Codigo Postal:");

        jLabelCiudad.setText("Ciudad:");

        jLabelTelefono.setText("Telefono:");

        jLabelWeb.setText("Web:");

        jLabelClave2.setText("Confirmar contraseña:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelTipoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jLabel_Identificaion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabelCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelWeb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jLabelCiudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelClave2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTipoCliente)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Identificaion)
                .addGap(18, 18, 18)
                .addComponent(jLabelNombre)
                .addGap(18, 18, 18)
                .addComponent(jLabelCalle)
                .addGap(18, 18, 18)
                .addComponent(jLabelNumero)
                .addGap(18, 18, 18)
                .addComponent(jLabelCP)
                .addGap(18, 18, 18)
                .addComponent(jLabelCiudad)
                .addGap(18, 18, 18)
                .addComponent(jLabelTelefono)
                .addGap(18, 18, 18)
                .addComponent(jLabelWeb)
                .addGap(18, 18, 18)
                .addComponent(jLabelCorreo)
                .addGap(18, 18, 18)
                .addComponent(jLabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelClave2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldCalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCalleActionPerformed(evt);
            }
        });

        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Particular", "Empresa" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormatted_Identificacion)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldCalle)
                    .addComponent(jFormattedTextNumero)
                    .addComponent(jFormattedTextFieldCP)
                    .addComponent(jTextFieldCiudad)
                    .addComponent(jFormattedTextFieldTelefono)
                    .addComponent(jTextFieldWeb)
                    .addComponent(jTextFieldCorreo)
                    .addComponent(jTextFieldClave)
                    .addComponent(jTextFieldClave2)
                    .addComponent(jComboBoxTipoCliente, 0, 164, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jComboBoxTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormatted_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldClave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jButtonRegistarse.setText("Resgistrarse");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jButtonRegistarse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButtonRegistarse)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCalleActionPerformed


    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistarse;
    private javax.swing.JComboBox<String> jComboBoxTipoCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldCP;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JFormattedTextField jFormattedTextNumero;
    private javax.swing.JFormattedTextField jFormatted_Identificacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCP;
    private javax.swing.JLabel jLabelCalle;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelClave2;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoCliente;
    private javax.swing.JLabel jLabelWeb;
    private javax.swing.JLabel jLabel_Identificaion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldClave2;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldWeb;
    // End of variables declaration//GEN-END:variables
}
