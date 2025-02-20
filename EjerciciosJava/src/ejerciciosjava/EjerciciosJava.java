package ejerciciosjava;
import java.util.Scanner;

public class EjerciciosJava {
    public static void main(String[] args) {
        Scanner tomaDato = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("");
            System.out.println("Ingrese el número del ejercicio que desea ver (1-29) o 0 para salir:");
            opcion = tomaDato.nextInt();
            
            if (opcion >= 1 && opcion <= 29) {
                switch (opcion) {
                    case 1:
                        Ejercicio1 obj1 = new Ejercicio1();
                        obj1.ejecutar();
                        break;
                    case 2:
                        Ejercicio2 obj2 = new Ejercicio2();
                        obj2.Ascensor();
                        break;
                    case 3:
                        Ejercicio3 obj3 = new Ejercicio3();
                        obj3.PesoAscensor();
                        break;
                    case 4:
                        Ejercicio4 obj4 = new Ejercicio4();
                        obj4.Temperatura();
                        break;
                    case 5:
                        Ejercicio5 obj5 = new Ejercicio5();
                        obj5.TemperaturaUmbral();
                        break;
                    case 6:
                        Ejercicio6 obj6 = new Ejercicio6();
                        obj6.TempAscensor();
                        break;
                    case 7:
                        Ejercicio7 obj7 = new Ejercicio7();
                        obj7.TiendaDesc();
                        break;
                    case 8:
                        Ejercicio8 obj8 = new Ejercicio8();
                        obj8.CalcularImc();
                        break;
                    case 9:
                        Ejercicio9 obj9 = new Ejercicio9();
                        obj9.CalcularCat();
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("El numero ingresado está fuera del rango (1-29), hágalo de nuevo :v");
            }
        } while (opcion != 0);
        
        System.out.println("Finish him Fatality!");
    }
}
