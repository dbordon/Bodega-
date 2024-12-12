

package formularios;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prg.conex;


public class actualizar_contrasena extends javax.swing.JDialog {
    conex con;
    ResultSet rs, rs1;
//    Statement stmt = null;
    int contador=0;
  
//    public actualizar_contrasena(){
//        initComponents();
//        this.setLocationRelativeTo(null);
//        con = new conecbd();
//        con.conectar();
//        txtactual.requestFocus();
//    }
    public actualizar_contrasena(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setLocationRelativeTo(null);
        con = new conex();
        con.conectar();
        txtactual.requestFocus();
    }
    


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtactual = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnueva = new javax.swing.JPasswordField();
        txtconfirmar = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ACTUALIZAR CONTRASEÑA"));

        jLabel1.setText("Contraseña Actual:");

        txtactual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtactual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtactualActionPerformed(evt);
            }
        });
        txtactual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtactualKeyPressed(evt);
            }
        });

        jLabel2.setText("Nueva Contraseña:");

        jLabel4.setText("Confirmar Contraseña:");

        txtnueva.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtnueva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnuevaKeyPressed(evt);
            }
        });

        txtconfirmar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtconfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtconfirmarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtactual, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnueva, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operaciones"));

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtactualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtactualKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtactual.getText().trim().equals("")) {
                try {               
                    rs = con.Listar("select * from usuario "
                            + "where usu_cod =" + acceso.codusu + " "
                            + " and usu_clave= md5('" + txtactual.getText() + "')");
                    if (rs.isBeforeFirst()) {
                        txtnueva.setEnabled(true);
                        txtnueva.requestFocus();
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña "
                                + "ingresada no es correcta", 
                                "Atención", JOptionPane.INFORMATION_MESSAGE);
                        txtactual.setText("");
                        txtactual.requestFocus();
                        contador = contador+1;                        
                        if (contador==3) {
                            System.exit(0);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(actualizar_contrasena.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Este campo no puede estar vacio", "Atención", 
                        JOptionPane.INFORMATION_MESSAGE);
                txtactual.setText("");
                txtactual.requestFocus();
            }
        }
    }//GEN-LAST:event_txtactualKeyPressed

    private void txtnuevaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnuevaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtnueva.getText().trim().equals("")) {
                txtconfirmar.setEnabled(true);
                txtconfirmar.requestFocus();
            }else{
                JOptionPane.showMessageDialog(null, 
                        "Este campo no puede estar vacio",
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
                txtnueva.setText("");
                txtnueva.requestFocus();
            }
        }
    }//GEN-LAST:event_txtnuevaKeyPressed

    private void txtconfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfirmarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtconfirmar.getText().trim().equals("")) {
                if(txtconfirmar.getText().trim().equals(txtnueva.getText().trim())){
                    aceptar.setEnabled(true);
                    aceptar.doClick();
                }else{
                JOptionPane.showMessageDialog(null, 
                        "Las contraseñas nuevas no coinciden",
                        "Atención", JOptionPane.INFORMATION_MESSAGE);
                txtnueva.setText("");
                txtnueva.setEnabled(false);
                txtconfirmar.setText("");
                txtconfirmar.setEnabled(false);
                txtactual.setText("");
                txtactual.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Este campo no puede estar vacio",
                        "Atención", JOptionPane.INFORMATION_MESSAGE);
                txtconfirmar.setText("");
                txtconfirmar.requestFocus();
            }
        }
    }//GEN-LAST:event_txtconfirmarKeyPressed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
       int mensaje = JOptionPane.showConfirmDialog(null,
               "Desea modificar su contraseña?",
        "Atención",JOptionPane.YES_NO_OPTION);
        if (mensaje==0) {
            con.actualizar_datos("usuario", 
                    "cambio=1, usu_clave = md5('"+this.txtconfirmar.getText()+"')" , 
                    "usu_cod ="+acceso.codusu,1);
            txtactual.setText("");
            txtnueva.setText("");    
            txtconfirmar.setText("");
            dispose();
                                  
        }else{
            txtactual.setText("");
            txtnueva.setText("");    
            txtconfirmar.setText("");
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void txtactualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtactualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtactualActionPerformed

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
            java.util.logging.Logger.getLogger(actualizar_contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizar_contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizar_contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizar_contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                actualizar_contrasena dialog = new actualizar_contrasena(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtactual;
    private javax.swing.JPasswordField txtconfirmar;
    private javax.swing.JPasswordField txtnueva;
    // End of variables declaration//GEN-END:variables
}
