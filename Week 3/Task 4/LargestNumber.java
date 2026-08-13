import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {

        Integer[] numbers = {10, 5, 20, 8, 15};

        Arrays.sort(numbers, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        System.out.println("Numbers in descending order:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Largest Number: " + numbers[0]);
    }
}