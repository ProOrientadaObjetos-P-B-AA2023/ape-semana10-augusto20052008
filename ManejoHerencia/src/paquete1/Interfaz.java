package paquete1;

import paquete2.Prestamo;

import java.util.ArrayList;

public class Interfaz {
    public static void menu_principal() {
        System.out.println("             ┌─────────────────────────────────┐");
        System.out.println("             │            PRESTAMOS            │");
        System.out.println("             │─────────────────────────────────│");
        System.out.println("             │  1) Prestamo Automovil          │");
        System.out.println("             │  2) Prestamo Educativo          │");
        System.out.println("             │  3) Mostar                      │");
        System.out.println("             │  4) SALIR                       │");
        System.out.println("             └─────────────────────────────────┘");
        System.out.print("-Ingrese una opcion: ");

    }
    public static void PresentarLista(ArrayList<Prestamo> lista) {
        if(lista.size()==0){
            System.out.println("┌───────────────────────────────────────────────────────────────┐");
            System.out.println("│                 NO EXISTEN DATOS DE PRESTAMOS                 │");
            System.out.println("└───────────────────────────────────────────────────────────────┘");
        }else {
            int n = 1;
            for (Prestamo aux : lista) {
                System.out.println("┌───────────────────────────────────────────────────────────┐");
                System.out.println("│                     PRESTAMO "+n+":                        │");
                System.out.println("└───────────────────────────────────────────────────────────┘");
                System.out.println(aux);
                System.out.println("└───────────────────────────────────────────────────────────┘");
                n++;
            }
        }
    }
    public static void ingreso1() {
        System.out.println("┌───────────────────────────────────────────────────────────┐");
        System.out.println("│PORFAVOR INGRESE LOS SIGUIENTES DATOS DE PRESTAMO AUTOMOVIL│");
        System.out.println("└───────────────────────────────────────────────────────────┘");
        System.out.println();
    }
    public static void ingreso2() {
        System.out.println("┌───────────────────────────────────────────────────────────┐");
        System.out.println("│PORFAVOR INGRESE LOS SIGUIENTES DATOS DE PRESTAMO EDUCATIVO│");
        System.out.println("└───────────────────────────────────────────────────────────┘");
        System.out.println();
    }
    public static void manejoErrores(int tipoError) {
        switch (tipoError) {
            case 1 -> {
                System.out.println();
                System.out.println("ERROR (No ingrese letras ni simbolos.)");
                System.out.println();
            }
            case 2 -> {
                System.out.println();
                System.out.println("ERROR (Escoga una opcion disponible)");
                System.out.println();
            }
        }
    }
}
