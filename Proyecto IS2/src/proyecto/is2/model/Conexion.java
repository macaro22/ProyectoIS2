/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.is2.model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    public Conexion() {
    }
    Connection conectar = null;

    public Connection conexion() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            // Esta sección la he "arreglado" un poco para que sea más fácil que cada uno ponga
            // su usuario y contraseña.
            conectar = (Connection) DriverManager.getConnection(
                    //Cambiar IP por localhost sin puerto.

                    "jdbc:mysql://82.223.216.122:3306/pcchess?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root", // usuario
                    "guarboix" // contraseña.
            );

            //JOptionPane.showMessageDialog(null, "Estas conectado a la base de datos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conectar;

    }
}
