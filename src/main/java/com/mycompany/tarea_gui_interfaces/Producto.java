
package com.mycompany.tarea_gui_interfaces;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producto {
    int id=1;
    String nombre,categoria,talla;double precio;

    public Producto(String nombre, String categoria, String talla, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.talla = talla;
        this.precio = precio;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }        
    
    
    public Queue<Producto> llenarlista(){
        
        Queue<Producto> miQueue=new LinkedList();
        Producto miProducto=null;
        try {
            
            Conexion miConexion=new Conexion();
            
            PreparedStatement consulta=miConexion.getConnection().prepareStatement("select * from producto");
            ResultSet res=consulta.executeQuery();
            
             while(res.next()){
                 
                 miProducto=new Producto(res.getString("nombre"), res.getString("categoria"),res.getString("talla"), res.getDouble("precio"));
                miQueue.add(miProducto);
                 //System.out.println(""+miQueue.element().getNombre());
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return miQueue;
    }
    
    public void EliminarLista(Queue cola){
        cola.remove();
    }
    
    
    
    
}
