package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio10 {
    public static void CalcularCamp() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese el resultado del partido (Ganado, Perdido o Empatado): ");
        String resultado = dato.nextLine().toUpperCase();
        CategoriaFutbol.calcularF(resultado);
        dato.close();
    }
}

class CategoriaFutbol {
    public static void calcularF(String resultado) {
        String mensaje = "";
        switch (resultado) {
            case "EMPATADO":
                mensaje = "Equipos empatados, no hay puntos pa nadie.";
                break;
            case "GANADO":
                mensaje = "mero equipo god, ganó.";
                break;
            case "PERDIDO":
                mensaje = "JAJAJAJA, SU EQUIPO PERDIÓ.  Que bots :v";
                break;
            default:
                mensaje = "si te sabes la de leer las instrucciones bro?.";
        }
        MostrarInfoCam.mostrarResultado(mensaje);
    }
}

class MostrarInfoCam {
    public static void mostrarResultado(String mensaje) {
        System.out.println(mensaje);
    }
}
