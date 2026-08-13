import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Integer[] numbers = {5, 2, 8, 1, 9};

        Arrays.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        System.out.println(Arrays.toString(numbers));
    }
}