package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio10 {
    public static void CalcularCat() {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = dato.nextInt();
        CategoriaCine.calcularC(edad);
    }
}

class CategoriaCine {
    public static void calcularC(int edad) {
        String categoria;
        if (edad <= 7 && edad >=1) {
            categoria = "niños" ;
        } else if (edad >= 8 && edad <= 17) {
            categoria = "adolescentes";
        } else if (edad >= 18 && edad <= 30 ) {
            categoria = "adultos";
        } else if (edad >= 31  && edad <=100) {
            categoria = "personas mayores";
        }
        else {
            System.out.println("ponga una edad valida que eso no sirve:v");
            return;
        }
        
        switch (categoria) {
            case "niños":
                mostrarInfoCine.mostrarResultado(categoria, "se recomiendan peliculas de aventura y animadas");
                break;
            case "adolescentes":
                mostrarInfoCine.mostrarResultado(categoria, " : se recomiendan peliculas de accion y aventura");
                break;
            case "adultos":
                mostrarInfoCine.mostrarResultado(categoria, " : se recomiendan peliculas romanticas y de accion");
                break;
            case "personas mayores":
                mostrarInfoCine.mostrarResultado(categoria, " : se recomiendan peliculas antiguas y de suspenso");
                break;
            default:
                System.out.println("Error por si acaso que uno nunca sabe xd");
        }
    }
}

class mostrarInfoCine {
    public static void mostrarResultado(String categoria, String mensaje) {
        System.out.printf(categoria + mensaje);
    }
}
