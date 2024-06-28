package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    Connection con;
    
    public Connection conectar(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/bdcastores", "root", "");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
}
