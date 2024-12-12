/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import formularios.menu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prg.conex;

/**
 *
 * @author utic
 */
public class acceso extends javax.swing.JFrame {

    conex con;
    ResultSet rs;
    public static String usunombre;
    public static int codusu;
    public static int codsuc;
    public static String nivel;
    public static String sucursal;
    int contador = 0;
    int contadorx = 0;

    public acceso() {
        initComponents();
        setLocationRelativeTo(this);
        con = new conex();//instanciar conexion
        con.conectar();//llama conexion
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        txtusu = new org.edisoncor.gui.textField.TextFieldRectBackground();
        buttonNice1 = new org.edisoncor.gui.button.ButtonNice();
        buttonNice2 = new org.edisoncor.gui.button.ButtonNice();
        acceder = new org.edisoncor.gui.button.ButtonNice();
        txtclave = new javax.swing.JPasswordField();

        jPanel1.setBackground(new java.awt.Color(114, 122, 227));
        jPanel1.setOpaque(false);

        labelMetric1.setText(" Acceso al Sistema");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        labelMetric2.setText("Password");
        labelMetric2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        labelMetric3.setText("Usuario:");
        labelMetric3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        txtusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuActionPerformed(evt);
            }
        });

        buttonNice1.setBackground(new java.awt.Color(170, 83, 65));
        buttonNice1.setText("Cancelar");

        buttonNice2.setBackground(new java.awt.Color(170, 83, 65));
        buttonNice2.setText("Salir");
        buttonNice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNice2ActionPerformed(evt);
            }
        });

        acceder.setBackground(new java.awt.Color(170, 83, 65));
        acceder.setText("Acceder");
        acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accederActionPerformed(evt);
            }
        });

        txtclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtclave)
                            .addComponent(txtusu, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNice2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNice1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acceder, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accederActionPerformed

        ingresar();
    }//GEN-LAST:event_accederActionPerformed

    private void txtusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuActionPerformed
        validar_usu_bloqueado();

    }//GEN-LAST:event_txtusuActionPerformed

    private void txtclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclaveActionPerformed
        acceder.requestFocus();
    }//GEN-LAST:event_txtclaveActionPerformed

    private void buttonNice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNice2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonNice2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new acceso().setVisible(true);
            }
        });
    }

    private void ingresar() {
        try {
            String nick = "";
            //Esta es la consulta para el logueo   

            rs = con.Listar("select a.usu_cod, a.usu_nombres, a.usu_nivel, a.usu_nick, b.cod_suc, b.suc_nombre\n"
                    + "from usuarios a, sucursal b\n"
                    + "where a.cod_suc=b.cod_suc and usu_nick='" + txtusu.getText() + "' and usu_clave=md5('" + txtclave.getText() + "');");

            while (rs.next()) { //
                usunombre = rs.getString("usu_nombres");
                codusu = Integer.parseInt(rs.getString("usu_cod"));
                nick = rs.getString("usu_nick");
                codsuc = Integer.parseInt(rs.getString("cod_suc"));
                sucursal = rs.getString("suc_nombre");//Este se va a mostrar despues en el menú por eso necesitamos ese campo
//                nivel = rs.getString("usu_nivel");

            }
            if (nick.equals(txtusu.getText())) {
                //llamar al menu.
                new menu().setVisible(true);//llamado de formulario menu
                this.setVisible(false);//oculta acceso cuando llama al menu
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO CON DEFICIENCIA MENTAL O INCORRECTO O CLAVE INCORRECTA");
                contador = contador + 1;
                if(contador==1){
                    JOptionPane.showMessageDialog(this, "Tenes 2 oportunidades más, PENDEJO");
                }
                if(contador==2){
                    JOptionPane.showMessageDialog(this, "Tenes 1 oportunidad más, PENDEJO");
                }
                if (contador == 3) {
                    String sql = "update usuarios set estado='inactivo' WHERE usu_nick = '" + this.txtusu.getText() + "';";
                    System.out.println(sql);
                    JOptionPane.showMessageDialog(this, "usuario bloqueado por puerco");
                    con.sentencia = con.conectar().createStatement();
                    con.sentencia.executeUpdate(sql);
                    System.exit(0);
                }
                this.txtusu.setText("");
                this.txtclave.setText("");
                this.txtusu.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validar_usuario() {
        try {
            rs = con.Listar("SELECT * FROM usuarios WHERE usu_nick = '"
                    + this.txtusu.getText() + "'");
            boolean encontro = rs.next();

            if (encontro == false) {

                JOptionPane.showMessageDialog(null, "El usuario "
                        + txtusu.getText() + "  no existe");
                contadorx = contadorx + 1;
                if (contadorx == 2) {
                    JOptionPane.showMessageDialog(this, "deje de intentarlo no sabes");
                    System.exit(0);
                }
            } else {
//                JOptionPane.showMessageDialog(this, "le diste al usuario, vaya suerte!!!");
//                JOptionPane.showMessageDialog(this, "Puede continuar Jodiendo al sistema");

                txtclave.requestFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void validar_usu_bloqueado() {

        try {
            rs = con.Listar("SELECT * FROM usuarios WHERE estado='activo'and usu_nick = '"
                    + this.txtusu.getText() + "'");
            boolean encontro = rs.next();

            if (encontro == false) {

                JOptionPane.showMessageDialog(null, "El usuario está bloqueado por puerco");

                JOptionPane.showMessageDialog(this, "Llamale al Semi Dios que tenes como administrador de Sistemas");
                JOptionPane.showMessageDialog(this, ".!.");
                
            } else {
                validar_usuario();
            }
        } catch (SQLException ex) {
            Logger.getLogger(acceso.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonNice acceder;
    private org.edisoncor.gui.button.ButtonNice buttonNice1;
    private org.edisoncor.gui.button.ButtonNice buttonNice2;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private javax.swing.JPasswordField txtclave;
    private org.edisoncor.gui.textField.TextFieldRectBackground txtusu;
    // End of variables declaration//GEN-END:variables
}
