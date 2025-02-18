package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio6 {
    public static void TempAscensor() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese pa donde quiere ir  :");
        int opcion = dato.nextInt();
        System.out.print("Ingrese la temperatura  :");
        int temp = dato.nextInt();
        ProcesoT.procesarInfo(opcion,temp);
    }
}

class ProcesoT {
    public static void procesarInfo(int opcion, int temp) {
        System.out.println("Opción ingresada: " + opcion);
        if (opcion <= 10 && opcion >= 0 && temp > 10 && temp <= 27) {
            Mostrar3.mostrarInfo(true,opcion);
        } else {
            Mostrar3.mostrarInfo(false,opcion);
        }
    }
}

class Mostrar3 {
    public static void mostrarInfo(boolean estado,int opcion) {
        if (estado) {
            System.out.println("moviendose al piso  :" + opcion);
        } else {
            System.out.println("no existe el piso  :"+ opcion);
        }
    }
}
