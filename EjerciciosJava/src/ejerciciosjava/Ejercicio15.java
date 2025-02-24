package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio15 {
    public static void Viaje() {
        Scanner scanner = new Scanner(System.in);
        double distancia, velocidad, tiempo;
        String hacerOtroViaje; 
        do {
            System.out.print("Ingrese la distancia total del viaje (en km): ");
            distancia = scanner.nextDouble();
            System.out.print("Ingrese la velocidad promedio del coche (en km/h): ");
            velocidad = scanner.nextDouble();
            tiempo = distancia / velocidad;
            System.out.println("El tiempo estimado del viaje es: " + tiempo + " horas."); 
            System.out.print("Desea hacer otro viaje? (si/no): ");
            hacerOtroViaje = scanner.next();
            
        } while (hacerOtroViaje.equalsIgnoreCase("si"));
    }
}