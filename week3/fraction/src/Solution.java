// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    private int numerator;
    private int denominator = 1;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * .
     *
     * @param denominator mẫu số
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * .
     * Hello
     */
    public Solution(int numerator, int denominator) {
        super();
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * .
     *
     * @param a số a
     * @param b số b
     * @return ước chung lớn nhất của a và b
     */
    public int gcd(int a, int b) {
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

    /**
     * .
     *
     * @return phân số tối giản
     */
    public Solution reduce() {
        int x = gcd(numerator, denominator);
        this.numerator = numerator / x;
        this.denominator = denominator / x;
        if (numerator >= 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        } else if (numerator <= 0 && denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        return this;
    }

    /**
     * .
     *
     * @param x tham số đầu vào phân số x
     * @return x
     */
    public Solution add(Solution x) {
        this.reduce();
        x.reduce();
        this.numerator = this.numerator * x.denominator + x.numerator * this.denominator;
        this.denominator = this.denominator * x.denominator;
        this.reduce();
        return this;
    }

    /**
     * .
     *
     * @param x phân số x
     * @return d
     */
    public Solution subtract(Solution x) {
        this.reduce();
        x.reduce();
        this.numerator = this.numerator * x.denominator - x.numerator * this.denominator;
        this.denominator = this.denominator * x.denominator;
        this.reduce();
        return this;
    }

    /**
     * .
     *
     * @param x phân số x
     * @return s
     */
    public Solution multiply(Solution x) {
        this.reduce();
        x.reduce();
        this.numerator = this.numerator * x.numerator;
        this.denominator = this.denominator * x.denominator;
        this.reduce();
        return this;
    }

    /**
     * .
     *
     * @param x phân số x
     * @return x
     */
    public Solution divide(Solution x) {
        if (x.numerator != 0 && x.denominator != 0) {
            this.reduce();
            x.reduce();
            this.numerator = this.numerator * x.denominator;
            this.denominator = this.denominator * x.numerator;
            this.reduce();
        }
        return this;
    }

    /**
     * .
     *
     * @param obj phân số x
     * @return k
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            // compare this vs other here
            this.reduce();
            other.reduce();
            if (this.numerator == 0 && other.numerator == 0) {
                return true;
            } else if (this.numerator == other.numerator && this.denominator == other.denominator) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

} 