/*LocalDate En lugar de la antigua clase "Date" y es parte de la moderna API de fecha y hora de Java introducido en java 8 Reemplazando
 a las antiguas clases java.util.Date java.util.Calendar.
 LocalDate ofrece un manejo más intuitivo y seguro de las fechas. Puedes usarla para representar una fecha sin la necesidad 
 de preocuparte por zonas horarias o ajustes de tiempo.

 La clase Calendar es abstracta y proporciona métodos para convertir entre un instante específico en el tiempo y un conjunto de campos 
 de calendario, como año, mes, día del mes, etc. Sin embargo, Calendar tiene algunas limitaciones, como ser mutable y no ser 
 muy intuitiva. En su lugar, considera usar LocalDate o LocalDateTime para un manejo más sencillo de fechas y horas.

 SimpleDateFormat Para formatear y analizar fechas, puedes reemplazar SimpleDateFormat con DateTimeFormatterDateTimeFormatter también 
 forma parte de java.time y ofrece una sintaxis más clara y segura para formatear y analizar fechas y horas1


 GregorianCalendar: Si necesitas un calendario específico, GregorianCalendar es una implementación de Calendar. Sin embargo, en la 
 mayoría de los casos, puedes usar LocalDate o LocalDateTime en su lugarGregorianCalendar sigue siendo útil si debes trabajar con 
 sistemas heredados que requieren su uso específico.

 Las clases se encuentran en el paquete java.time y son parte de las mejoras introducidas en Java 8 para el manejo moderno de fechas y 
 horas.

 LocalDate: Esta clase representa una fecha sin zona horaria. Puedes encontrarla en el paquete java.time como java.time.LocalDate.
 DateTimeFormatter: Para formatear y analizar fechas, utiliza esta clase. Está disponible en el mismo paquete java.time como
 java.time.format.DateTimeFormatter.
 LocalDateTime: Si necesitas manejar tanto fecha como hora, LocalDateTime es la elección adecuada. También está en java.time como
 java.time.LocalDateTime.
 ZonedDateTime: Si requieres trabajar con zonas horarias, puedes usar esta clase. La encuentras en java.time como java.time.ZonedDateTime.

 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaActualEjemplo {
    public static void main(String[] args) {
        LocalDate fechaHoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHoy.format(formato);
        System.out.println("\nFecha actual: " + fechaFormateada);

            System.out.println("\nSumar un día a la fecha actual\n");
            LocalDate fechaTomrrow = fechaHoy.plusDays(1);

            System.out.println("Fecha actual: " + fechaHoy);
            System.out.println("Fecha mañana: " + fechaTomrrow);

            System.out.println("\nRestar un mes a la fecha actual\n");

            LocalDate fechaHaceUnMes = fechaHoy.minusMonths(1);

            System.out.println("Fecha actual: " + fechaHoy);
            System.out.println("Fecha hace un mes: " + fechaHaceUnMes);

            System.out.println("\nSumarle un año\n");


            LocalDate fechayearLater = fechaHoy.plusYears(1);

            System.out.println("Fecha actual: " + fechaHoy);
            System.out.println("Fecha en un año: " + fechayearLater);


            


    }
}
