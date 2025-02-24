package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio12 {
    public static void cajeroAutomatico() {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 100000;
        double montoRetirar;
        
        System.out.println("Bienvenido al cajero automatico.");
        
        while (true) {
            System.out.println("Saldo disponible: $" + saldo);
            System.out.print("Ingrese el monto que desea retirar: ");
            montoRetirar = scanner.nextDouble();
            
            if (montoRetirar > saldo) {
                System.out.println("Error: El monto ingresado excede el saldo disponible.");
            } else if (montoRetirar <= 0) {
                System.out.println("Error: El monto a retirar debe ser mayor que cero.");
            } else {
                saldo -= montoRetirar;
                System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
                break;
            }
        }
    }
}