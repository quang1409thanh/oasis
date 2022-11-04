public class Week4 {
    /**
     * .
     *
     * @param a a
     * @param b b
     * @return max
     */
    public static int max2Int(int a, int b) {
        // Tim gia tri lon nhat cua hai so nguyen
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * .
     *
     * @param array array
     * @return min
     */
    public static int minArray(int[] array) {
        // Tim gia tri nho nhat cua 1 mang so nguyen
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * .
     *
     * @param weight rong
     * @param height dai
     * @return bmi
     */
    public static String calculateBMI(double weight, double height) {
        // Tinh BMI
        double bmi = weight / (height * height);
        double rs = (double) Math.round(bmi * 10) / 10;
        if (rs >= 25) {
            return "Béo phì";
        } else if (rs >= 23 && rs <= 24.9) {
            return "Thừa cân";
        } else if (rs >= 18.5 && rs <= 22.9) {
            return "Bình thường";
        } else {
            return "Thiếu cân";
        }
    }
}
 