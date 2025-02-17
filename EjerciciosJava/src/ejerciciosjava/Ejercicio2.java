package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio2 {
    public static void Ascensor() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese pa donde quiere ir");
        int opcion = dato.nextInt();
        ProcesoAsc.procesarInfo(opcion);
    }
}

class ProcesoAsc {
    public static void procesarInfo(int opcion) {
        System.out.println("Opción ingresada: " + opcion);
        if (opcion <= 10 && opcion >= 0) {
            Mostrar.mostrarInfo(true,opcion);
        } else {
            Mostrar.mostrarInfo(false,opcion);
        }
    }
}

class Mostrar {
    public static void mostrarInfo(boolean estado,int opcion) {
        if (estado) {
            System.out.println("moviendose al piso" + opcion);
        } else {
            System.out.println("no existe el piso "+ opcion);
        }
    }
}
