package Controlador;

import Modelo.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class editarController {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    
    
    public boolean editarProducto(producto pr){
        String sql = "UPDATE tbl_productos SET cantidad = ? WHERE idProducto = ?;";
        try{
            con=cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, pr.getCantidad());
            ps.setInt(2, pr.getIdProducto());
            int n = ps.executeUpdate();
            if(n!=0){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error en controller "+e);
            return false;
        }

    }
}
