package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio23 {
    public static void registroGogo() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder listaVentas = new StringBuilder();
        double totalVentas = 0;
        String producto, continuar;
        double precio;

        do {
            System.out.print("Ingrese el nombre del producto vendido: ");
            producto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            precio = scanner.nextDouble();
            totalVentas = ProcesadorVentas.registrarVenta(producto, precio, listaVentas, totalVentas);
            System.out.print("¿Desea registrar otra venta? (si/no): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("si"));

        if (listaVentas.length() > 0) {
            MostrarVentas.mostrarResumen(listaVentas.toString(), totalVentas);
        } else {
            System.out.println("pon algo xd");
        }
    }

}

class ProcesadorVentas {
    public static double registrarVenta(String producto, double precio, StringBuilder listaVentas, double totalVentas) {
        listaVentas.append("Producto: ").append(producto)
                   .append(" - Precio: $").append(precio)
                   .append("\n");
        return totalVentas + precio;
    }
}

class MostrarVentas {
    public static void mostrarResumen(String ventas, double totalVentas) {
        System.out.println("\n--- Resumen de Ventas ---");
        System.out.print(ventas);
        System.out.printf("Total de ventas: $%.2f\n", totalVentas);
        System.out.println("¡Gracias por su compra!");
    }
}
