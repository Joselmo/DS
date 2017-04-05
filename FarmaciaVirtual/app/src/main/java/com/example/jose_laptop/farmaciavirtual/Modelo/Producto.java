package com.example.jose_laptop.farmaciavirtual.Modelo;

/**
 * Created by Jose-laptop on 05/04/2017.
 */

public class Producto {


    private String nombre;
    private String descripcion;
    private float precio;

    public Producto(String nombre, String descripcion, float precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
