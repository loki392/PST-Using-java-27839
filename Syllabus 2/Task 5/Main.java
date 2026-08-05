
import java.util.*;

class BankAccount {
    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        BankAccount account = new BankAccount();

        for (int i = 0; i < N; i++) {
            String operation = sc.next();
            int amount = sc.nextInt();

            if (operation.equalsIgnoreCase("Deposit")) {
                account.deposit(amount);
            } else if (operation.equalsIgnoreCase("Withdraw")) {
                account.withdraw(amount);
            }
        }

        System.out.println(account.getBalance());

        sc.close();
    }
}

