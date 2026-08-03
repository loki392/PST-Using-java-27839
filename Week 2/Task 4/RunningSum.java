import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class RunningSum {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        AtomicInteger sum = new AtomicInteger(0);

        int[] result = Arrays.stream(nums)
                .map(num -> sum.addAndGet(num))
                .toArray();

        System.out.println(Arrays.toString(result));
    }
}