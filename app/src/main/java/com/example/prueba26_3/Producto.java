package com.example.prueba26_3;

public class Producto {
    private String Nombre;
    private int Precio;

    public Producto(String nombre, int precio) {
        this.Nombre = nombre;
        this.Precio = precio;
    }

    public Producto() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

}