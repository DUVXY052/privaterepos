import java.time.LocalDate;
import java.time.Year;

public class Birtciest {
    public static void main(String[] args) {
        int year = 2004; // Cambia a cualquier año que desees verificar

        boolean esBisiesto = Year.of(year).isLeap();
        if (esBisiesto) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es un año bisiesto.");
        }

        System.out.println("\nCumpleaños!!\n");

        int anioNacimiento = 2004;
        int mesNacimiento = 12;
        int diaNacimiento = 5;
    
        // Crea una instancia de LocalDate con tu fecha de nacimiento
        LocalDate fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
    
        System.out.println("Tu fecha de nacimiento es: " + fechaNacimiento);    
    }
}