/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anyi4
 */
public class ProductoDAO {
    Connection conn = ConexionDB.getConnection();
    public List<Producto> getProductos() {
        
        List<Producto> productos = new ArrayList<>();
        
        String sql = "SELECT * FROM producto";  // Cambié "especialidad" por "producto"
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                int idProducto = rs.getInt("id_producto"); 
                String nombreProducto = rs.getString("nombre_producto"); 
                String descripcion = rs.getString("Descripcion"); 
                double precio = rs.getDouble("precio_producto"); 
                int cantidad = rs.getInt("Cantidad_stock"); 

                Producto producto = new Producto(idProducto, nombreProducto, descripcion, precio, cantidad);
                productos.add(producto);
            }

        } catch (Exception e) {
            System.out.println("Error getProductos: " + e.getMessage());
        }
        
        return productos;
    }
    
    // AGREGAR UN NUEVO PRODUCTO
    public void addProducto(String nombreProducto, String descripcion, double precio, int cantidad) {
        String sql = "INSERT INTO producto (nombre_producto, Descripcion, precio_producto , Cantidad_Stock) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombreProducto);
            stmt.setString(2, descripcion);
            stmt.setDouble(3, precio);
            stmt.setInt(4, cantidad);
            stmt.executeUpdate();
            
            System.out.println("PRODUCTO AGREGADO");

        } catch (Exception e) {
            System.out.println("Error addProducto: " + e.getMessage());
        }
    }
    
    // OBTENER UN PRODUCTO SEGÚN UN PARÁMETRO (ID)
    public Producto getOneProducto(int pIdProducto) {
        
        Producto producto = new Producto();
        String sql = "SELECT * FROM producto WHERE id_producto = ?"; // Cambié "especialidad" por "producto"
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pIdProducto);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                int idProducto = rs.getInt("id_producto");
                String nombreProducto = rs.getString("nombre_producto");
                String descripcion = rs.getString("Descripcion");
                double precio = rs.getDouble("precio_producto");
                int cantidad = rs.getInt("Cantidad_Stock");

                producto.setId_producto(idProducto);
                producto.setNombre_producto(nombreProducto);
                producto.setDescripcion(descripcion);
                producto.setPrecio_producto(precio);
                producto.setDescripcion(descripcion);
            }

        } catch (Exception e) {
            System.out.println("Error getOneProducto: " + e.getMessage());
        }
        
        return producto;
    }
    
  
}
