package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio25 {
    public static void iniciarCompra() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de productos que desea comprar: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        StringBuilder listaProductos = new StringBuilder();
        double totalCompra = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            String producto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            totalCompra = ProcesadorCompra.agregarProducto(producto, precio, listaProductos, totalCompra);
        }
        // es como el stringify de python xd
        MostrarCompra.mostrarResumen(listaProductos.toString(), totalCompra);
    }
}

class ProcesadorCompra {
    public static double agregarProducto(String producto, double precio, StringBuilder listaProductos, double totalCompra) {
        listaProductos.append(producto).append(" - $").append(precio).append("\n");
        return totalCompra + precio;
    }
}

class MostrarCompra {
    public static void mostrarResumen(String productos, double totalCompra) {
        System.out.println("\n--- Resumen de Compra ---");
        System.out.print(productos);
        System.out.printf("Total a pagar: ", totalCompra);
        System.out.println("gtacias por comprar :v");
    }
}
