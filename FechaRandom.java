import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;
public class FechaRandom {
    public static void main(String[] args) {
        // Obtener la fecha del 11 de septiembre de 2001
        LocalDate TwentyCent = LocalDate.of(2001, Month.SEPTEMBER, 11);

        LocalDate fechaActual = LocalDate.now();
        DayOfWeek diaSemana = fechaActual.getDayOfWeek();

        String nameDay = diaSemana.toString(); // Devuelve el nombre en inglés (por ejemplo, "MONDAY")

        // Si deseas obtener el nombre en español, puedes hacer una traducción manual
        String nombreDiaEspanol = traducirNombreDia(nameDay);

        System.out.println("Fecha específica: " + TwentyCent + " " + diaSemana + " / " + nombreDiaEspanol);

        System.out.println("Day in (inglish):" + diaSemana);
        System.out.println("Día en (español):" + nombreDiaEspanol);
    }

    // Traducción manual de nombres de días de inglés a español
    private static String traducirNombreDia(String nameDay) {
        switch (nameDay) {
            case "MONDAY":
                return "Lunes";
            case "TUESDAY":
                return "Martes";
            case "WEDNESDAY":
                return "Miércoles";
            case "THURSDAY":
                return "Jueves";
            case "FRIDAY":
                return "Viernes";
            case "SATURDAY":
                return "Sábado";
            case "SUNDAY":
                return "Domingo";
            default:
                return "Desconocido";
        }
    }
}
/*para obtener una fecha aleatoria utilizamos LocalDate.of para crear una instancia de LocalDate con la fecha deseada

 *Obtenemos la fecha actual utilizando LocalDate.now() Luego utilizamos getDayOfWeek() para obtener el día de la semana 
 *como un objeto DayOfWeek y traducimos el nombre del día al español utilizando la función traducirNombreDia()
 */