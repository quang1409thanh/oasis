public class CheckingAccount extends Account {

    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
            transactionList.add(new Transaction(2, amount, balance + amount, balance));
        } catch (BankException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
            transactionList.add(new Transaction(1, amount, balance - amount, balance));
        } catch (BankException e) {
            e.printStackTrace();
        }
    }
}
