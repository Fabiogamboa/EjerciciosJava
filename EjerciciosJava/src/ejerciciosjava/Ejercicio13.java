package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio13 {
    public static void compraTiendaOnline() {
        Scanner scanner = new Scanner(System.in);
        
        double totalCompra = 0;
        String agregarOtroProducto;
        
        do {
            System.out.print("Ingrese el precio del producto: $");
            double precio = scanner.nextDouble();
            
            System.out.print("Ingrese la cantidad de productos que desea comprar: ");
            int cantidad = scanner.nextInt();
            
            totalCompra += precio * cantidad;
            
            System.out.print("Deseas agregar otro producto? (si/no): ");
            agregarOtroProducto = scanner.next();
            
        } while (agregarOtroProducto.equalsIgnoreCase("si"));
        
        System.out.println("\nTotal de la compra: $" + totalCompra);
    }
}