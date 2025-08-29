package com.taller.utils;

import java.util.HashMap;
import java.util.Map;

import com.taller.models.Cliente;
import com.taller.models.Pedido;

public class MapsExcersise {
    public static Map<Integer, Cliente> indexClients() {
        Map<Integer, Cliente> clientsById = new HashMap<>();

        Cliente Juan = new Cliente("Juan", 1);
        Juan.agregarPedido("Cafe", 15);
        Juan.agregarPedido("Te verde", 8);

        Cliente Maria = new Cliente("Maria", 2);
        Maria.agregarPedido("Chocolate", 12);
        Maria.agregarPedido("Cafe", 10);
        Maria.agregarPedido("Pan", 5);

        Cliente Pedro = new Cliente("Pedro", 3);
        Pedro.agregarPedido("Leche", 9);
        Pedro.agregarPedido("Gaseosa", 14);

        clientsById.put(Juan.getId(), Juan);
        clientsById.put(Maria.getId(), Maria);
        clientsById.put(Pedro.getId(), Pedro);

        return clientsById;
    }

    public static void printClientsOrder(Map<Integer, Cliente> clientesPorId, Integer idCliente) {
        Cliente c = clientesPorId.get(idCliente);
        if (c == null) {
            System.out.println("No existe el cliente con id: " + idCliente);
            return;
        }
        System.out.println("Pedidos de " + c.getNombre() + " (" + c.getId() + "):");
        for (Pedido p : c.getPedidos()) {
            System.out.println(" - " + p);
        }
        System.out.println();
    }

    public static void printTotalClient(Map<Integer, Cliente> clientesPorId) {
        System.out.println("Total gastado por cliente:");
        for (Cliente c : clientesPorId.values()) {
            double total = 0.0;
            for (Pedido p : c.getPedidos()) { 
                total += p.getPrecio();
            }
            System.out.println(c.getNombre() + " ( Id: " + c.getId() + ") gastó $" + total);
        }
        System.out.println();
    }

    public static void excersise_HashMap() {
        Map<Integer, Cliente> clientsMap = indexClients();
        printClientsOrder(clientsMap, 2);
        printTotalClient(clientsMap);
    }
}
