package poo.java_eatsGrafica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import poo.java_eatsLogica.Cliente;

public class Particular extends javax.swing.JFrame {
    private String CIF;
    private String Web;
    public HashSet<Cliente> clientes = new HashSet<>();
    public Particular() {
        initComponents();
    }

    public Particular(String CIF, String Web, JFormattedTextField jFormattedDNI, JFormattedTextField jFormattedTextFieldCP, JFormattedTextField jFormattedTextFieldFechaCaducidad, JFormattedTextField jFormattedTextFieldNumero, JFormattedTextField jFormattedTextFieldNumeroTarjeta, JFormattedTextField jFormattedTextFieldTelefono, JPasswordField jPasswordFieldClave, JTextField jTextFieldCalle, JTextField jTextFieldCiudad, JTextField jTextFieldCorreo, JTextField jTextFieldNombre, JTextField jTextFieldTipoCliente, JTextField jTextFieldTitularTarjeta) {
        this.CIF = CIF;
        this.Web = Web;
        this.jFormattedDNI = jFormattedDNI;
        this.jFormattedTextFieldCP = jFormattedTextFieldCP;
        this.jFormattedTextFieldFechaCaducidad = jFormattedTextFieldFechaCaducidad;
        this.jFormattedTextFieldNumero = jFormattedTextFieldNumero;
        this.jFormattedTextFieldNumeroTarjeta = jFormattedTextFieldNumeroTarjeta;
        this.jFormattedTextFieldTelefono = jFormattedTextFieldTelefono;
        this.jPasswordFieldClave = jPasswordFieldClave;
        this.jTextFieldCalle = jTextFieldCalle;
        this.jTextFieldCiudad = jTextFieldCiudad;
        this.jTextFieldCorreo = jTextFieldCorreo;
        this.jTextFieldNombre = jTextFieldNombre;
        this.jTextFieldTipoCliente = jTextFieldTipoCliente;
        this.jTextFieldTitularTarjeta = jTextFieldTitularTarjeta;
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

    public JFormattedTextField getjFormattedDNI() {
        return jFormattedDNI;
    }

    public void setjFormattedDNI(JFormattedTextField jFormattedDNI) {
        this.jFormattedDNI = jFormattedDNI;
    }

    public JFormattedTextField getjFormattedTextFieldCP() {
        return jFormattedTextFieldCP;
    }

    public void setjFormattedTextFieldCP(JFormattedTextField jFormattedTextFieldCP) {
        this.jFormattedTextFieldCP = jFormattedTextFieldCP;
    }

    public JFormattedTextField getjFormattedTextFieldFechaCaducidad() {
        return jFormattedTextFieldFechaCaducidad;
    }

    public void setjFormattedTextFieldFechaCaducidad(JFormattedTextField jFormattedTextFieldFechaCaducidad) {
        this.jFormattedTextFieldFechaCaducidad = jFormattedTextFieldFechaCaducidad;
    }

    public JFormattedTextField getjFormattedTextFieldNumero() {
        return jFormattedTextFieldNumero;
    }

    public void setjFormattedTextFieldNumero(JFormattedTextField jFormattedTextFieldNumero) {
        this.jFormattedTextFieldNumero = jFormattedTextFieldNumero;
    }

    public JFormattedTextField getjFormattedTextFieldNumeroTarjeta() {
        return jFormattedTextFieldNumeroTarjeta;
    }

    public void setjFormattedTextFieldNumeroTarjeta(JFormattedTextField jFormattedTextFieldNumeroTarjeta) {
        this.jFormattedTextFieldNumeroTarjeta = jFormattedTextFieldNumeroTarjeta;
    }

    public JFormattedTextField getjFormattedTextFieldTelefono() {
        return jFormattedTextFieldTelefono;
    }

    public void setjFormattedTextFieldTelefono(JFormattedTextField jFormattedTextFieldTelefono) {
        this.jFormattedTextFieldTelefono = jFormattedTextFieldTelefono;
    }

    public JPasswordField getjPasswordFieldClave() {
        return jPasswordFieldClave;
    }

    public void setjPasswordFieldClave(JPasswordField jPasswordFieldClave) {
        this.jPasswordFieldClave = jPasswordFieldClave;
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

    public JTextField getjTextFieldTipoCliente() {
        return jTextFieldTipoCliente;
    }

    public void setjTextFieldTipoCliente(JTextField jTextFieldTipoCliente) {
        this.jTextFieldTipoCliente = jTextFieldTipoCliente;
    }

    public JTextField getjTextFieldTitularTarjeta() {
        return jTextFieldTitularTarjeta;
    }

    public void setjTextFieldTitularTarjeta(JTextField jTextFieldTitularTarjeta) {
        this.jTextFieldTitularTarjeta = jTextFieldTitularTarjeta;
    }

    
    
    BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
    public void RegistroCliente() throws IOException {


        try (BufferedWriter writer = new BufferedWriter (new FileWriter("Cliente_Particulares.txt", true))){

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelTipoCliente = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelClave = new javax.swing.JLabel();
        jLabelCalle = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelCP = new javax.swing.JLabel();
        jLabelCiudad = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelClave2 = new javax.swing.JLabel();
        jLabelTitularTarjeta = new javax.swing.JLabel();
        jLabelNumeroTarjeta = new javax.swing.JLabel();
        jLabelFechaCaducidad = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jFormattedTextFieldCP = new javax.swing.JFormattedTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jFormattedDNI = new javax.swing.JFormattedTextField();
        jTextFieldCalle = new javax.swing.JTextField();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jTextFieldTitularTarjeta = new javax.swing.JTextField();
        jFormattedTextFieldNumeroTarjeta = new javax.swing.JFormattedTextField();
        jFormattedTextFieldFechaCaducidad = new javax.swing.JFormattedTextField();
        jPasswordFieldClave = new javax.swing.JPasswordField();
        jPasswordFieldClave2 = new javax.swing.JPasswordField();
        jTextFieldTipoCliente = new javax.swing.JTextField();
        jFormattedTextFieldNumero = new javax.swing.JFormattedTextField();
        jButtonRegistarse = new javax.swing.JButton();
        jLabelCbecera = new javax.swing.JLabel();

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

        jLabelDNI.setText("DNI");

        jLabelNombre.setText("Nombre:");

        jLabelCorreo.setText("Correo:");

        jLabelClave.setText("Contraseña:");

        jLabelCalle.setText("Calle: ");

        jLabelNumero.setText("Numero:");

        jLabelCP.setText("Codigo Postal:");

        jLabelCiudad.setText("Ciudad:");

        jLabelTelefono.setText("Telefono:");

        jLabelClave2.setText("Confirmar contraseña:");

        jLabelTitularTarjeta.setText("Titular de la tarjeta:");

        jLabelNumeroTarjeta.setText("Numero de la tarjeta:");

        jLabelFechaCaducidad.setText("Fecha de caducidad:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(jLabelCiudad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelClave2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelNumeroTarjeta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTitularTarjeta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelFechaCaducidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTipoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCalle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTipoCliente)
                .addGap(18, 18, 18)
                .addComponent(jLabelDNI)
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
                .addComponent(jLabelTitularTarjeta)
                .addGap(18, 18, 18)
                .addComponent(jLabelNumeroTarjeta)
                .addGap(18, 18, 18)
                .addComponent(jLabelFechaCaducidad)
                .addGap(18, 18, 18)
                .addComponent(jLabelTelefono)
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

        jTextFieldTipoCliente.setText("Particular");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldCalle)
                    .addComponent(jFormattedTextFieldCP)
                    .addComponent(jTextFieldCiudad)
                    .addComponent(jFormattedTextFieldTelefono)
                    .addComponent(jTextFieldCorreo)
                    .addComponent(jTextFieldTitularTarjeta)
                    .addComponent(jFormattedTextFieldNumeroTarjeta)
                    .addComponent(jFormattedTextFieldFechaCaducidad)
                    .addComponent(jPasswordFieldClave)
                    .addComponent(jPasswordFieldClave2)
                    .addComponent(jTextFieldTipoCliente)
                    .addComponent(jFormattedTextFieldNumero))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jFormattedTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTitularTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jFormattedTextFieldFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordFieldClave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButtonRegistarse.setText("REGISTRAR");

        jLabelCbecera.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelCbecera.setText("REGISTRO JAVAEATS - PARTICULAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jButtonRegistarse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCbecera, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabelCbecera, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistarse)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Particular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Particular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Particular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Particular.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Particular().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistarse;
    private javax.swing.JFormattedTextField jFormattedDNI;
    private javax.swing.JFormattedTextField jFormattedTextFieldCP;
    private javax.swing.JFormattedTextField jFormattedTextFieldFechaCaducidad;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumero;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumeroTarjeta;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCP;
    private javax.swing.JLabel jLabelCalle;
    private javax.swing.JLabel jLabelCbecera;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelClave2;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelFechaCaducidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumeroTarjeta;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoCliente;
    private javax.swing.JLabel jLabelTitularTarjeta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JPasswordField jPasswordFieldClave2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTipoCliente;
    private javax.swing.JTextField jTextFieldTitularTarjeta;
    // End of variables declaration//GEN-END:variables
}
