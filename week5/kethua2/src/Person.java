
public class Person {
    private String name;
    private String address;

    /** javadoc1. */
    public Person() {
    }

    /**
     * .
     *
     * @param name    name
     * @param address address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * .
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * .
     *
     * @param name set name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * .
     *
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * .
     *
     * @param address address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** javadoc1. */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
