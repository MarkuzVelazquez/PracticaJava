/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package escritorDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
import java.util.logging.Level;
import java.util.logging.Logger;
*/

/**
 *
 * @author SALA-1
 */
public class conexionDB {
    protected Connection conn;
    protected void cerrar(PreparedStatement stm) throws Exception{
        stm.close();
    }
    protected void cerrar(ResultSet rst) throws Exception{
        rst.close();
    }
    public conexionDB() {
        String driver = "org.gjt.mm.mysql.Driver";
        String user = "root";
        String pwd = "";
        String bd = "nueva"; // Nombre de la base de datos
        String server = "jdbc:mysql://localhost/"+bd;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(server, user, pwd);
            
        } catch(SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
