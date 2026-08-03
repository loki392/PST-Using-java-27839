import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int[] result = Arrays.stream(nums)
                             .filter(num -> num != val)
                             .toArray();

        System.out.println(Arrays.toString(result));
        System.out.println("Length = " + result.length);
    }
}