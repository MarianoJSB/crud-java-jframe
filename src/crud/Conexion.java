package cmf_engines_interface;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class Conexion {
    DatosConexion datos = new DatosConexion();
    
    public Connection getConnection() {
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection)DriverManager.getConnection(datos.URL, datos.usuario, datos.contrasena);
            System.out.println("Se conectó correctamente a DB");
        } catch(Exception ex) {
            System.out.println("Error: " + ex);
        }
        
        return conexion;
    }
}
