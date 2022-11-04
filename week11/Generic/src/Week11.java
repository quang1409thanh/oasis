import java.util.Collections;
import java.util.List;

public class Week11 {

    /**
     * .
     */
    public static <T> List<T> sortGeneric(List<T> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (check(arr.get(j), arr.get(i)) < 0) {
                    System.out.println(1);
                    Collections.swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    /**
     * .
     */
    public static <T> int check(T x1, T x2) {
        if (x1 instanceof String && x2 instanceof String) {
            return ((String) x1).compareTo((String) x2);
        } else if (x1 instanceof Integer && x2 instanceof Integer) {
            if (((Integer) x1).intValue() < ((Integer) x2).intValue()) {
                return -1;
            } else if (((Integer) x1).intValue() > ((Integer) x2).intValue()) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return Person.checkP((Person) x1, (Person) x2);
        }
    }

}
