package Collections;

public class MarksSheet {
    private int studentId;
    private String name;
    private int marks;
    public MarksSheet(int studentId, String name, int marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "MarkSheet{" + "studentId=" + studentId + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }
}
