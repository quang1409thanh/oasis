public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * .
     *
     * @param name    name
     * @param address address
     * @param school  school
     * @param pay     pay]
     */
    public Staff(String name, String address, String school, double pay) {
        setName(name);
        setAddress(address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * .
     *
     * @return school
     */
    public String getSchool() {
        return school;
    }

    /**
     * .
     *
     * @param school school
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * .
     *
     * @return pay
     */
    public double getPay() {
        return pay;
    }

    /**
     * .
     *
     * @param pay pay
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /* javadoc1. */
    @Override
    public String toString() {
        String rs = "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
        return rs;
    }
}
