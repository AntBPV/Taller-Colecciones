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

    public String getnombre_pedido() {
        return nombre_pedido;
    }

    public void setnombre_pedido(String nombre_pedido) {
        this.nombre_pedido = nombre_pedido;
    }

    @Override
    public String toString() {
        return "Pedido [nombre_pedido=" + nombre_pedido + ", getnombre_pedido()=" + getnombre_pedido() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
}
