import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    public Customer() {
    }

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * .
     * 
     * @return a
     */
    public String getCustomerInfo() {
        String rs = "";
        rs += "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
        return rs;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * .
     * 
     * @param account g
     */
    public void removeAccount(Account account) {
        if (accountList.size() > 0) {
            accountList.remove(account);
        }
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
