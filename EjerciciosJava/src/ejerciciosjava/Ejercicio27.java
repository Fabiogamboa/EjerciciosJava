package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio27 {
    public static void gestionarSuma() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a sumar: ");
        int cantidadNumeros = scanner.nextInt();

        double sumaTotal = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            double numero = ValidadorNumero.obtenerNumeroValido(scanner, i + 1);
            sumaTotal = ProcesadorSuma.acumularSuma(sumaTotal, numero);
        }

        MostrarResultado.mostrarSuma(sumaTotal);
    }
}

class ValidadorNumero {
    public static double obtenerNumeroValido(Scanner scanner, int index) {
        double numero;
        while (true) {
            System.out.print("Ingrese el número " + index + ": ");
            if (scanner.hasNextDouble()) {
                numero = scanner.nextDouble();
                break;
            } else {
                System.out.println("⚠ Entrada inválida. Ingrese un número válido.");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
        return numero;
    }
}

class ProcesadorSuma {
    public static double acumularSuma(double sumaActual, double numero) {
        return sumaActual + numero;
    }
}

class MostrarResultado {
    public static void mostrarSuma(double sumaTotal) {
        System.out.println("\nLa suma total de los números ingresados es: " + sumaTotal);
    }
}
