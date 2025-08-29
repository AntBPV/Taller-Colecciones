package com.taller;

import com.taller.utils.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("    TALLER DE COLECCIONES - DELIVERY EXPRESS");
        System.out.println("========================================\n");

        // Parte A - Listas (ArrayList y LinkedList)
        ListExercises.exercise_ArrayList();
        ListExercises.excersise_LinkedList();

        // Parte B - Conjunto (HashSet)
        ParteB_HashSet.ejecutar();
        System.out.println();

        // Parte C - Mapas (HashMap)
        MapsExcersise.excersise_HashMap();

        // Parte D - Genéricos
        ParteD_Genericos.ejecutar();

        System.out.println("\n========================================");
        System.out.println("           TALLER COMPLETADO");
        System.out.println("========================================");
    }
}