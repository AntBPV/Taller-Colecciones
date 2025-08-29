package com.taller.utils;

import java.util.ArrayList;
import java.util.List;
import com.taller.models.Pedido;

public class ParteD_Genericos {

    public static void ejecutar() {
        System.out.println("=== PARTE D - GENERICOS ===");

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("pasas", 25));
        pedidos.add(new Pedido("chamoi", 60));
        pedidos.add(new Pedido("Cafe tinto", 8));
        pedidos.add(new Pedido("forcha", 15));
        pedidos.add(new Pedido("Sopa de borojo", 12));

        System.out.println("Lista original de pedidos:");
        for (Pedido p : pedidos) {
            System.out.println(p.getnombre_pedido() + " - $" + p.getPrecio());
        }

        List<Pedido> pedidosCaros = filtrar(pedidos, 50);

        System.out.println("\nPedidos con precio mayor a $50:");
        for (Pedido p : pedidosCaros) {
            System.out.println(p.getnombre_pedido() + " - $" + p.getPrecio());
        }
    }

    public static <T> List<T> filtrar(List<T> lista, Object criterio) {
        List<T> resultado = new ArrayList<>();

        if (criterio instanceof Double || criterio instanceof Integer) {
            double precio = ((Number) criterio).doubleValue();

            for (T elemento : lista) {
                if (elemento instanceof Pedido) {
                    Pedido pedido = (Pedido) elemento;
                    if (pedido.getPrecio() > precio) {
                        resultado.add(elemento);
                    }
                }
            }
        }

        return resultado;
    }
}