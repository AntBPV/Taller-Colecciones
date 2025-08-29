package com.taller.utils;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.taller.models.Pedido;


public class ListExercises {
    public static void exercise_ArrayList() {
        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido ("Cafe", 14));
        pedidos.add(new Pedido ("Amper", 4));
        pedidos.add(new Pedido ("Tampico", 10));
        pedidos.add(new Pedido ("Helado", 2));
        pedidos.add(new Pedido ("Gelada", 1));

        System.out.println("Ejercicio 1 - Lista incial de pedidos: ArrayList");
        System.out.println(pedidos);
        System.out.println();

        pedidos.add(0, new Pedido("Cafe", 14));
        pedidos.add(0, new Pedido("Tampico", 10));

        System.out.println("Ejercicio 2 - Lista de urgentes (ArrayList):");
        System.out.println(pedidos);
        System.out.println();
    }

    public static void excersise_LinkedList() {
        List<Pedido> pedidos = new LinkedList<>();

        pedidos.add(new Pedido ("Cafe", 14));
        pedidos.add(new Pedido ("Amper", 4));
        pedidos.add(new Pedido ("Tampico", 10));
        pedidos.add(new Pedido ("Helado", 2));
        pedidos.add(new Pedido ("Gelada", 1));

        System.out.println("Ejercicio 3 - Lista inicial de pedidos (LinkedList):");
        System.out.println(pedidos);

        pedidos.add(0, new Pedido("Cafe", 14));
        pedidos.add(0, new Pedido("Tampico", 10));

        System.out.println("Ejercicio 3 - Lista después de insertar urgentes (LinkedList):");
        System.out.println(pedidos);
        System.out.println();
    }
}
