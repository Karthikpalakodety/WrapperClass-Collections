package Collections;

public class StudentsGradeGroup {
    private String name;
    private String grade;

    public StudentsGradeGroup(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "StudentGradeGroup{name='" + name + "', grade='" + grade + "'}";
    }
}
