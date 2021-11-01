package DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Manucho
 */
public class loginDAO {
    Connection  con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public login log(String cuenta, String pass){
    login l = new login();
    String sql = "SELECT * FROM cuenta WHERE cuenta = ? and pass = ?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, cuenta);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                
               // l.setIdcuenta(rs.getString("nombre"));
               // l.setCuenta(rs.getString("pass"));
                l.setNombre(rs.getString("cuenta"));
                l.setPass(rs.getString("pass"));
                //l.setSaldo(rs.getDouble("saldo"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }
}
