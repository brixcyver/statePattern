public class ActiveState implements AccountState {
    @Override
    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited " + amount + ". Current balance: " + account.getBalance());
    }

    @Override
    public void withdraw(Account account, double amount) {
        double newBalance = account.getBalance() - amount;
        boolean sufficientBalance = newBalance >= 0;
        account.setBalance(sufficientBalance ? newBalance : account.getBalance());
        System.out.println(sufficientBalance ? "Withdrawn " + amount + ". Current balance: " + account.getBalance() : "Insufficient balance.");
    }

    @Override
    public void suspend(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void close(Account account) {
        account.setAccountState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
