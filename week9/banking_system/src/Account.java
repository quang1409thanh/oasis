import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {
    }

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * .
     * 
     * @param amount a
     * @throws BankException a
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else {
            balance -= amount;
        }
    }

    /**
     * .
     * 
     * @param amount a
     * @throws BankException a
     */
    public void doDepositing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            balance += amount;
        }
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    /**
     * .
     * 
     * @return w
     */
    public String getTransactionHistory() {
        String rs = "Lịch sử giao dịch của tài khoản " + accountNumber + ":";
        for (int i = 0; i < transactionList.size(); i++) {
            rs += "\n" + transactionList.get(i).getTransactionSummary();
        }
        return rs;
    }

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * .
     * 
     * @return d
     */
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account temp = (Account) obj;
            if (this.accountNumber == temp.accountNumber) {
                return true;
            }
        }
        return false;
    }
}
