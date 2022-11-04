public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * .
     *
     * @param name    name
     * @param address address
     * @param program program
     * @param year    year
     * @param fee     fee
     */
    public Student(String name, String address, String program, int year, double fee) {
        setName(name);
        setAddress(address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * .
     *
     * @return program
     */
    public String getProgram() {
        return program;
    }

    /**
     * .
     *
     * @param program setprogram
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * .
     *
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * .
     *
     * @param year setyear
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * .
     *
     * @return fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * .
     *
     * @param fee setfee
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /** javadoc1. */
    @Override
    public String toString() {
        String rs1 = "Student[" + super.toString();
        String rs2 = ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
        String rs = rs1 + rs2;
        return rs;
    }
}
