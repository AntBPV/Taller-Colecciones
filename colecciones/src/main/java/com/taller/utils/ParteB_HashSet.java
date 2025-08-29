package com.taller.utils;

import java.util.HashSet;
import java.util.Set;
import com.taller.models.Pedido;

public class ParteB_HashSet {

    public static void ejecutar() {
        System.out.println("=== PARTE B - CONJUNTO (HashSet) ===");

        Set<Pedido> pedidosSet = new HashSet<>();

        pedidosSet.add(new Pedido("Cafe", 14));
        pedidosSet.add(new Pedido("Amper", 4));
        pedidosSet.add(new Pedido("Tampico", 10));
        pedidosSet.add(new Pedido("Helado", 2));
        pedidosSet.add(new Pedido("Gelada", 1));

        pedidosSet.add(new Pedido("Cafe", 14));
        pedidosSet.add(new Pedido("Tampico", 10));

        System.out.println("Contenido del HashSet:");
        for (Pedido pedido : pedidosSet) {
            System.out.println(pedido.getnombre_pedido() + " - $" + pedido.getPrecio());
        }

}