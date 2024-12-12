/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class Stock extends javax.swing.JDialog {
// COMENTARIO POR LINE   

    /**
     * COMENTARIO EXTENDIDO O DE MUCHAS LINEAS
     */
    conex con; //LLAMAR AL MÉTODO conexión 
    ResultSet rs;//Llamar al método de resultados

    javax.swing.table.DefaultTableModel cursor; //CREAR EL CURSOR QUE VA A CARGAR LA TABLA

    int operacion = 0; //VARIABLE PARA ESTABLECER LAS OPERACIONES(AGREGAR , MODIFICAR O ELIMINAR)

    public Stock(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        con = new conex(); //INSTANCIAR LA CONEXIÓN
        con.conectar();//UTILIZAR EL METODO PARA CONECTAR

        this.deshab_inicio();
        llenar_combo_depo("0");
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
        jPanel3 = new javax.swing.JPanel();
        cbo_deposito = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        txt_cod_produc = new org.edisoncor.gui.textField.TextFieldRectBackground();
        txt_produc = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jPanel5 = new javax.swing.JPanel();
        todos = new javax.swing.JCheckBox();
        producto = new javax.swing.JCheckBox();
        deposito = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(64, 120, 201));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stock de Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);

        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod_deposito", "Depósito", "cod_producto", "Producto", "Cantidad", "Cajas"
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
            grilla.getColumnModel().getColumn(2).setMinWidth(0);
            grilla.getColumnModel().getColumn(2).setPreferredWidth(0);
            grilla.getColumnModel().getColumn(2).setMaxWidth(0);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por Depósito", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel3.setOpaque(false);

        cbo_deposito.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        cbo_deposito.setEnabled(false);
        cbo_deposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbo_depositoMouseClicked(evt);
            }
        });
        cbo_deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_depositoActionPerformed(evt);
            }
        });
        cbo_deposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbo_depositoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbo_deposito, 0, 213, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(cbo_deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Por Producto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel4.setOpaque(false);

        txt_cod_produc.setEnabled(false);
        txt_cod_produc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cod_producActionPerformed(evt);
            }
        });
        txt_cod_produc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cod_producKeyPressed(evt);
            }
        });

        txt_produc.setDescripcion("producto");
        txt_produc.setEnabled(false);
        txt_produc.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_cod_produc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_produc, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cod_produc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_produc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ver"));
        jPanel5.setOpaque(false);

        buttonGroup1.add(todos);
        todos.setText("Todos");
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });

        buttonGroup1.add(producto);
        producto.setText("Por Depósito");
        producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoActionPerformed(evt);
            }
        });

        buttonGroup1.add(deposito);
        deposito.setText("Por Producto");
        deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(todos)
                    .addComponent(producto)
                    .addComponent(deposito))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(todos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
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

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked

    }//GEN-LAST:event_grillaMouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        cbo_deposito.setEnabled(false);
        this.deshab_inicio();
        limpiar_grilla();
        limpiar_txt();
        buscar.setEnabled(false);
    }//GEN-LAST:event_limpiarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(this, "Deseas Salir", "Atención", JOptionPane.YES_NO_OPTION);
        if (mensaje == JOptionPane.YES_OPTION) {

            dispose();//salir completamente del sistema

        }
    }//GEN-LAST:event_salirActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if (operacion == 1) {
            validar_todos();
            this.buttonGroup1.clearSelection();
            todos.isSelected();

        }

        if (operacion == 2) {
            validar_deposito();
            this.buttonGroup1.clearSelection();
            deposito.isSelected();
            //  limpiar.doClick();
        }
        if (operacion == 3) {
            validar_por_producto();
            this.buttonGroup1.clearSelection();
            producto.isSelected();
            //   limpiar.doClick();

        }
    }//GEN-LAST:event_buscarActionPerformed

    private void buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyPressed

    }//GEN-LAST:event_buscarKeyPressed

    private void cbo_depositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbo_depositoMouseClicked

    }//GEN-LAST:event_cbo_depositoMouseClicked

    private void cbo_depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_depositoActionPerformed

    }//GEN-LAST:event_cbo_depositoActionPerformed

    private void cbo_depositoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbo_depositoKeyPressed
        buscar.setEnabled(true);
        buscar.requestFocus();
    }//GEN-LAST:event_cbo_depositoKeyPressed

    private void txt_cod_producActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cod_producActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cod_producActionPerformed

    private void txt_cod_producKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cod_producKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            //aqui definimos una matriz de tipo JTextField[] y el numero de columnas
            JTextField[] tfParam = new JTextField[2];
            //se le asigna donde va a mostrar el valor de cada columna
            tfParam[0] = this.txt_cod_produc;
            tfParam[1] = this.txt_produc;

            //instanciamos nuestra clase VentanaBuscar que se encuentra en el paquete clases
            //creamos la consulta con select de acuerdo a lo que queremos mostrar
            //en nuestra VentanaBuscar
            VentanaBuscar busmar = new VentanaBuscar("select a.cod_producto, a.p_descrip, a.precio\n"
                    + "from producto a, u_medida b, tipo_producto c\n"
                    + "where a.cod_tipo_prod=c.cod_tipo_prod and a.id_u_medida=b.id_u_medida and a.p_descrip like ",
                    new String[]{"CODIGO", "Producto", "Precio",}, 3, tfParam);
            //colocamos un titulo a nuestra VentanaBuscar con el comando setTitle
            busmar.setTitle("Buscar Producto");
            //en esta linea hacemos que sea visible nuestra VentanaBuscar
            //con el comando setVisible
            busmar.setVisible(true);
            //en esta linea nos posicionamos y habilitamos sobre el combo deposito
            txt_cod_produc.setEnabled(false);
            buscar.setEnabled(true);
            buscar.requestFocus();

        }
    }//GEN-LAST:event_txt_cod_producKeyPressed

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        operacion = 1;
        buscar.requestFocus();
        buscar.setEnabled(true);
        cbo_deposito.setEnabled(false);
        txt_cod_produc.setEnabled(false);
    }//GEN-LAST:event_todosActionPerformed

    private void productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoActionPerformed
        operacion = 2;
        cbo_deposito.setEnabled(true);
        cbo_deposito.requestFocus();
        txt_cod_produc.setEnabled(false);
        txt_produc.setEnabled(false);
    }//GEN-LAST:event_productoActionPerformed

    private void depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoActionPerformed
        operacion = 3;
        txt_cod_produc.setEnabled(true);
        txt_cod_produc.requestFocus();
        cbo_deposito.setEnabled(false);

    }//GEN-LAST:event_depositoActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Stock dialog = new Stock(new javax.swing.JFrame(), true);
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
        txt_cod_produc.setText("");
        txt_produc.setText("");
        txt_cod_produc.setEnabled(false);
        txt_produc.setEnabled(false);
        this.buttonGroup1.clearSelection();
        //  todos.isSelected();

    }

    private void limpiar_txt() {
//        codigo.setText("");
//        direccion.setText("");
//        telefono.setText("");
//        nombre.setText("");
//        apellidos.setText("");
//        ruc.setText("");
//        buscar.setText("");

    }

    private void cargar_grilla_todos() {
        try {
            cursor = (DefaultTableModel) grilla.getModel();//asingar cursor a la tabla
            String sql = "select b.cod_deposito, b.descrip,c.cod_producto, c.p_descrip, a.cantidad, a.cajas\n"
                    + "from stock a, deposito b, producto c\n"
                    + "where a.cod_deposito=b.cod_deposito and a.cod_producto=c.cod_producto";

//consulta p cargar tabla
            rs = con.Listar(sql);// guarda los resultados del select en rs

            String[] fila = new String[6];//definir array para guardar los id y descrip de la consulta

            while (rs.next()) {//va a cargar con los valores del resultado (rs) optenido en la consulta
                fila[0] = rs.getString("cod_deposito");//datos de la fila 0= id's
                fila[1] = rs.getString("descrip"); //datos de la fila las descrip's
                fila[2] = rs.getString("cod_producto");//datos de la fila 0= id's
                fila[3] = rs.getString("p_descrip");//datos de la fila 0= id's
                fila[4] = rs.getString("cantidad");//datos de la fila 0= id's
                fila[5] = rs.getString("cajas");//datos de la fila 0= id's

                cursor.addRow(fila);//cargar en con el cursor los valores en la tabla
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargar_grilla_deposito() {
        try {
            cursor = (DefaultTableModel) grilla.getModel();//asingar cursor a la tabla
            String sql = "select b.cod_deposito, b.descrip,c.cod_producto, c.p_descrip, a.cantidad,a.cajas\n"
                    + "from stock a, deposito b, producto c\n"
                    + "where a.cod_deposito=b.cod_deposito and a.cod_producto=c.cod_producto and a.cod_deposito="
                    + "(select split_part('" + cbo_deposito.getSelectedItem() + "','-',1)::integer)";

//consulta p cargar tabla
            rs = con.Listar(sql);// guarda los resultados del select en rs

            String[] fila = new String[6];//definir array para guardar los id y descrip de la consulta

            while (rs.next()) {//va a cargar con los valores del resultado (rs) optenido en la consulta
                fila[0] = rs.getString("cod_deposito");//datos de la fila 0= id's
                fila[1] = rs.getString("descrip"); //datos de la fila las descrip's
                fila[2] = rs.getString("cod_producto");//datos de la fila 0= id's
                fila[3] = rs.getString("p_descrip");//datos de la fila 0= id's
                fila[4] = rs.getString("cantidad");//datos de la fila 0= id's
                fila[5] = rs.getString("cajas");//datos de la fila 0= id's
                cursor.addRow(fila);//cargar en con el cursor los valores en la tabla}

            }

        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargar_grilla_producto() {
        try {
            cursor = (DefaultTableModel) grilla.getModel();//asingar cursor a la tabla
            String sql = "select b.cod_deposito, b.descrip,c.cod_producto, c.p_descrip, a.cantidad,a.cajas\n"
                    + "from stock a, deposito b, producto c\n"
                    + "where a.cod_deposito=b.cod_deposito and a.cod_producto=c.cod_producto and a.cod_producto="
                    + txt_cod_produc.getText() + "";

//consulta p cargar tabla
            rs = con.Listar(sql);// guarda los resultados del select en rs

            String[] fila = new String[6];//definir array para guardar los id y descrip de la consulta

            while (rs.next()) {//va a cargar con los valores del resultado (rs) optenido en la consulta
                fila[0] = rs.getString("cod_deposito");//datos de la fila 0= id's
                fila[1] = rs.getString("descrip"); //datos de la fila las descrip's
                fila[2] = rs.getString("cod_producto");//datos de la fila 0= id's
                fila[3] = rs.getString("p_descrip");//datos de la fila 0= id's
                fila[4] = rs.getString("cantidad");//datos de la fila 0= id's
                fila[5] = rs.getString("cajas");//datos de la fila 0= id's

                cursor.addRow(fila);//cargar en con el cursor los valores en la tabla
            }

        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiar_grilla() {
        cursor = (DefaultTableModel) grilla.getModel();//asignar el cursor a la tabla

        while (cursor.getRowCount() > 0) { //contar la cantidad de elementos hasta 0
            cursor.removeRow(0);//eliminar datos hasta que se quede en 0
        }
    }

    private void llenar_combo_depo(String orden) {
        try {
            rs = con.Listar("select concat(cod_deposito,'-',descrip) "
                    + "as dep from deposito order by cod_deposito=" + orden + " desc");
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    cbo_deposito.addItem(rs.getString("dep"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validar_deposito() {
        try {
            rs = con.Listar("select b.cod_deposito, b.descrip,c.cod_producto, c.p_descrip, a.cantidad\n"
                    + "from stock a, deposito b, producto c\n"
                    + "where a.cod_deposito=b.cod_deposito and a.cod_producto=c.cod_producto and a.cod_deposito="
                    + "(select split_part('" + cbo_deposito.getSelectedItem() + "','-',1)::integer)");
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(null, "No se encuentran productos en ese depósito");
                // this.habilitar(1);
            } else {
                cargar_grilla_deposito();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validar_todos() {
        try {
            rs = con.Listar("select b.cod_deposito, b.descrip,c.cod_producto, c.p_descrip, a.cantidad, a.cajas\n"
                    + "from stock a, deposito b, producto c\n"
                    + "where a.cod_deposito=b.cod_deposito and a.cod_producto=c.cod_producto");
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(null, "No se encuentran productos");
                // this.habilitar(1);
            } else {
                cargar_grilla_todos();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validar_por_producto() {
        try {
            rs = con.Listar("select b.cod_deposito, b.descrip,c.cod_producto, c.p_descrip, a.cantidad\n"
                    + "from stock a, deposito b, producto c\n"
                    + "where a.cod_deposito=b.cod_deposito and a.cod_producto=c.cod_producto and a.cod_producto="
                    + txt_cod_produc.getText() + "");
            boolean encontro = rs.next();
            if (encontro == false) {
                JOptionPane.showMessageDialog(null, "No se encuentran el producto");
                txt_cod_produc.setEnabled(true);
                txt_cod_produc.requestFocus();

            } else {
                cargar_grilla_producto();

            }
        } catch (SQLException ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbo_deposito;
    private javax.swing.JCheckBox deposito;
    private javax.swing.JTable grilla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private javax.swing.JCheckBox producto;
    private org.edisoncor.gui.button.ButtonNice salir;
    private javax.swing.JCheckBox todos;
    private org.edisoncor.gui.textField.TextFieldRectBackground txt_cod_produc;
    private org.edisoncor.gui.textField.TextFieldRectBackground txt_produc;
    // End of variables declaration//GEN-END:variables
}
