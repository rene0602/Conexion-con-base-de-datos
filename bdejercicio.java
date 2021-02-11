/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;

public class bdejercicio {

     private static final String nombre = "bdejercicio1";
    private static final String user = "root";
    private static final String pass = "ferchito2000";
    private static final String lineaBase = "jdbc:mysql://localhost:3306/" + nombre + "? useUnicode=true&use"
            + " JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
  private Connection conec = null;
  

    public Connection Conexion_Mysql() {

        try {
            conec = DriverManager.getConnection(lineaBase, user, pass);
            if (conec != null) {
                System.out.println("Felicidades su Conexión fue Establecida");
            }
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conec;
    }
}
