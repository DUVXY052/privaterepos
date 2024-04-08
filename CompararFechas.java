import java.time.LocalDate;
import java.time.Period;

public class CompararFechas {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2004, 5, 12);
        LocalDate fecha2 = LocalDate.of(2018, 3, 18);

        if (fecha1.equals(fecha2)) {
            System.out.println("Las fechas son iguales");
        } else {
            System.out.println("Las fechas no son iguales");
        }

        System.out.println("\nDiferencia en años, meses y dias\n");

        LocalDate fechaInicio = LocalDate.of(1990, 5, 15);
        LocalDate fechaFin = LocalDate.of(2024, 4, 7);

        // Calcular la diferencia entre las fechas
        Period periodo = Period.between(fechaInicio, fechaFin);

        int anios = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        System.out.println("Años: " + anios);
        System.out.println("Meses: " + meses);
        System.out.println("Días: " + dias);
    }
}
