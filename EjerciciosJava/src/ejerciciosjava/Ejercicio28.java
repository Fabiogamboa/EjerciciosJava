package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio28 {
    public static void ventasPro() {
        Scanner scanner = new Scanner(System.in);
        // Solicita la cantidad de productos vendidos
        System.out.print("Ingrese la cantidad de productos vendidos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // limpieza :v

        double totalVentas = 0;
        StringBuilder resumenVentas = new StringBuilder("\n📋 Resumen de Ventas 📋\n");

        // Bucle for para registrar cada producto
        for (int i = 0; i < cantidadProductos; i++) {
            String nombreProducto = EntradaDatos.obtenerNombreProducto(scanner, i + 1);
            double precio = EntradaDatos.obtenerPrecioProducto(scanner, nombreProducto);
            int cantidad = EntradaDatos.obtenerCantidadVendida(scanner, nombreProducto);

            double subtotal = ProcesadorVentas.calcularSubtotal(precio, cantidad);
            totalVentas = ProcesadorVentas.acumularTotal(totalVentas, subtotal);

            resumenVentas.append(String.format("🔹 %s - %d unidades x $%.2f = $%.2f\n", 
                nombreProducto, cantidad, precio, subtotal));
        }
        MostrarResultados.mostrarResumen(resumenVentas.toString(), totalVentas);
    }
}

// Clase para obtener la info a del usuario
class EntradaDatos {
    public static String obtenerNombreProducto(Scanner scanner, int index) {
        String nombre;
        do {
            System.out.print("Ingrese el nombre del producto " + index + ": ");
            nombre = scanner.nextLine().trim();
            if (nombre.isEmpty()) {
                System.out.println("El nombre del producto no debe estar vacío pendeje");
            }
        } while (nombre.isEmpty());
        return nombre;
    }

    public static double obtenerPrecioProducto(Scanner scanner, String producto) {
        double precio;
        while (true) {
            System.out.print("Ingrese el precio de '" + producto + "': ");
            if (scanner.hasNextDouble()) {
                precio = scanner.nextDouble();
                scanner.nextLine(); // 🔥 Limpia el buffer
                if (precio >= 0) break;
            }
            System.out.println("Precio no valido ");
            scanner.nextLine();
        }
        return precio;
    }

    public static int obtenerCantidadVendida(Scanner scanner, String producto) {
        int cantidad;
        while (true) {
            System.out.print("Ingrese la cantidad vendida de '" + producto + "': ");
            if (scanner.hasNextInt()) {
                cantidad = scanner.nextInt();
                scanner.nextLine(); // 🔥 Limpia el buffer
                if (cantidad > 0) break;
            }
            System.out.println("cantidad invalida");
            scanner.nextLine();
        }
        return cantidad;
    }
}
class ProcesadorVentas {
    public static double calcularSubtotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    public static double acumularTotal(double totalActual, double subtotal) {
        return totalActual + subtotal;
    }
}
class MostrarResultados {
    public static void mostrarResumen(String resumenVentas, double totalVentas) {
        System.out.println(resumenVentas);
        System.out.printf("\n TOTAL DE VENTAS:\n", totalVentas);
        System.out.println("tenkius");
    }
}
