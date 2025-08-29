package com.taller.models;

public class Pedido {
    private String nombre_pedido;
    private double precio;


    public Pedido(String nombre_pedido) {
        this.nombre_pedido = nombre_pedido;
    }

    public Pedido(String nombre_pedido, double precio){
        this.nombre_pedido = nombre_pedido;
        this.precio = precio;
    }

    public void setNombre_pedido(String nombre_pedido) {
        this.nombre_pedido = nombre_pedido;
    }

    public String getNombre_pedido() {
        return nombre_pedido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getnombre_pedido() {
        return nombre_pedido;
    }

    public void setnombre_pedido(String nombre_pedido) {
        this.nombre_pedido = nombre_pedido;
    }

    @Override
    public String toString() {
        return "Pedido:" + nombre_pedido + " Precio: " + getPrecio();
    }
}
