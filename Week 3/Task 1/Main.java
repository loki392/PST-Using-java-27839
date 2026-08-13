import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2026, 8, 11);
        LocalDate date2 = LocalDate.of(2026, 8, 20);

        long days = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Number of days: " + days);
    }
}