public class Numeral extends Expression {

    private double value;

    public Numeral() {
    }

    public Numeral(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (value == (int) value) {
            return String.valueOf((int) value);
        }
        return String.valueOf(value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}
