package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio26 {
    public static void yupiAgendaGogo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de contactos a registrar: ");
        int cantidadContactos = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        StringBuilder listaContactos = new StringBuilder();

        for (int i = 0; i < cantidadContactos; i++) {
            System.out.print("Ingrese el nombre del contacto " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el número de teléfono: ");
            String telefono = scanner.nextLine();

            ProcesadorAgenda.agregarContacto(nombre, telefono, listaContactos);
        }

        MostrarAgenda.mostrarContactos(listaContactos.toString());
    }
}

class ProcesadorAgenda {
    public static void agregarContacto(String nombre, String telefono, StringBuilder listaContactos) {
        listaContactos.append(nombre).append(" - ").append(telefono).append("\n");
    }
}

class MostrarAgenda {
    public static void mostrarContactos(String contactos) {
        System.out.println("\n--- Lista de Contactos ---");
        System.out.print(contactos);
        System.out.println("Fin de la agenda.");
    }
}