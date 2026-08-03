import java.util.Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int pivot = -1;

        for (int i = 0; i < nums.length; i++) {

            if (leftSum == totalSum - leftSum - nums[i]) {
                pivot = i;
                break;
            }

            leftSum += nums[i];
        }

        System.out.println("Pivot Index = " + pivot);
    }
}