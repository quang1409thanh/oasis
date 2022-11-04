public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop
    // Student (max. 100)
    Student[] students = new Student[100];
    int count = 0;

    /**
     * .
     * same group
     */
    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        }
        return false;
    }

    /**
     * .
     * addStudent
     */
    public void addStudent(Student newStudent) {
        // TODO:
        students[count] = newStudent;
        count++;
    }

    /**
     * .
     * studentsByGroup
     */
    public String studentsByGroup() {
        // TODO:
        String rs = "";
        for (int i = 0; i < count; i++) {
            Boolean check = true;
            for (int j = 0; j < i; j++) {
                if (students[j].getGroup().equals(students[i].getGroup())) {
                    check = false;
                }
            }
            if (check) {
                rs = rs + students[i].getGroup() + '\n';
                for (int k = 0; k < count; k++) {
                    if (students[k].getGroup().equals(students[i].getGroup())) {
                        rs = rs + students[k].getInfo() + '\n';
                    }
                }
            }
        }
        return rs;
    }

    /**
     * .
     * removeStudent
     */
    public void removeStudent(String id) {
        // TODO:
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count] = null;
                count = count - 1;
            }
        }
    }

}