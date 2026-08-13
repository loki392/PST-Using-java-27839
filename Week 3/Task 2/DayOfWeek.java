import java.time.LocalDate;

public class DayOfWeek {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 8, 13);

        String day = date.getDayOfWeek().toString();

        System.out.println("Day of the week: " + day);
    }
}