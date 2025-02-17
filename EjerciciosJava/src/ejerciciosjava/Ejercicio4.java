package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio4 {
    public static void Temperatura() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la temperatura actual  :");
        int opcion = dato.nextInt();
        ProcesosTemp.procesarInfo(opcion);
    }
}

class ProcesosTemp {
    public static void procesarInfo(int opcion) {
        System.out.println("Opción ingresada: " + opcion + " grados");
        if (opcion <= 25 && opcion >= 18) {
            MostrarTemp.mostrarInfo(true,opcion);
        } else {
            MostrarTemp.mostrarInfo(false,opcion);
        }
    }
}

class MostrarTemp {
    public static void mostrarInfo(boolean estado,int opcion) {
        if (estado) {
            System.out.println("la temperatura es de "+ opcion + " osea, que es adecuada :v");
        } else {
            System.out.println("La temperatura no es adecuada xd");
        }
    }
}
