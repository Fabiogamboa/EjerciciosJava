package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio21 {
    public static void iniciarRegistro() {
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;
        int cantidadNotas = 0;
        double nota;
        String continuar;

        do {
            System.out.print("Ingrese la nota del examen: ");
            nota = scanner.nextDouble();
            sumaNotas = ProcesadorNotas.registrarNota(nota, sumaNotas);
            cantidadNotas++;
            System.out.print("¿Desea ingresar otra nota? (si/no): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("si"));
        
        if (cantidadNotas > 0) {
            MostrarResultados.mostrarPromedio(sumaNotas, cantidadNotas);
        } else {
            System.out.println("No se ingresaron notas. ¡Hasta la próxima!");
        }
    }
}

class ProcesadorNotas {
    public static double registrarNota(double nota, double sumaNotas) {
        return sumaNotas + nota;
    }
}

class MostrarResultados {
    public static void mostrarPromedio(double sumaNotas, int cantidadNotas) {
        double promedio = sumaNotas / cantidadNotas;
        System.out.printf("\nPromedio final: %.2f\n", promedio);

        if (promedio >= 3.0) {
            System.out.println("¡Felicidades! Has aprobado.");
        } else {
            System.out.println("Lo siento, has reprobado.");
        }
    }
}
