import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        AtomicInteger previous = new AtomicInteger(Integer.MIN_VALUE);

        int[] result = Arrays.stream(nums)
                .filter(num -> {
                    if (num != previous.get()) {
                        previous.set(num);
                        return true;
                    }
                    return false;
                })
                .toArray();

        System.out.println(Arrays.toString(result));
        System.out.println("Length = " + result.length);
    }
}