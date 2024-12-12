package prg;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author utic
 */
public class conex {

    Connection con;
    Statement st;
    ResultSet rs;

    String host = "jdbc:postgresql://127.0.0.1/";
    String bd = "Bodega";
    String user = "postgres";
    String pass = "123";
    
    public Connection conexion = null;
    public Statement sentencia; //variable tipo publica para sql
    public ResultSet resultado;//variable de resultado para sql
//conectar JAVA con LA BASE DE DATOS
    public Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver"); //driver de conexión postgres
            try {
                con = DriverManager.getConnection(host + bd, user, pass);
            } catch (SQLException ex) {
                Logger.getLogger(conex.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conex.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
        
    }
     public boolean busqueda(String query) {
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }
//Devolver valores de consultas SQL en el formulario
    public ResultSet Listar(String consulta) {
        try {
            st=con.createStatement(ResultSet.CONCUR_READ_ONLY,ResultSet.TYPE_SCROLL_INSENSITIVE);
            rs=st.executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(conex.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
}
    public void insertar_datos(String tabla, String campos, String valores, int mensaje) {
        try {
            st = con.createStatement();
            st.executeUpdate("insert into " + tabla + " (" + campos + ") "
                    + " values(" + valores + ")");

            switch (mensaje) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Se ha grabado exitosamente",
                            "ATENCION", JOptionPane.INFORMATION_MESSAGE);
                    break;
                 case 2:
                   
                    break;
            }

        } catch (Exception ex) {
            System.out.println("insert into " + tabla + " (" + campos + ") "
                    + " values(" + valores + ")");
            JOptionPane.showMessageDialog(null, "Error en la operación", "ATENCION",
                    JOptionPane.WARNING_MESSAGE);
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void actualizar_datos(String tabla, String camposAct, String codigo, int mensaje) {
        try {
            st = con.createStatement();
            st.executeUpdate("update " + tabla + " set " + camposAct + " where "
                    + codigo, mensaje);
            switch (mensaje) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Se ha actualizado", "ATENCION",
                    JOptionPane.INFORMATION_MESSAGE);
                break;
                case 2:
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Se ha anulado correctamente", "ATENCION",
                    JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        } catch (Exception ex) {
            System.out.println("update " + tabla + " set " + camposAct + " where "
                    + codigo);
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la operación",
                    "ATENCION", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void BorrarDatos(String tabla, String campoCodigo, String codigo) {
        try {
            st = con.createStatement();
            st.executeUpdate("delete from " + tabla + " where " + campoCodigo
                    + "=" + codigo);
            JOptionPane.showMessageDialog(null, "Se ha borrado exitosamente",
                    "ATENCION",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("delete from " + tabla + " where "
                    + campoCodigo + "=" + codigo);
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la operación",
                    "ATENCION", JOptionPane.WARNING_MESSAGE);
        }
    }
   
}