
package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Manucho
 */
public class Conexion {

    Connection con; 
    public Connection conectar(){
        try {
            String myDB = "jdbc:mysql://localhost:3306/cajeroautomatico2?serverTimezone=UTC";
            con = DriverManager.getConnection(myDB, "root","");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    return null;
    }

  

    

   
    
}

