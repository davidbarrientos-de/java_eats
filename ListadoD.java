/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Java_EatsGrfica;

import Java_EatsGrfica.ConsultaProductoD;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poo.java_eats.Restaurantes;
import poo.java_eats.UtilApp;

/**
 *
 * @author salva
 */
public class ListadoD extends javax.swing.JDialog {

    private DefaultTableModel dtm = new DefaultTableModel();
    ArrayList<Restaurantes> restaurantes = new ArrayList<>();
    Frame principal;

    /**
     * Creates new form ListadoD
     */
    public ListadoD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        principal = parent;
        initComponents();
        jComboBoxOrden.setSelectedItem(0);
        String columnas[] = {"CÓDIGO", "NOMBRE", "PRECIO", "CANTIDAD"};
        dtm.setColumnIdentifiers(columnas);
        jTable1.setModel(dtm);
        rellenaTabla("Nombre");
        this.setVisible(true);
    }

    public void rellenaTabla(String criterio) {
        limpiaTabla();
        if (criterio.equals("Nombre")) {
            restaurantes = UtilApp.getRestaurantesPorNombre();
        } else if (criterio.equals("Precio")) {
            restaurantes = UtilApp.getRestaurantesPorPrecio();
        }
        for (Restaurantes rest : restaurantes) {
            dtm.addRow(new Object[]{rest.getCalificacion(), rest.getNombre(), rest.getGastosEnvio(), rest.getTiempoEnvio()});
        }
    }

    public void limpiaTabla() {
        int filas = dtm.getRowCount();
        for (int i = 0; i < filas; i++) {
            dtm.removeRow(0);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxOrden = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButtonVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listado Productos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Catering", "Relevancia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        jComboBoxOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Precio" }));
        jComboBoxOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrdenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ordenar por:");

        jButtonVer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonVer.setForeground(new java.awt.Color(0, 0, 204));
        jButtonVer.setText("VER RESTAURANTE");
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButtonVer)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButtonVer)
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrdenActionPerformed
        // TODO add your handling code here:

        String orden = (String) jComboBoxOrden.getSelectedItem();
        rellenaTabla(orden);
    }//GEN-LAST:event_jComboBoxOrdenActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "No hay producto seleccionado.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        } else {
            Restaurantes rest = restaurantes.get(fila);
            ConsultaProductoD c = new ConsultaProductoD(principal, true, rest);
        }
    }//GEN-LAST:event_jButtonVerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVer;
    private javax.swing.JComboBox<String> jComboBoxOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
