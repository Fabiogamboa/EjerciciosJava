package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio21 {
    public static void iniciarRegistro() {
        Scanner scanner = new Scanner(System.in);
        //double, pues es double xd
        double sumaNotas = 0;
        int cantidadNotas = 0;
        double nota;
        String continuar;

        do {
            System.out.print("ponga la nota del examen: ");
            nota = scanner.nextDouble();
            // se llama al proceso procesarNotas pa que retorne cada vez que se le mande :v
            // y por cada vuelta pues se acumula xd
            sumaNotas = ProcesadorNotas.registrarNota(nota, sumaNotas);
            //cantidad notas pues es un contador noma, por cada "vuelta" se suma 1 xd
            cantidadNotas++;
            System.out.print("¿Desea ingresar otra nota? (si/no): ");
            continuar = scanner.nextLine();
            // averiguando metodos me tope con este :v
            // basicamente, no diferencia entre mayusculas o minusculas xd
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
        System.out.printf("\nPromedio finalgo : " + promedio);

        if (promedio >= 3.0) {
            System.out.println("tabien, pasó :v");
        } else {
            System.out.println("no te supiste la de aprender gorda");
        }
    }
}
