import java.time.LocalDate;

public class DayOfYear {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 8, 13);

        int day = date.getDayOfYear();

        System.out.println("Day of the year: " + day);
    }
}