package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio22 {
    public static void tareasGogogo() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder listaTareas = new StringBuilder(); // Se usa StringBuilder para acumular tareas
        String tarea, descripcion, fechaVencimiento; // Variables para almacenar datos temporales
        String continuar; // Para el bucle do-while

        do {
            System.out.print("Ingrese el nombre de la tarea: ");
            tarea = scanner.nextLine();
            
            System.out.print("Ingrese la descripción de la tarea: ");
            descripcion = scanner.nextLine();
            
            System.out.print("Ingrese la fecha de vencimiento (dd/mm/aaaa): ");
            fechaVencimiento = scanner.nextLine();
            
            // Se manda todo al procesador para que acumule en la lista de tareas
            ProcesadorTareas.registrarTarea(tarea, descripcion, fechaVencimiento, listaTareas);
            System.out.print("¿Desea agregar otra tarea? (si/no): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("si")); // Sigue si el usuario escribe "si" en cualquier forma
        MostrarTareas.mostrarLista(listaTareas.toString());
    }
}

class ProcesadorTareas {
    public static void registrarTarea(String tarea, String descripcion, String fechaVencimiento, StringBuilder listaTareas) {
        // Se acumula la tareagogo en la "lista" xd, porque como se usa stringbuilder
        // es como si fuera una string pero que se puede modifica :v
        listaTareas.append("Tarea: ").append(tarea)
                   .append("\nDescripción: ").append(descripcion)
                   .append("\nFecha de vencimiento: ").append(fechaVencimiento)
                   .append("\n--------------------------\n");
    }
}

class MostrarTareas {
    public static void mostrarLista(String tareas) {
        System.out.println("\n--- Lista de Tareas ---");
        System.out.print(tareas);
        System.out.println("¡Organiza bien tu tiempo!");
    }
}
