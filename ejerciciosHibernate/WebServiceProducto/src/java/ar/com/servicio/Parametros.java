/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.servicio;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author yo
 */
@XmlType(propOrder = {"nombre","precio","stock","descripcion"})
public class Parametros {
    private String nombre;
    private Integer precio;
    private Integer stock;
    private String descripcion;

    public Parametros() {
    }

    public Parametros(String nombre, Integer precio, Integer stock, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
