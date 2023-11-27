public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Debit successful. Remaining balance: " + balance);
        } else {
            System.out.println("Debit amount exceeded account balance. Balance remains unchanged.");
        }
    }

    public static void main(String[] args) {
        // Simple debit example
        Account account = new Account(500);
        System.out.println("Initial balance: " + account.getBalance());

        double debitAmount = 300;
        if (debitAmount <= account.getBalance()) {
            account.debit(debitAmount);
            System.out.println("Final balance: " + account.getBalance());
        } else {
            System.out.println("Debit amount exceeds account balance. Balance remains unchanged.");
        }
    }
}

