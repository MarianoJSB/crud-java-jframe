package interfaz;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
public class Conexion {
    public static final String URL="jdbc:mysql://localhost:3306/interfaz";
    public static final String usuario="root";
    public static final String contraseña="";

    public Connection getConnection(){
        Connection conexion=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection)DriverManager.getConnection(URL, usuario, contraseña);
        }catch(Exception ex){
            System.out.println("ERROR:" + ex);
        }
        return conexion;
    }
}