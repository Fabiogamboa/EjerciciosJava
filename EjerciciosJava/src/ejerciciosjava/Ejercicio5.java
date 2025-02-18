package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio5 {
    public static void TemperaturaUmbral() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese la temperatura actual  :");
        int opcion = dato.nextInt();
        ProcesosTempUmbral.procesarInfo(opcion);
    }
}

class ProcesosTempUmbral {
    public static void procesarInfo(int opcion) {
        System.out.println("Opción ingresada: " + opcion + " grados");
        if (opcion <= 25 && opcion >= 18) {
            MostrarTempUmbral.mostrarInfo(true,opcion);
        } else {
            MostrarTempUmbral.mostrarInfo(false,opcion);
        }
    }
}

class MostrarTempUmbral {
    public static void mostrarInfo(boolean estado,int opcion) {
        if (estado) {
            System.out.println("la temperatura es de "+ opcion + " osea, que es adecuada :v");
        } else {
            System.out.println("La temperatura excede el umbral de alerta, busca refugio >:v");
        }
    }
}
