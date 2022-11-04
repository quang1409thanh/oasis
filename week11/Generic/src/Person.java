public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    /**
     * .
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * .
     */
    public static int checkP(Person p1, Person p2) {
        if (p1.name.compareTo(p2.name) < 0
                || (p1.name.compareTo(p2.name) == 0
                && p1.age < p2.age)) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
