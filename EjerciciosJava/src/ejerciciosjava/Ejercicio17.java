package ejerciciosjava;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    public static void juegoAdivinanza() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(50) + 1;
        int intento;
        
        System.out.println("Adivina el numero entre 1 y 50");
        
        while (true) {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();
            
            if (intento < numeroSecreto) {
                System.out.println("El numero es mayor");
            } else if (intento > numeroSecreto) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("Felicidades, adivinaste el numero");
                break;
            }
        }
    }
}