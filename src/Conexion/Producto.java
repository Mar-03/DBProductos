/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

/**
 *
 * @author anyi4
 */
public class Producto {
 private int id_producto;
 private String nombre_producto;
 private String descripcion;
 private Double precio_producto;
 private int Cantidad_Stock;

    public Producto() {
    }

    public Producto(String nombre_producto, String descripcion, Double precio_producto, int Cantidad_Stock) {
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.precio_producto = precio_producto;
        this.Cantidad_Stock = Cantidad_Stock;
    }

    public Producto(int id_producto, String nombre_producto, String descripcion, Double precio_producto, int Cantidad_Stock) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion = descripcion;
        this.precio_producto = precio_producto;
        this.Cantidad_Stock = Cantidad_Stock;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(Double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getCantidad_Stock() {
        return Cantidad_Stock;
    }

    public void setCantidad_Stock(int Cantidad_Stock) {
        this.Cantidad_Stock = Cantidad_Stock;
    }
 
}
