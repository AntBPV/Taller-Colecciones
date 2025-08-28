package com.taller.models;

public class Cliente {
    private String nombre;
    private Pedido pedido;

    public Cliente(String nombre, Pedido pedido){
        this.nombre = nombre;
        this.pedido = pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", pedido=").append(pedido);
        sb.append('}');
        return sb.toString();
    }

}
