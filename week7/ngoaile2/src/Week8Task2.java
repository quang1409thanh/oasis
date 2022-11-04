import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Week8Task2 {
    public void nullPointerEx() throws NullPointerException {
        String test = null;
        test.toString();
    }

    /** Javadoc1. */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        double[] x = new double[2];
        double a = x[2];
    }

    /** Javadoc1. */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public void arithmeticEx() throws ArithmeticException {
        int a = 0;
        int b = 10 / a;
    }

    /** Javadoc1. */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /** Javadoc1. */
    public void fileNotFoundEx() throws FileNotFoundException {
        String url = "";
        FileReader file = new FileReader(url);
    }

    /** Javadoc1. */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    public void ioEx() throws IOException {
        throw new IOException("message");
    }

    /** Javadoc1. */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }

} 