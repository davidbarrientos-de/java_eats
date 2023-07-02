package poo.java_eatsGrafica;

import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import poo.java_eats.Cliente;
import poo.java_eats.UtilCliente;

public class Registrar extends javax.swing.JFrame {
   private Cliente cli = null;
   UtilCliente utilcliente = new UtilCliente();
   ArrayList<Cliente> clientes = new ArrayList<>();
    

    private boolean credenciales; // contraseña valida?
    private boolean AllCampos; //Todos los campos de la interfaz grafica relleno?
    private boolean registrar; // Las credenciales son correctas y los campos han sido rellenos correctamente
    
    public Registrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabelTipoCliente = new javax.swing.JLabel();
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
        jComboBoxTipoCliente = new javax.swing.JComboBox<>();
        txt_identificacion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_calle = new javax.swing.JTextField();
        jFormattedTextFieldNumero = new javax.swing.JFormattedTextField();
        CP = new javax.swing.JFormattedTextField();
        txt_ciudad = new javax.swing.JTextField();
        txt_titTarjeta = new javax.swing.JTextField();
        txt_tarjeta = new javax.swing.JTextField();
        FechaCaducidad = new javax.swing.JFormattedTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_web = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jComboBoxIdentificacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_contraseña2 = new javax.swing.JPasswordField();
        txt_contraseña = new javax.swing.JPasswordField();
        jButtonRegistarse = new javax.swing.JButton();
        jLabelCbecera = new javax.swing.JLabel();
        jButtonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar - JavaEats");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabelTipoCliente.setText("Tipo de Cliente");

        jLabelNombre.setText("Nombre:");

        jLabelCorreo.setText("Web:");

        jLabelClave.setText("Correo:");

        jLabelCalle.setText("Calle: ");

        jLabelNumero.setText("Numero:");

        jLabelCP.setText("Codigo Postal:");

        jLabelCiudad.setText("Ciudad:");

        jLabelTelefono.setText("Telefono:");

        jLabelClave2.setText("Contraseña:");

        jLabelTitularTarjeta.setText("Titular de la tarjeta:");

        jLabelNumeroTarjeta.setText("Numero de la tarjeta:");

        jLabelFechaCaducidad.setText("Fecha de caducidad:");

        jComboBoxTipoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Particular", "Empresa" }));
        jComboBoxTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoClienteActionPerformed(evt);
            }
        });

        txt_identificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_identificacionActionPerformed(evt);
            }
        });

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        CP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txt_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tarjetaActionPerformed(evt);
            }
        });

        FechaCaducidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/yy"))));

        jComboBoxIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "DNI", "CIF" }));
        jComboBoxIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdentificacionActionPerformed(evt);
            }
        });

        jLabel3.setText("Confrimar Contraseña:");

        txt_contraseña2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseña2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelClave2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBoxIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFormattedTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelTitularTarjeta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_titTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelClave)
                                    .addComponent(jLabelCorreo))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(txt_web, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNumeroTarjeta)
                                    .addComponent(jLabelFechaCaducidad))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(txt_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCP, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelCiudad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoCliente)
                    .addComponent(jComboBoxTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCalle)
                    .addComponent(txt_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jFormattedTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCP)
                    .addComponent(CP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitularTarjeta)
                    .addComponent(txt_titTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroTarjeta)
                    .addComponent(txt_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaCaducidad)
                    .addComponent(FechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCorreo)
                    .addComponent(txt_web, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClave, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClave2)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jButtonRegistarse.setText("Registrar");
        jButtonRegistarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarseActionPerformed(evt);
            }
        });

        jLabelCbecera.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabelCbecera.setText("REGISTRO JAVAEATS");

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegistarse, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabelCbecera, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabelCbecera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonRegistarse))
                .addGap(12, 12, 12))
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

    private void jComboBoxTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoClienteActionPerformed
        String TCliente = (String) jComboBoxTipoCliente.getSelectedItem();
        if (TCliente.equals("Particular")){
            jComboBoxTipoCliente.setEditable(false);
            jComboBoxIdentificacion.setEditable(false);
            jComboBoxIdentificacion.setSelectedItem("DNI");
            txt_web.setEditable(false);
            txt_web.setText("*Solo para Empresas*");
        } else if (TCliente.equals("Empresa")){
            jComboBoxTipoCliente.setEditable(false);
            jComboBoxIdentificacion.setEditable(false);
            jComboBoxIdentificacion.setSelectedItem("CIF");
            txt_web.setEditable(true);
            txt_web.setText("");
        }
    }//GEN-LAST:event_jComboBoxTipoClienteActionPerformed

    private void txt_identificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_identificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_identificacionActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tarjetaActionPerformed

    private void jComboBoxIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxIdentificacionActionPerformed

    private void txt_contraseña2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseña2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseña2ActionPerformed

    private void jButtonRegistarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarseActionPerformed
        String clave = txt_contraseña.getText();
        String clave2 = txt_contraseña2.getText();
        String TCliente = (String) jComboBoxTipoCliente.getSelectedItem();
        String id = txt_identificacion.getText();
        String nombre = txt_nombre.getText();
        String calle = txt_calle.getText();
        String numero = jFormattedTextFieldNumero.getText();
        String codigoPostal = CP.getText();
        String ciudad = txt_ciudad.getText();
        String titTarjeta = txt_titTarjeta.getText();
        String tarjeta = txt_tarjeta.getText();
        String fecha = FechaCaducidad.getText();
        String telefono = txt_telefono.getText();
        String web = txt_web.getText();
        String correo = txt_correo.getText();

        int numeroEntero = Integer.parseInt(jFormattedTextFieldNumero.getText());
        int cpEntero = Integer.parseInt(CP.getText());

        if (clave.equals(clave2)){
            credenciales = true;
        }else {
            credenciales = false;
        }

        if (id.equals("")|| nombre.equals("")||
            calle.equals("")||numero.equals("")||
            codigoPostal.equals("")||ciudad.equals("")||
            titTarjeta.equals("")||tarjeta.equals("")||
            fecha.equals("")||telefono.equals("")||web.equals("")||
            correo.equals("")||clave.equals("")||clave2.equals("")){
            AllCampos = false;
        } else {
            AllCampos = true;
        }

        if (AllCampos==true && credenciales==false){
            JOptionPane.showMessageDialog(this,"Las contraseñas no coinciden", "ERROR", JOptionPane.ERROR_MESSAGE);
            registrar = false;
        } else if (AllCampos==false && credenciales==true){
            JOptionPane.showMessageDialog(this,"Obligatorio rellenar todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
            registrar=false;
        } else if (AllCampos==false && credenciales==false){
            JOptionPane.showMessageDialog(this,"Obligatorio rellenar todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
            registrar=false;
        } else {
            JOptionPane.showMessageDialog(this, "Nuevo cliente registrado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            registrar=true;
        }

        if (registrar==true){
            try {
                if (TCliente.equals("Particular")){
                    txt_web.setText("None");
                    cli = new Cliente(TCliente, id, nombre,calle,numeroEntero,cpEntero,ciudad,titTarjeta,tarjeta,fecha,telefono,web,correo,clave);
                    utilcliente.cargarDatos();
                    UtilCliente.almacenarClientes(cli);
                } else {
                    cli = new Cliente(TCliente, id, nombre,calle,numeroEntero,cpEntero,ciudad,titTarjeta,tarjeta,fecha,telefono,web,correo,clave);
                    utilcliente.cargarDatos();
                    UtilCliente.almacenarClientes(cli);
                }
                System.out.println(cli.toString());
                //lo inserttamos en el array
                if (UtilCliente.registroCliente(cli)){
                    JOptionPane.showMessageDialog(this, "Cliente Registrado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al registrar.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } catch (HeadlessException | NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Excepción al registrar.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonRegistarseActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        jComboBoxTipoCliente.setSelectedItem("-");
        jComboBoxIdentificacion.setSelectedItem("-");
        txt_identificacion.setText("");
        txt_nombre.setText("");
        txt_calle.setText("");
        jFormattedTextFieldNumero.setText("");
        CP.setText("");
        txt_ciudad.setText("");
        txt_titTarjeta.setText("");
        txt_tarjeta.setText("");
        FechaCaducidad.setText("");
        txt_telefono.setText("");
        txt_web.setText("");
        txt_correo.setText("");
        txt_contraseña.setText("");
        txt_contraseña2.setText("");
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        UtilCliente.guardarDatos();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CP;
    private javax.swing.JFormattedTextField FechaCaducidad;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonRegistarse;
    private javax.swing.JComboBox<String> jComboBoxIdentificacion;
    private javax.swing.JComboBox<String> jComboBoxTipoCliente;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumero;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCP;
    private javax.swing.JLabel jLabelCalle;
    private javax.swing.JLabel jLabelCbecera;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelClave;
    private javax.swing.JLabel jLabelClave2;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFechaCaducidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumeroTarjeta;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipoCliente;
    private javax.swing.JLabel jLabelTitularTarjeta;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txt_calle;
    private javax.swing.JTextField txt_ciudad;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JPasswordField txt_contraseña2;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_identificacion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tarjeta;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_titTarjeta;
    private javax.swing.JTextField txt_web;
    // End of variables declaration//GEN-END:variables
}
