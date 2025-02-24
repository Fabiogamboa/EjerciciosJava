package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio14 {
    public static void impresora() {
        Scanner scanner = new Scanner(System.in);
        
        int capacidadPapel = 100;
        int cantidadPaginas;
        
        while (capacidadPapel > 0) {
            System.out.println("\nPapel disponible: " + capacidadPapel + " paginas.");
            System.out.print("Ingrese la cantidad de paginas que desea imprimir: ");
            cantidadPaginas = scanner.nextInt();
            
            if (cantidadPaginas <= capacidadPapel) {
                capacidadPapel -= cantidadPaginas;
                System.out.println("Imprimiendo " + cantidadPaginas + " paginas.");
            } else {
                System.out.println("No hay suficiente papel.");
            }
        }
        
        System.out.println("No hay suficiente papel para continuar.");
    }
}
