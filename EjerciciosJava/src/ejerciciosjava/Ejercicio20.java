package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio20 {
    public static void sensorTemperatura() {
        Scanner scanner = new Scanner(System.in);
        double temperatura;
        
        do {
            System.out.print("Ingrese la temperatura actual: ");
            temperatura = scanner.nextDouble();
            
            if(temperatura < 18 || temperatura > 25) {
                System.out.println("Alerta: La temperatura esta fuera del rango aceptable.");
            }
            
        } while(temperatura < 18 || temperatura > 25);
        
        System.out.println("Temperatura dentro del rango aceptable.");
    }
}