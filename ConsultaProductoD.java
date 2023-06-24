package poo.java_eatsGrafica;


import poo.java_eatsLogica.Restaurantes;
import poo.java_eatsLogica.Comida;
import poo.java_eatsLogica.UtilApp;
import poo.java_eatsLogica.Catering;
import poo.java_eatsLogica.Administrador;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConsultaProductoD extends javax.swing.JDialog {

    private ArrayList<Restaurantes> proaux; //Referencia al ArrayList de productos de la clase UtilApp
    private ListIterator<Restaurantes> li; //Iterador para recorrer el ArrayList en ambas direcciones
    private Restaurantes rest;

    /**
     * Creates new form ConsultaProductoD
     *
     * @param parent la ventana principal
     * @param modal true para que solo podamos operar con esta ventana
     */
    public ConsultaProductoD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        panelDatos.desactivaCodigo();
        panelDatos.desactivaCantidad();
        consultarTodo();
        this.setVisible(true);
    }

    public ConsultaProductoD(java.awt.Frame parent, boolean modal, Comida com) {
        super(parent, modal);
        initComponents();
        consultarTodo(rest);
        this.setVisible(true);
    }

    ConsultaProductoD() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Consulta los productos del ArrayList ordenadas para su presentación
     */
    private void consultarTodo() {
        try {
            //referenciamos al ArrayList de UtilTienda
            proaux = UtilApp.getRestaurantesPorNombre();
            //creamos el iterador sobre el ArrayList
            li = proaux.listIterator();
            //si no hay productos...
            if (proaux.size() < 1) {
                JOptionPane.showMessageDialog(this, "No hay productos.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                jButtonSig.setEnabled(false);
                jButtonAnt.setEnabled(false);
                jButtonBaja.setEnabled(false);
                jButtonModf.setEnabled(false);
                jButtonCompra.setEnabled(false);
                jButtonReponer.setEnabled(false);
                return;
            } else {
                jButtonSig.setEnabled(true);
                jButtonAnt.setEnabled(true);
                jButtonBaja.setEnabled(true);
                jButtonModf.setEnabled(true);
                jButtonCompra.setEnabled(true);
                jButtonReponer.setEnabled(true);
            }
            //presentamos 
            if (li.hasNext()) {
                rest = li.next();
            }
            if (rest != null) {
                presenta(rest);
            } else {
                JOptionPane.showMessageDialog(this, "No hay restaurantes.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.toString());
        }
    }//fin consultarTodo

    private void consultarTodo(Restaurantes rest) {
        try {
            //referenciamos al ArrayList de UtilApp
            proaux = UtilApp.getRestaurantesPorNombre();
            //creamos el iterador sobre el ArrayList
            li = proaux.listIterator();
            //presentamos el producto cuando lo encontremos
            while (li.hasNext()) {
                if (li.next().equals(rest)) {
                    presenta(rest);
                    break;
                }
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error: " + e.toString());
        }
    }//fin consultarTodoProducto

    /**
     * Presenta los datos de un producto en el panel de datos
     */
    private void presenta(Comida com) {
        String tipo = rest.getClass().getSimpleName();
        panelDatos.setJTextFieldCodigo(com.getIngredientes());
        panelDatos.setJTextFieldNombre(com.getTitulo());
        panelDatos.setJTextFieldPrecio(com.getPrecioVenta() + "");
        panelDatos.setJTextFieldCantidad(com.getCantidad() + "");

        if (tipo.equals("Comida")) {
            Comida com = (Comida) com;
            panelDatos.setLabelVar("Características");
            panelDatos.setJTextFieldVar(com.getIngredientes());
        } else {
            Catering cat = (Catering) cat;
            panelDatos.setLabelVar("Catering");
            panelDatos.setJTextFieldVar(cat.getServicios());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelComida = new javax.swing.JLabel();
        jButtonSig = new javax.swing.JButton();
        jButtonAnt = new javax.swing.JButton();
        jButtonBaja = new javax.swing.JButton();
        jButtonReponer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonCompra = new javax.swing.JButton();
        jButtonModf = new javax.swing.JButton();
        jSpinnerCant = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas");

        LabelComida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelComida.setText("CONSULTA COMIDA");

        jButtonSig.setText("SIGUIENTE");
        jButtonSig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigActionPerformed(evt);
            }
        });

        jButtonAnt.setText("ANTERIOR");
        jButtonAnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAntActionPerformed(evt);
            }
        });

        jButtonBaja.setText("BAJA");
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });

        jButtonReponer.setText("REPONER");
        jButtonReponer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReponerActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad");

        jButtonCompra.setText("COMPRAR");
        jButtonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCompraActionPerformed(evt);
            }
        });

        jButtonModf.setText("MODIFICAR");
        jButtonModf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModfActionPerformed(evt);
            }
        });

        jSpinnerCant.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(LabelComida)
                .addGap(117, 117, 117))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                        .addComponent(jButtonAnt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonModf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinnerCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonReponer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(LabelComida)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSig)
                    .addComponent(jButtonAnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModf)
                    .addComponent(jButtonBaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCompra)
                    .addComponent(jButtonReponer)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigActionPerformed
        // TODO add your handling code here:
        //Comprobamos el rango del ArrayList...
        if (li.hasNext()) {
            rest = li.next();
            if (rest != null) {
                Comida com = null;
                presenta(com);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSigActionPerformed

    private void jButtonAntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAntActionPerformed
        // TODO add your handling code here:
        //Comprobamos el rango del ArrayList...
        if (li.hasPrevious()) {
            rest = li.previous();
            if (rest != null) {
                Comida com = null;
                presenta(com);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonAntActionPerformed

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        // TODO add your handling code here:
        if (rest != null) {
            li.remove();
            JOptionPane.showMessageDialog(this, "Producto dado de baja: " + rest.toString(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, " Error: - Producto no encontrado -", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        //mostramos el elemento siguiente o anterior
        if (li.hasNext()) {
            rest = li.next();
            if (rest != null) {
                presenta(rest);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (li.hasPrevious()) {
            rest = li.previous();
            if (rest != null) {
                presenta(rest);
            } else {
                JOptionPane.showMessageDialog(this, "No hay productos.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonBajaActionPerformed

    private void jButtonReponerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReponerActionPerformed
        // TODO add your handling code here:
        try {
            int cantidad = (Integer) jSpinnerCant.getValue();
            Comida com = null;
            int stock = (int) com.getCantidad();
            String tipo = rest.getClass().getSimpleName();
            com.setCantidad(cantidad + stock);
            JOptionPane.showMessageDialog(this, "Ahora hay " + com.getCantidad() + " unidades.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            presenta(com);
            if (cantidad < 0) {
                JOptionPane.showMessageDialog(this, "No introduzca valores negativos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al comprar: " + e.toString(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonReponerActionPerformed

    private void jButtonCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCompraActionPerformed
        // TODO add your handling code here:
        try {
            int cantidad = (Integer) jSpinnerCant.getValue();
            Comida com;
            int stock = (int) com.getCantidad();

            if (cantidad < 0) {
                JOptionPane.showMessageDialog(this, "No introduzca valores negativos.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (stock >= cantidad) {
                com.setCantidad(stock - cantidad);
                double precio = cantidad * com.getPrecio();
                JOptionPane.showMessageDialog(this, "Ha comprado la comida a " + precio + " - Consulte su factura -", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                presenta(com);
                UtilApp.generaFactura(com, cantidad);
            } else {
                JOptionPane.showMessageDialog(this, "No hay suficiente stock.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al comprar: " + e.toString(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(ConsultaProductoD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCompraActionPerformed

    private void jButtonModfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModfActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = panelDatos.getJTextFieldNombre();
            double precio = Double.parseDouble(panelDatos.getJTextFieldPrecio());
            String var = panelDatos.getJTextFieldVar();
            if (UtilApp.modificaComida(rest, nombre, precio, var)) {
                JOptionPane.showMessageDialog(this, "Comida modificado.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, " Error: - Comida no encontrada -", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al modificar: " + e.toString(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonModfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelComida;
    private javax.swing.JButton jButtonAnt;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonCompra;
    private javax.swing.JButton jButtonModf;
    private javax.swing.JButton jButtonReponer;
    private javax.swing.JButton jButtonSig;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinnerCant;
    // End of variables declaration//GEN-END:variables

    private void presenta(Restaurantes rest) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
