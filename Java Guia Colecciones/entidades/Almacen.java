/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author blasd
 */
public class Almacen {
     private Integer precio;
     private String nombreProducto;

    public Almacen() {
    }

    public Almacen(Integer precio, String nombreProducto) {
        this.precio = precio;
        this.nombreProducto = nombreProducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @Override
    public String toString() {
        return "ServiciosAlmacen{" + "precio=" + precio + ", nombreProducto=" + nombreProducto + '}';
    }
}
