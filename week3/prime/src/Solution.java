import java.lang.Math;

// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * .
     *
     * @param n số đầu vào
     * @return kết quả đúng hoặc sai
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] x) {
        System.out.println(isPrime(13));
    }
} 