/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import prg.VentanaBuscar;
import prg.conex;

/**
 *
 * @author utic
 */
public class Informe_Ventas extends javax.swing.JDialog {
// COMENTARIO POR LINE   

    /**
     * COMENTARIO EXTENDIDO O DE MUCHAS LINEAS
     */
    conex con; //LLAMAR AL MÉTODO conexión 
    ResultSet rs;//Llamar al método de resultados

    javax.swing.table.DefaultTableModel cursor; //CREAR EL CURSOR QUE VA A CARGAR LA TABLA

    int operacion = 0; //VARIABLE PARA ESTABLECER LAS OPERACIONES(AGREGAR , MODIFICAR O ELIMINAR)
    int t = 0;
    DecimalFormat formateador = new DecimalFormat("###,###,###");

    public Informe_Ventas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        con = new conex(); //INSTANCIAR LA CONEXIÓN
        con.conectar();//UTILIZAR EL METODO PARA CONECTAR

        this.deshab_inicio();
        buscar.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        limpiar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        salir = new org.edisoncor.gui.button.ButtonNice();
        totalite = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        desde = new javax.swing.JFormattedTextField();
        hasta = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        actual = new javax.swing.JCheckBox();
        fecha = new javax.swing.JCheckBox();
        factura = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        fac = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(64, 120, 201));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informe de Ventas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);

        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Fecha", "Nro_Factura", "Cliente", "Cod_producto", "Producto", "Precio", "Cantidad", "Sub Total"
            }
        ));
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grilla);
        if (grilla.getColumnModel().getColumnCount() > 0) {
            grilla.getColumnModel().getColumn(0).setMinWidth(0);
            grilla.getColumnModel().getColumn(0).setPreferredWidth(0);
            grilla.getColumnModel().getColumn(0).setMaxWidth(0);
            grilla.getColumnModel().getColumn(4).setMinWidth(0);
            grilla.getColumnModel().getColumn(4).setPreferredWidth(0);
            grilla.getColumnModel().getColumn(4).setMaxWidth(0);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setOpaque(false);

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.setEnabled(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarKeyPressed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(79, 219, 14));
        salir.setForeground(new java.awt.Color(4, 2, 2));
        salir.setText("Cerrar");
        salir.setSegundoColor(new java.awt.Color(232, 31, 31));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        totalite.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel3.setText("Total Ventas");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel4.setText("Gs.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(totalite, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalite, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por Fecha", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel4.setOpaque(false);

        try {
            desde.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        desde.setEnabled(false);
        desde.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desdeActionPerformed(evt);
            }
        });

        try {
            hasta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        hasta.setEnabled(false);
        hasta.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel1.setText("Desde");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("Hasta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desde, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ver"));
        jPanel5.setOpaque(false);

        buttonGroup1.add(actual);
        actual.setText("De Hoy");
        actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualActionPerformed(evt);
            }
        });

        buttonGroup1.add(fecha);
        fecha.setText("Por Fecha");
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        buttonGroup1.add(factura);
        factura.setText("N° Factura");
        factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(factura)
                    .addComponent(actual)
                    .addComponent(fecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(actual, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("N° de Factura"));
        jPanel3.setOpaque(false);

        fac.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        fac.setEnabled(false);
        fac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fac)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        panelCurves1.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        panelNice1.add(panelCurves1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facActionPerformed
        buscar.setEnabled(true);
        buscar.requestFocus();
    }//GEN-LAST:event_facActionPerformed

    private void facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facturaActionPerformed
        operacion = 3;
        fac.setEnabled(true);
        fac.requestFocus();
    }//GEN-LAST:event_facturaActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        operacion = 2;
        this.desde.setEnabled(true);
        desde.requestFocus();
    }//GEN-LAST:event_fechaActionPerformed

    private void actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualActionPerformed
        operacion = 1;
        this.buscar.setEnabled(true);
        desde.setEnabled(false);
        hasta.setEnabled(false);
    }//GEN-LAST:event_actualActionPerformed

    private void hastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaActionPerformed
        buscar.setEnabled(true);
        buscar.requestFocus();
    }//GEN-LAST:event_hastaActionPerformed

    private void desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desdeActionPerformed
        hasta.setEnabled(true);
        hasta.requestFocus();
    }//GEN-LAST:event_desdeActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(this, "Deseas Salir", "Atención", JOptionPane.YES_NO_OPTION);
        if (mensaje == JOptionPane.YES_OPTION) {

            dispose();//salir completamente del sistema

        }
    }//GEN-LAST:event_salirActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed

    }//GEN-LAST:event_buscarKeyPressed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if (operacion == 1) {
            validar_hoy();
            cargar_total();

        }
        if (operacion == 2) {
            validar_desde_hasta();
            cargar_total2();

        }
        if (operacion == 3) {
            validar_factura();
            cargar_total3();
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        this.deshab_inicio();
        limpiar_grilla();
        limpiar_txt();
        buscar.setEnabled(false);
    }//GEN-LAST:event_limpiarActionPerformed

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked

    }//GEN-LAST:event_grillaMouseClicked

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
            java.util.logging.Logger.getLogger(Informe_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informe_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informe_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informe_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Informe_Ventas dialog = new Informe_Ventas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void deshab_inicio() {

        this.buttonGroup1.clearSelection();
        desde.setEnabled(false);
        hasta.setEnabled(false);
        //  todos.isSelected();

    }

    private void limpiar_txt() {
        fac.setText("");
        desde.setText("");
        hasta.setText("");
        totalite.setText("");
    }

    private void cargar_grilla_todos() {
        try {
            cursor = (DefaultTableModel) grilla.getModel();//asingar cursor a la tabla
            String sql = "select a.cod_venta,a.fecha, a.nro_factura,  concat(d.ci_ruc, ' ', d.cli_nombre, ' ', d.cli_apellido) as cliente, c.cod_producto,  c.p_descrip, b.det_precio_unit, b.det_cantidad, a.total_venta, det_precio_unit*det_cantidad as subtotal\n"
                    + "from venta a, det_venta b, producto c, clientes d, deposito e\n"
                    + "where a.id_cliente=d.id_cliente and b.cod_producto=c.cod_producto and a.cod_venta=b.cod_venta and b.cod_deposito=e.cod_deposito and fecha=current_date;";

//consulta p cargar tabla
            rs = con.Listar(sql);// guarda los resultados del select en rs

            String[] fila = new String[9];//definir array para guardar los id y descrip de la consulta

            while (rs.next()) {//va a cargar con los valores del resultado (rs) optenido en la consulta
                fila[0] = rs.getString("cod_venta");//datos de la fila 0= id's
                fila[1] = rs.getString("fecha"); //datos de la fila las descrip's
                fila[2] = rs.getString("nro_factura");//datos de la fila 0= id's
                fila[3] = rs.getString("cliente");//datos de la fila 0= id's
                fila[4] = rs.getString("cod_producto");//datos de la fila 0= id's
                fila[5] = rs.getString("p_descrip");//datos de la fila 0= id's
                fila[6] = rs.getString("det_precio_unit");//datos de la fila 0= id's
                fila[7] = rs.getString("det_cantidad");//datos de la fila 0= id's
                fila[8] = rs.getString("subtotal");
                cursor.addRow(fila);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Informe_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargar_total() {
        try {
            String sql2 = "select sum(total_venta) as vtotal from venta where fecha=current_date;";
            rs = con.Listar(sql2);
            boolean encontro = rs.next();
            if (encontro == true) {
                t = Integer.parseInt(rs.getString("vtotal"));
                totalite.setText(formateador.format(t));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Informe_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargar_total2() {
        try {
            String sql2 = "select sum(total_venta) as vtotal from venta where fecha between '" + desde.getText() + "'and '" + hasta.getText() + "'";
            rs = con.Listar(sql2);
            boolean encontro = rs.next();
            if (encontro == true) {
                t = Integer.parseInt(rs.getString("vtotal"));
                totalite.setText(formateador.format(t));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Informe_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void cargar_total3() {
        try {
            String sql2 = "select sum(total_venta) as vtotal from venta where  nro_factura='" + fac.getText() + "'";
            rs = con.Listar(sql2);
            boolean encontro = rs.next();
            if (encontro == true) {
                t = Integer.parseInt(rs.getString("vtotal"));
                totalite.setText(formateador.format(t));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Informe_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargar_grilla_desde_hasta() {
        try {
            cursor = (DefaultTableModel) grilla.getModel();//asingar cursor a la tabla
            String sql = "select a.cod_venta,a.fecha, a.nro_factura,  concat(d.ci_ruc, ' ', d.cli_nombre, ' ', d.cli_apellido) as cliente, c.cod_producto,  c.p_descrip, b.det_precio_unit, b.det_cantidad, a.total_venta, det_precio_unit*det_cantidad as subtotal\n"
                    + "from venta a, det_venta b, producto c, clientes d, deposito e\n"
                    + "where a.id_cliente=d.id_cliente and b.cod_producto=c.cod_producto \n"
                    + "and a.cod_venta=b.cod_venta and b.cod_deposito=e.cod_deposito and fecha between '" + desde.getText() + "'and '" + hasta.getText() + "'";

//consulta p cargar tabla
            rs = con.Listar(sql);// guarda los resultados del select en rs

            String[] fila = new String[9];//definir array para guardar los id y descrip de la consulta

            while (rs.next()) {//va a cargar con los valores del resultado (rs) optenido en la consulta
                fila[0] = rs.getString("cod_venta");//datos de la fila 0= id's
                fila[1] = rs.getString("fecha"); //datos de la fila las descrip's
                fila[2] = rs.getString("nro_factura");//datos de la fila 0= id's
                fila[3] = rs.getString("cliente");//datos de la fila 0= id's
                fila[4] = rs.getString("cod_producto");//datos de la fila 0= id's
                fila[5] = rs.getString("p_descrip");//datos de la fila 0= id's
                fila[6] = rs.getString("det_precio_unit");//datos de la fila 0= id's
                fila[7] = rs.getString("det_cantidad");//datos de la fila 0= id's
                fila[8] = rs.getString("subtotal");
                cursor.addRow(fila);
                t = Integer.parseInt(rs.getString("total_venta"));
                totalite.setText(formateador.format(t));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Informe_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargar_grilla_factura() {
        try {
            cursor = (DefaultTableModel) grilla.getModel();//asingar cursor a la tabla
            String sql = "select a.cod_venta,a.fecha, a.nro_factura,  concat(d.ci_ruc, ' ', d.cli_nombre, ' ', d.cli_apellido) as cliente, c.cod_producto,  c.p_descrip, b.det_precio_unit, b.det_cantidad, a.total_venta, det_precio_unit*det_cantidad as subtotal\n"
                    + "from venta a, det_venta b, producto c, clientes d, deposito e\n"
                    + "where a.id_cliente=d.id_cliente and b.cod_producto=c.cod_producto \n"
                    + "and a.cod_venta=b.cod_venta and b.cod_deposito=e.cod_deposito and nro_factura='" + fac.getText() + "'";

//consulta p cargar tabla
            rs = con.Listar(sql);// guarda los resultados del select en rs

            String[] fila = new String[9];//definir array para guardar los id y descrip de la consulta

            while (rs.next()) {//va a cargar con los valores del resultado (rs) optenido en la consulta
                fila[0] = rs.getString("cod_venta");//datos de la fila 0= id's
                fila[1] = rs.getString("fecha"); //datos de la fila las descrip's
                fila[2] = rs.getString("nro_factura");//datos de la fila 0= id's
                fila[3] = rs.getString("cliente");//datos de la fila 0= id's
                fila[4] = rs.getString("cod_producto");//datos de la fila 0= id's
                fila[5] = rs.getString("p_descrip");//datos de la fila 0= id's
                fila[6] = rs.getString("det_precio_unit");//datos de la fila 0= id's
                fila[7] = rs.getString("det_cantidad");//datos de la fila 0= id's
                fila[8] = rs.getString("subtotal");
                cursor.addRow(fila);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(Informe_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiar_grilla() {
        cursor = (DefaultTableModel) grilla.getModel();//asignar el cursor a la tabla

        while (cursor.getRowCount() > 0) { //contar la cantidad de elementos hasta 0
            cursor.removeRow(0);//eliminar datos hasta que se quede en 0
        }
    }

    private void validar_desde_hasta() {
        try {
            rs = con.Listar("select a.cod_venta,a.fecha, a.nro_factura,  concat(d.ci_ruc, ' ', d.cli_nombre, ' ', d.cli_apellido) as cliente, c.cod_producto,  c.p_descrip, b.det_precio_unit, b.det_cantidad, a.total_venta\n"
                    + "from venta a, det_venta b, producto c, clientes d, deposito e\n"
                    + "where a.id_cliente=d.id_cliente and b.cod_producto=c.cod_producto \n"
                    + "and a.cod_venta=b.cod_venta and b.cod_deposito=e.cod_deposito and fecha between '" + desde.getText() + "'and '" + hasta.getText() + "'");
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(null, "No se encuentran Ventas en ese rango de fechas");
                limpiar.doClick();
                fecha.doClick();
                desde.setEnabled(true);
                desde.requestFocus();

            } else {
                cargar_grilla_desde_hasta();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Informe_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validar_factura() {
        try {
            rs = con.Listar("select a.cod_venta,a.fecha, a.nro_factura,  concat(d.ci_ruc, ' ', d.cli_nombre, ' ', d.cli_apellido) as cliente, c.cod_producto,  c.p_descrip, b.det_precio_unit, b.det_cantidad, a.total_venta\n"
                    + "from venta a, det_venta b, producto c, clientes d, deposito e\n"
                    + "where a.id_cliente=d.id_cliente and b.cod_producto=c.cod_producto \n"
                    + "and a.cod_venta=b.cod_venta and b.cod_deposito=e.cod_deposito and nro_factura='" + fac.getText() + "'");
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(null, "No se encuentran Ventas en ese N° de Factura");
                limpiar.doClick();
                factura.doClick();
                fac.setEnabled(true);
                fac.requestFocus();
            } else {
                cargar_grilla_factura();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Informe_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validar_hoy() {
        try {
            rs = con.Listar("select a.cod_venta,a.fecha, a.nro_factura,  concat(d.ci_ruc, ' ', d.cli_nombre, ' ', d.cli_apellido) as cliente, c.cod_producto,  c.p_descrip, b.det_precio_unit, b.det_cantidad, a.total_venta\n"
                    + "from venta a, det_venta b, producto c, clientes d, deposito e\n"
                    + "where a.id_cliente=d.id_cliente and b.cod_producto=c.cod_producto and a.cod_venta=b.cod_venta and b.cod_deposito=e.cod_deposito and fecha=current_date;");
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(null, "No se Registraron Ventas el día de hoy");
                limpiar.doClick();
            } else {
                cargar_grilla_todos();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Informe_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox actual;
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField desde;
    private javax.swing.JTextField fac;
    private javax.swing.JCheckBox factura;
    private javax.swing.JCheckBox fecha;
    private javax.swing.JTable grilla;
    private javax.swing.JFormattedTextField hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.button.ButtonNice salir;
    private javax.swing.JTextField totalite;
    // End of variables declaration//GEN-END:variables
}
