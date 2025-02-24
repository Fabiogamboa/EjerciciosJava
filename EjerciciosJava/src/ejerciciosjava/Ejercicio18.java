package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio18 {
    public static void registroBiblioteca() {
        Scanner scanner = new Scanner(System.in);
        String listaLibros = "";
        String respuesta;
        
        do {
            System.out.print("Ingrese el titulo del libro: ");
            String titulo = scanner.nextLine();
            
            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            
            System.out.print("Ingrese el numero de paginas del libro: ");
            int paginas = scanner.nextInt();
            scanner.nextLine(); 
            
            listaLibros += "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginas + "\n";
            
            System.out.print("Desea registrar otro libro (si/no): ");
            respuesta = scanner.nextLine();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        System.out.println("\nLibros registrados:");
        System.out.println(listaLibros);
    }
}