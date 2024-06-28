package Controlador;

import Modelo.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class insertController {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    
    
    public boolean insertarProducto (producto pr){
        String sql = "INSERT INTO tbl_productos (idProducto, nombreProducto, cantidad, estatus) VALUES (NULL,?,?,?);";
        try{
            con=cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNombreProducto());
            ps.setInt(2, pr.getCantidad());
            ps.setInt(3, pr.getEstatus());
            int n = ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }
}
