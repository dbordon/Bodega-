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
import javax.swing.table.DefaultTableModel;
import prg.conex;

/**
 *
 * @author utic
 */
public class proveedor extends javax.swing.JDialog {
// COMENTARIO POR LINE   

    /**
     * COMENTARIO EXTENDIDO O DE MUCHAS LINEAS
     */
    conex con; //LLAMAR AL MÉTODO conexión 
    ResultSet rs;//Llamar al método de resultados

    javax.swing.table.DefaultTableModel cursor; //CREAR EL CURSOR QUE VA A CARGAR LA TABLA

    int operacion = 0; //VARIABLE PARA ESTABLECER LAS OPERACIONES(AGREGAR , MODIFICAR O ELIMINAR)

    public proveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        con = new conex(); //INSTANCIAR LA CONEXIÓN
        con.conectar();//UTILIZAR EL METODO PARA CONECTAR
        cargar_grilla();
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

        panelNice1 = new org.edisoncor.gui.panel.PanelNice();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jPanel1 = new javax.swing.JPanel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        codigo = new org.edisoncor.gui.textField.TextFieldRectBackground();
        direccion = new org.edisoncor.gui.textField.TextFieldRectBackground();
        jScrollPane1 = new javax.swing.JScrollPane();
        grilla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        salir = new org.edisoncor.gui.button.ButtonNice();
        buscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JToggleButton();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        telefono = new org.edisoncor.gui.textField.TextFieldRectBackground();
        nombre = new org.edisoncor.gui.textField.TextFieldRectBackground();
        ruc = new org.edisoncor.gui.textField.TextFieldRectBackground();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelNice1.setBackground(new java.awt.Color(64, 120, 201));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Proveedores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);

        labelMetric1.setText("Código:");

        labelMetric2.setText("Razón Social:");

        codigo.setDescripcion("");
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        direccion.setDescripcion("Dirección");
        direccion.setEnabled(false);
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });

        grilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Razón social", "Ruc", "Dirección", "Telefono"
            }
        ));
        grilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grilla);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel2.setOpaque(false);

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo1.png"))); // NOI18N
        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        borrar.setText("BORRAR");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar1.png"))); // NOI18N
        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        guardar.setText("GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel-24.gif"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(modificar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregar)
                .addGap(32, 32, 32)
                .addComponent(modificar)
                .addGap(30, 30, 30)
                .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        salir.setBackground(new java.awt.Color(79, 219, 14));
        salir.setForeground(new java.awt.Color(4, 2, 2));
        salir.setText("SALIR");
        salir.setSegundoColor(new java.awt.Color(232, 31, 31));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        buscar.setBorder(javax.swing.BorderFactory.createTitledBorder("Bucar"));
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        btnbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnbuscarKeyPressed(evt);
            }
        });

        labelMetric3.setText("Ruc:");

        labelMetric4.setText("Dirección:");

        labelMetric5.setText("Telefono:");

        telefono.setDescripcion("Teléfono");
        telefono.setEnabled(false);
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        nombre.setDescripcion("Razón Social");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        ruc.setDescripcion("Ingrese el RUC");
        ruc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rucActionPerformed(evt);
            }
        });
        ruc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rucKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buscar)
                                .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelCurves1.add(jPanel1, java.awt.BorderLayout.CENTER);

        panelNice1.add(panelCurves1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
//        //  buscar_descrip();
//        codigo.setEnabled(false);
//        descrip.setEnabled(true);
//        descrip.requestFocus();
    }//GEN-LAST:event_codigoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed


    }//GEN-LAST:event_direccionActionPerformed

    private void direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyPressed
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {//cuando el evento del teclado fue enter
            if (direccion.getText().equals("")) {//getTex leer el texto es igual a vacio
                JOptionPane.showMessageDialog(null, "NO DEBE DEJAR EL CAMPO VACIO");
                direccion.requestFocus();//situar el cursor el descrip
            } else {
                direccion.setEnabled(false);//habilitar campo descrip
                telefono.setEnabled(true);//habilitar botón guardar
                telefono.requestFocus();//enviar el cursor en el botón
            }
        }
    }//GEN-LAST:event_direccionKeyPressed

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped

    }//GEN-LAST:event_direccionKeyTyped

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        this.operacion = 1;
        this.deshab_botones(1);
        generar_codigo();
        nombre.setEnabled(true);
        nombre.requestFocus();

    }//GEN-LAST:event_agregarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if (codigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null,
                    "Debe seleccionar el registro que desea eliminar..");
        } else {
            int mensaje = JOptionPane.showConfirmDialog(null,
                    "Desea borrar los datos?",
                    "Atención", JOptionPane.YES_NO_OPTION);
            if (mensaje == JOptionPane.YES_OPTION) {

                con.BorrarDatos("proveedor", "cod_proveedor", this.codigo.getText());
                limpiar_grilla();
                cargar_grilla();
                this.cancelar.doClick();

            }
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        if (this.codigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un dato de la tabla para editar..");
        } else {
            operacion = 2;
            nombre.setEnabled(true);
            nombre.requestFocus();

        }

    }//GEN-LAST:event_modificarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(this, "Deseas Confirmar la acción", "Atención", JOptionPane.YES_NO_OPTION);
        if (mensaje == JOptionPane.YES_OPTION) {
            this.guardar();
            this.limpiar_grilla();
            this.cargar_grilla();
            this.deshab_botones(2);
            this.deshab_inicio();
            limpiar_txt();

        }
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.deshab_botones(2);
        this.deshab_inicio();
        limpiar_grilla();
        cargar_grilla();
        limpiar_txt();
    }//GEN-LAST:event_cancelarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int mensaje = JOptionPane.showConfirmDialog(this, "Deseas Salir", "Atención", JOptionPane.YES_NO_OPTION);
        if (mensaje == JOptionPane.YES_OPTION) {

            dispose();//salir completamente del sistema
            //   dispose();//cerrar ventana pero el sistema sigue ejecutandose
        }
    }//GEN-LAST:event_salirActionPerformed

    private void btnbuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnbuscarKeyPressed
        limpiar_grilla();
        this.buscar();
    }//GEN-LAST:event_btnbuscarKeyPressed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        limpiar_grilla();
        this.buscar();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        this.btnbuscar.setEnabled(true);
        btnbuscar.requestFocus();
    }//GEN-LAST:event_buscarActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        telefono.setEnabled(false);
        guardar.setEnabled(true);
        guardar.requestFocus();
    }//GEN-LAST:event_telefonoActionPerformed

    private void telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoKeyPressed

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        int k = evt.getKeyChar();
        if ((k >= 32 && k <= 45) || (k >= 58 && k <= 126)) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);//limpia inmediatamente al tipear una letra
            getToolkit().beep();///el sonido del error
            JOptionPane.showMessageDialog(null, "No puede ingresar letras");
            telefono.requestFocus();
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void grillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grillaMouseClicked
        verdatos();
    }//GEN-LAST:event_grillaMouseClicked

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed

    }//GEN-LAST:event_nombreActionPerformed

    private void rucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rucActionPerformed
        validar_descripcion();

    }//GEN-LAST:event_rucActionPerformed

    private void rucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rucKeyTyped
        if (evt.getKeyCode() == 10) {
            if (nombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No puede dejar vacio..");
                this.nombre.getText();

            } else {
                this.ruc.setEnabled(true);
                this.ruc.requestFocus();
                nombre.setEnabled(false);
                ruc.setEnabled(true);
                ruc.requestFocus();
            }
        }
    }//GEN-LAST:event_rucKeyTyped

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
        if (evt.getKeyCode() == 10) {
            if (nombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No puede dejar vacio..");
                this.nombre.getText();
            } else {
                this.ruc.setEnabled(true);
                this.ruc.requestFocus();
                nombre.setEnabled(false);
                ruc.setEnabled(true);
                ruc.requestFocus();
            }
        }
    }//GEN-LAST:event_nombreKeyPressed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped

    }//GEN-LAST:event_nombreKeyTyped

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
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                proveedor dialog = new proveedor(new javax.swing.JFrame(), true);
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
        this.codigo.setEnabled(false);
        this.nombre.setEnabled(false);
        this.guardar.setEnabled(false);
        ruc.setEnabled(false);
        direccion.setEnabled(false);
        telefono.setEnabled(false);

    }

    private void deshab_botones(int a) {
        switch (a) {
            case 1:
                this.agregar.setEnabled(false);
                this.modificar.setEnabled(false);
                this.borrar.setEnabled(false);
                this.salir.setEnabled(false);
                break;
            case 2:
                this.agregar.setEnabled(true);
                this.modificar.setEnabled(true);
                this.borrar.setEnabled(true);
                this.salir.setEnabled(true);
                break;
        }
    }

    private void limpiar_txt() {
        codigo.setText("");
        direccion.setText("");
        telefono.setText("");
        ruc.setText("");
        nombre.setText("");
        buscar.setText("");

    }

    private void generar_codigo() {
        try {
            String sql = "SELECT COALESCE (max(cod_proveedor),0)+1 as cod from proveedor;";
            rs = con.Listar(sql);//devolver en rs el resultado del primer registro
            rs.next();//devuelve todos los valores del resultado
            this.codigo.setText(rs.getString("cod"));
        } catch (SQLException ex) {
            Logger.getLogger(proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void guardar() {
        if (operacion == 1) {
            con.insertar_datos("proveedor", "cod_proveedor,razon_social, ruc,"
                    + "direccion,telefono",
                    this.codigo.getText() + ",'"
                    + this.nombre.getText().toUpperCase() + "','"
                    + this.ruc.getText().toUpperCase() + "','"
                    + this.direccion.getText().toUpperCase() + "','"
                    + this.telefono.getText() + "'", 1);
            this.cancelar.doClick();
            limpiar_grilla();
            cargar_grilla();
        }
        if (operacion == 2) {

            con.actualizar_datos("proveedor", "razon_social='" + nombre.getText().toUpperCase() + "',"
                    + "ruc='" + ruc.getText().toUpperCase() + "',"
                    + "direccion='" + direccion.getText().toUpperCase() + "',"
                    + "telefono='" + telefono.getText() + "'",
                    " cod_proveedor=" + this.codigo.getText(), 1);

            this.cancelar.doClick();
            limpiar_grilla();
            cargar_grilla();
        }
    }

    private void cargar_grilla() {
        try {
            cursor = (DefaultTableModel) grilla.getModel();//asingar cursor a la tabla
            String sql = "select *from proveedor order by cod_proveedor";//consulta p cargar tabla
            rs = con.Listar(sql);// guarda los resultados del select en rs

            String[] fila = new String[6];//definir array para guardar los id y descrip de la consulta

            while (rs.next()) {//va a cargar con los valores del resultado (rs) optenido en la consulta
                fila[0] = rs.getString("cod_proveedor");//datos de la fila 0= id's
                fila[1] = rs.getString("razon_social"); //datos de la fila las descrip's
                fila[2] = rs.getString("ruc");//datos de la fila 0= id's
                fila[3] = rs.getString("direccion");//datos de la fila 0= id's
                fila[4] = rs.getString("telefono"); //datos de la fila las descrip's

                cursor.addRow(fila);//cargar en con el cursor los valores en la tabla
            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiar_grilla() {
        cursor = (DefaultTableModel) grilla.getModel();//asignar el cursor a la tabla

        while (cursor.getRowCount() > 0) { //contar la cantidad de elementos hasta 0
            cursor.removeRow(0);//eliminar datos hasta que se quede en 0
        }
    }

    private void verdatos() {

        int fila = grilla.getSelectedRow();
        codigo.setText(grilla.getValueAt(fila, 0).toString());
        nombre.setText(grilla.getValueAt(fila, 1).toString());
        ruc.setText(grilla.getValueAt(fila, 2).toString());
        direccion.setText(grilla.getValueAt(fila, 3).toString());
        telefono.setText(grilla.getValueAt(fila, 4).toString());

        //pasar paremetros al combo para que muestre valor seleccionado
    }

    private void buscar() {
        try {
            cursor = (DefaultTableModel) this.grilla.getModel();//asignacion del modelo de la tabla al cursor creado

            String sql = "select *from proveedor where ruc like '%" + buscar.getText() + "%' order by cod_proveedor";
            rs = con.Listar(sql);
            String[] fila1 = new String[6];//definimos la cantidad que poseera el array[]

            while (rs.next()) {
                fila1[0] = rs.getString("cod_proveedor");//datos de la fila 0= id's
                fila1[1] = rs.getString("razon_social"); //datos de la fila las descrip's
                fila1[2] = rs.getString("ruc");//datos de la fila 0= id's
                fila1[3] = rs.getString("direccion");//datos de la fila 0= id's
                fila1[4] = rs.getString("telefono"); //datos de la fila las descrip's

                cursor.addRow(fila1);//agrega filas mientras que exista datos
            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validar_descripcion() {
        try {
            rs = con.Listar("SELECT * FROM proveedor WHERE ruc= '"
                    + this.ruc.getText() + "'");
            boolean encontro = rs.next();
            if (encontro == true) {
                JOptionPane.showMessageDialog(null, "El RUC   "
                        + ruc.getText() + "   ya se encuentra registrada");
                // this.habilitar(1);
            } else {
                ruc.setEnabled(false);
                direccion.setEnabled(true);
                direccion.requestFocus();
                //    guardar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton borrar;
    private javax.swing.JToggleButton btnbuscar;
    private javax.swing.JTextField buscar;
    private javax.swing.JButton cancelar;
    private org.edisoncor.gui.textField.TextFieldRectBackground codigo;
    private org.edisoncor.gui.textField.TextFieldRectBackground direccion;
    private javax.swing.JTable grilla;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private javax.swing.JButton modificar;
    private org.edisoncor.gui.textField.TextFieldRectBackground nombre;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelNice panelNice1;
    private org.edisoncor.gui.textField.TextFieldRectBackground ruc;
    private org.edisoncor.gui.button.ButtonNice salir;
    private org.edisoncor.gui.textField.TextFieldRectBackground telefono;
    // End of variables declaration//GEN-END:variables
}
