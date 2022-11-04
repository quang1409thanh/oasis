import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * .
     * 
     * @param x a
     */
    public void readCustomerList(InputStream x) {
        Scanner sc = new Scanner(x);
        String temp = "";
        while (sc.hasNext()) {
            temp += sc.nextLine() + '\n';
        }
        String[] line = temp.split("\n");
        int i = 0;
        int p = 0;
        while (i < line.length) {
            String namecus = "";
            String idcus = "";
            Customer cus = new Customer();
            if (line[i].charAt(0) > '9' || line[i].charAt(0) < '0') {
                int j = 0;
                while (line[i].charAt(j) > '9' || line[i].charAt(j) < '0') {
                    namecus += line[i].charAt(j);
                    j++;
                }
                namecus = namecus.substring(0, j - 1);
                while (j < line[i].length()) {
                    idcus += line[i].charAt(j);
                    j++;
                }
                long idcusL = Long.parseLong(idcus);
                cus = new Customer(idcusL, namecus);
                // =============================//
                p = i + 1;
                while (p < line.length && (line[p].charAt(0) <= '9'
                        && line[p].charAt(0) >= '0')) {
                    String accid = "";
                    String type = "";
                    String accbl = "";
                    int k = 0;
                    while (line[p].charAt(k) <= '9' && line[p].charAt(k) >= '0') {
                        accid += line[p].charAt(k);
                        k++;
                    }
                    k++;
                    while (line[p].charAt(k) <= 'Z' && line[p].charAt(k) >= 'A') {
                        type += line[p].charAt(k);
                        k++;
                    }
                    k++;
                    while (k < line[p].length()) {
                        accbl += line[p].charAt(k);
                        k++;
                    }
                    long accidL = Long.parseLong(accid);
                    double accblL = Double.parseDouble(accbl);
                    if (type.equals(Account.CHECKING)) {
                        Account test1 = new CheckingAccount(accidL, accblL);
                        cus.addAccount(test1);
                    } else if (type.equals(Account.SAVINGS)) {
                        Account test1 = new SavingsAccount(accidL, accblL);
                        cus.addAccount(test1);
                    }
                    p++;
                }
                customerList.add(cus);
            }
            i++;
        }

    }

    /**
     * .
     * 
     * @return ket qua
     */
    public String getCustomersInfoByNameOrder() {
        for (int i = 0; i < customerList.size(); i++) {
            for (int j = i; j < customerList.size(); j++) {
                if (customerList.get(j).getFullName()
                        .compareTo(customerList.get(i).getFullName()) < 0) {
                    Collections.swap(customerList, i, j);
                }
            }
        }
        String rs = customerList.get(0).getCustomerInfo();
        for (int i = 1; i < customerList.size(); i++) {
            rs += "\n" + customerList.get(i).getCustomerInfo();
        }
        return rs;
    }

    /**
     * .
     * 
     * @return ket qua sap xep
     */
    public String getCustomersInfoByIdOrder() {
        for (int i = 0; i < customerList.size(); i++) {
            for (int j = i; j < customerList.size(); j++) {
                if (customerList.get(j).getIdNumber() < customerList.get(i).getIdNumber()) {
                    Collections.swap(customerList, i, j);
                }
            }
        }
        String rs = customerList.get(0).getCustomerInfo();
        for (int i = 1; i < customerList.size(); i++) {
            rs += "\n" + customerList.get(i).getCustomerInfo();
        }
        return rs;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

}
