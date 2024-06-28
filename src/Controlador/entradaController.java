/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;

import java.sql.*;
import java.util.*;

/**
 *
 * @author EROS
 */
public class entradaController {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarEntradas(){
        List<producto> listaEntrada = new ArrayList<>();
        String sql= "select * from tbl_productos";
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
                listaEntrada.add(p);
            }
        }catch(Exception e){
            System.out.println("aqui!");
        }
        return listaEntrada;
    }
    
}
