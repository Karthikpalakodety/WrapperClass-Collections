package Collections;

public class PassingStudents {
    private String name;
    private int marks;
    public PassingStudents(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    @Override
    public String toString() {
        return "PassingStudents{" + "name='" + name + '\'' + ", marks=" + marks + '}';
    }
}

