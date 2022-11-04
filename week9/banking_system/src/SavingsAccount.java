public class SavingsAccount extends Account {
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if ((balance - amount) >= 5000 && amount <= 1000) {
            try {
                doWithdrawing(amount);
                transactionList.add(new Transaction(4, amount, balance + amount, balance));
            } catch (BankException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
            transactionList.add(new Transaction(3, amount, balance - amount, balance));
        } catch (BankException e) {
            e.printStackTrace();
        }
    }
}
