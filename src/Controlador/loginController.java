/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class loginController {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public usuario login(String user, String pass){
        usuario us=new usuario();
        String sql = "SELECT * FROM tbl_usuario WHERE nombre = '"+user+"' AND contrasena = '"+pass+"'";
        try{
            con = cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                us.setIdUsuario(rs.getInt(1));
                us.setNombre(rs.getString(2));
                us.setCorreo(rs.getString(3));
                us.setContrasena(rs.getString(4));
                us.setIdRol(rs.getInt(5));
                us.setEstatus(rs.getInt(6));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Aqui es login controller "+e);
        }
        return us;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
    }
    
}
