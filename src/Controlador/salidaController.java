/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.sql.*;
import java.util.*;


public class salidaController {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarSalidas(){
        List<producto> listasSalida = new ArrayList<>();
        String sql= "select * from tbl_productos WHERE estatus = 1 ";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                producto p = new producto();
                p.setIdProducto(rs.getInt(1));
                p.setNombreProducto(rs.getString(2));
                p.setCantidad(rs.getInt(3));
                p.setEstatus(rs.getInt(4));
                listasSalida.add(p);
            }
        }catch(Exception e){
            System.out.println("aqui!");
        }
        return listasSalida;
    }
}
