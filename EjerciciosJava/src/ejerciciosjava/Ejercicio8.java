package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio8 {
    public static void CalcularImc() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        double peso = dato.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = dato.nextDouble();
        double imc = peso / (altura * altura); // Fórmula del IMC
        Categoria.procesarImc(imc);
    }
}

class Categoria {
    public static void procesarImc(double imc) {
        int categoria;
        if (imc < 18.5) {
            categoria = 1;
        } else if (imc < 24.9) {
            categoria = 2;
        } else if (imc < 29.9) {
            categoria = 3;
        } else {
            categoria = 4;
        }
        switch (categoria) {
            case 1:
                mostrarInfoImc.mostrarResultado(imc, "Bajo peso");
                break;
            case 2:
                mostrarInfoImc.mostrarResultado(imc, "Peso normal");
                break;
            case 3:
                mostrarInfoImc.mostrarResultado(imc, "gordito");
                break;
            case 4:
                mostrarInfoImc.mostrarResultado(imc, "gordo re gordo");
                break;
            default:
                System.out.println("Error por si acaso xd");
        }
    }
}

class mostrarInfoImc {
    public static void mostrarResultado(double imc, String categoria) {
        System.out.printf("Su IMC es de "+ imc + " y pertenece a la categoría de "+ categoria);
    }
}
