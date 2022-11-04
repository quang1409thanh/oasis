import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance = balance + amount;
        }
    }

    /**
     * .
     *
     * @param amount h
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance = balance - amount;
        }
    }

    /**
     * .
     *
     * @param amount    h
     * @param operation trạng thái
     */
    public void addTransaction(double amount, String operation) {
        if (operation != Transaction.DEPOSIT && operation != Transaction.WITHDRAW) {
            System.out.println("Yeu cau khong hop le!");
        } else {
            if (Transaction.DEPOSIT.equals(operation)) {
                deposit(amount);
            } else if (Transaction.WITHDRAW.equals(operation)) {
                withdraw(amount);
            }
            Transaction temp = new Transaction(operation, amount, balance);
            transitionList.add(temp);
        }
    }

    String roundOffTo2DecPlaces(double val) {
        return String.format("%.2f", val);
    }

    /** print. */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
                String rs1 = roundOffTo2DecPlaces(transitionList.get(i).getAmount());
                String rs2 = roundOffTo2DecPlaces(transitionList.get(i).getBalance());
                System.out.print("Giao dich " + (i + 1));
                System.out.println(": Nap tien $" + rs1 + ". So du luc nay: $" + rs2 + ".");
            } else if (transitionList.get(i).getOperation().equals(Transaction.WITHDRAW)) {
                String rs1 = roundOffTo2DecPlaces(transitionList.get(i).getAmount());
                String rs2 = roundOffTo2DecPlaces(transitionList.get(i).getBalance());
                System.out.print("Giao dich " + (i + 1));
                System.out.println(": Rut tien $" + rs1 + ". So du luc nay: $" + rs2 + ".");
            }
        }
    }

    /**
     * .
     *
     * @param args h
     */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(2000.255, "depwosit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();
    }
}
 