public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;
    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * .
     * 
     * @param type           a
     * @param amount         a
     * @param initialBalance a
     * @param finalBalance   a
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    private String getTransactionTypeString(int type1) {
        String rs = "";
        switch (type1) {
            case TYPE_DEPOSIT_CHECKING:
                rs += "Nạp tiền vãng lai";
                break;
            case TYPE_WITHDRAW_CHECKING:
                rs += "Rút tiền vãng lai";
                break;
            case TYPE_DEPOSIT_SAVINGS:
                rs += "Nạp tiền tiết kiệm";
                break;
            case TYPE_WITHDRAW_SAVINGS:
                rs += "Rút tiền tiết kiệm";
                break;
            default:
                break;
        }
        return rs;
    }

    /**
     * .
     * 
     * @return e
     */
    public String getTransactionSummary() {
        String rs0 = "";
        String rs1 = getTransactionTypeString(type);
        String rs2 = String.format("%.2f", initialBalance);
        String rs3 = String.format("%.2f", amount);
        String rs4 = String.format("%.2f", finalBalance);
        rs0 += "- Kiểu giao dịch: " + rs1 + ". Số dư ban đầu: $"
                + rs2 + ". Số tiền: $" + rs3 + ". Số dư cuối: $" + rs4 + ".";
        return rs0;
    }
}
