package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio19 {
    public static void menuComidasRapidas() {
        Scanner scanner = new Scanner(System.in);
        double costoTotal = 0;
        int opcion;
        
        do {
            System.out.println("Seleccione una opcion de menu");
            System.out.println("1. potatos - 8000");
            System.out.println("2. queso - 2000");
            System.out.println("3. arroz con leche - 4000");
            System.out.println("4. Queso pero con bocadillo - 5000");
            System.out.println("5. Finalizar");
            
            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    costoTotal += 8000;
                    break;
                case 2:
                    costoTotal += 2000;
                    break;
                case 3:
                    costoTotal += 4000;
                    break;
                case 4:
                    costoTotal += 5000;
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
        } while(opcion != 5);
        
        System.out.println("El costo total de su pedido es: " + costoTotal);
    }
}