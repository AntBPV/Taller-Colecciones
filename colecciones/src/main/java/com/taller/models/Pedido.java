package com.taller.models;

public class Pedido {
    private String nombre_pedido;

    public Pedido(String nombre_pedido) {
        this.nombre_pedido = nombre_pedido;
    }

    public String getnombre_pedido() {
        return nombre_pedido;
    }

    public void setnombre_pedido(String nombre_pedido) {
        this.nombre_pedido = nombre_pedido;
    }
}
