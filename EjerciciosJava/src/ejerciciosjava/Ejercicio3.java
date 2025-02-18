package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio3 {
    public static void PesoAscensor() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese pa donde quiere ir  :");
        int opcion = dato.nextInt();
        Scanner kg = new Scanner(System.in);
        System.out.print("Ingrese su peso  :");
        int peso = kg.nextInt();
        ProcesoPeso3.procesarInfo(opcion,peso);
    }
}

class ProcesoPeso3 {
    public static void procesarInfo(int opcion, int peso) {
        System.out.println("Opción ingresada: " + opcion);
        if (opcion <= 10 && opcion >= 0 && peso > 0 && peso <= 150) {
            Mostrar3.mostrarInfo3(true,opcion);
        } else {
            Mostrar3.mostrarInfo3(false,opcion);
        }
    }
}

class Mostrar3 {
    public static void mostrarInfo3(boolean estado,int opcion) {
        if (estado) {
            System.out.println("moviendose al piso  :" + opcion);
        } else {
            System.out.println("no existe el piso  :"+ opcion);
        }
    }
}
