import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = Arrays.stream(nums)
                .map(num -> num * num)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(result));
    }
}