import java.util.Scanner;
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super("Low Balance Exception: " + message);
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdrawal(int amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000.0);

        System.out.print("Enter the withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();

        try {
            account.withdrawal(withdrawalAmount);
        } catch (LowBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

