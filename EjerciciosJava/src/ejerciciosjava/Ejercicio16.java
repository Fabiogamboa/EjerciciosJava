package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio16 {
    public static void cuentaRegresiva() {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        System.out.print("Ingrese un numero entero positivo para la cuenta regresiva: ");
        numero = scanner.nextInt();
        
        if (numero > 0) {
            while (numero >= 0) {
                System.out.println(numero);
                numero--;
            }
            System.out.println("Tiempo cumplido");
        } else {
            System.out.println("Por favor ingrese un numero entero positivo");
        }
    }
}