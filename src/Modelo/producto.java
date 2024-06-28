/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


public class producto {
    private int idProducto;
    private String NombreProducto;
    private int cantidad;
    private int estatus;

    public producto() {
    }

    public producto(int idProducto, String NombreProducto, int cantidad, int estatus) {
        this.idProducto = idProducto;
        this.NombreProducto = NombreProducto;
        this.cantidad = cantidad;
        this.estatus = estatus;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    
    
    
    
}
