public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai bao cac phuong thuc getter, setter cho Student
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String getInfo() {
        // TODO:
        String result = "";
        result += name + " - " + id + " - " + group + " - " + email;
        return result;
    }

    /**
     * .
     * Constructor 1
     */
    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * .
     * Constructor 2
     *
     * @param n   name
     * @param sid id
     * @param em  email
     */
    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /**
     * .
     * Constructor 3
     *
     * @param s s
     */

    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

}