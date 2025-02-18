package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio7 {
    public static void TiendaDesc() {
        Scanner dato = new Scanner(System.in);
        System.out.print("¿Qué tipo de producto desea comprar? A, V o E: ");
        String opcion = dato.nextLine().toUpperCase();
        System.out.print("¿Qué cantidad desea comprar?: ");
        if (dato.hasNextInt()) {
            int cantidad = dato.nextInt();
            ProcesoTienda.procesarInfo(opcion, cantidad);
        } else {
            System.out.println("Error: Debe ingresar un número válido.");
        }
    }
}

class ProcesoTienda {
    public static void procesarInfo(String opcion, int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Elija mas de uno :v.");
            return;
        }
        int A = 10000;
        int V = 20000;
        int E = 50000;
        double precioSinDesc = 0;
        double precioConDesc = 0;

        switch (opcion) {
            case "A":
                precioSinDesc = cantidad * A;
                precioConDesc = precioSinDesc * 0.90;
                break;
            case "V":
                precioSinDesc = cantidad * V;
                precioConDesc = precioSinDesc * 0.95;
                break;
            case "E":
                precioSinDesc = cantidad * E;
                precioConDesc = precioSinDesc;
                break;
            default:
                System.out.println("Error: Opción inválida.");
                return;
        }

        Mostrar7.mostrarInfoTienda(precioConDesc, precioSinDesc);
    }
}

class Mostrar7 {
    public static void mostrarInfoTienda(double precioCon, double precioSin) {
        System.out.println("el precio sin descuento es de : $" + precioSin);
        System.out.println("el precio con descuento: $" + precioCon);
    }
}
