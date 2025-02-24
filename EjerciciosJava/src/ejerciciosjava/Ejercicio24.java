package ejerciciosjava;

import java.util.Scanner;

public class Ejercicio24 {
    public static void registroParqueadero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de vehículos a registrar: ");
        int cantidadVehiculos = scanner.nextInt();
        StringBuilder listaVehiculos = new StringBuilder();

        for (int i = 0; i < cantidadVehiculos; i++) {
            System.out.print("Ingrese la placa del vehículo " + (i + 1) + ": ");
            String placa = scanner.nextLine();
            System.out.print("Ingrese la hora de ingreso (HH:MM): ");
            String horaIngreso = scanner.nextLine();
            ProcesadorParqueadero.registrarVehiculo(placa, horaIngreso, listaVehiculos);
        }

        MostrarParqueadero.mostrarResumen(listaVehiculos.toString());
    }
}

class ProcesadorParqueadero {
    public static void registrarVehiculo(String placa, String horaIngreso, StringBuilder listaVehiculos) {
        listaVehiculos.append("Placa: ").append(placa)
                      .append(" - Hora de ingreso: ").append(horaIngreso)
                      .append("\n");
    }
}

class MostrarParqueadero {
    public static void mostrarResumen(String vehiculos) {
        System.out.println("\n--- Resumen de Vehículos Registrados ---");
        System.out.print(vehiculos);
        System.out.println("¡Registro completado!");
    }
}
