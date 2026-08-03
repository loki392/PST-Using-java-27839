import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {

        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 1, 2}
        };

        int richest = Arrays.stream(accounts)
                .mapToInt(customer -> Arrays.stream(customer).sum())
                .max()
                .orElse(0);

        System.out.println("Richest Wealth = " + richest);
    }
}