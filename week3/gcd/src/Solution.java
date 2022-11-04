// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    /**
     * .
     *
     * @param a số a
     * @param b số b
     * @return ước chung lớn nhất của a và b
     */
    public static int gcd(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(123, 21));
    }
} 