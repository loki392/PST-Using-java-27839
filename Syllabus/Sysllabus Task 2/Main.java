import java.util.*;
import java.util.stream.*;

class Reading {
    String sensorId;
    double temperature;

    Reading(String sensorId, double temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Reading> readings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String sensorId = sc.next();
            double temperature = sc.nextDouble();
            readings.add(new Reading(sensorId, temperature));
        }

        // Filter temperatures > 50, group by sensor ID, and calculate average
        Map<String, Double> avgTemperature = readings.stream()
                .filter(r -> r.temperature > 50)
                .collect(Collectors.groupingBy(
                        r -> r.sensorId,
                        Collectors.averagingDouble(r -> r.temperature)
                ));

        // Sort by average temperature in descending order
        avgTemperature.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry ->
                        System.out.println(entry.getKey() + " " + entry.getValue())
                );

        sc.close();
    }
}