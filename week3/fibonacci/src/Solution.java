// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * .
     *
     * @param n nhập vào số nguyên thứ n
     * @return số fibonacci thứ n
     */
    public static long fibonacci(long n) {
        long first = 0;
        long second = 1;
        long next = 0;
        if (n < 0) {
            return -1;
        } else {
            for (int i = 0; i < n; i++) {
                first = second;
                second = next;
                next = first + second;
            }
            if (second > Long.MAX_VALUE - first) {
                return Long.MAX_VALUE;
            } else {
                return next;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
} 