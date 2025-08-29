package com.taller.models;

import java.util.ArrayList;
import com.taller.models.Pedido;

public class Cliente {
    private String nombre;
    private ArrayList<Pedido> pedidos;
    private int id;

    public Cliente(String nombre, int id) {
        this.id = id;
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void agregarPedido(Pedido p) {
        pedidos.add(p);
    }


    public void agregarPedido(String nombre, double precio) { 
        pedidos.add(new Pedido(nombre, precio));
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", pedidos=" + pedidos +
                '}';
    }
}
