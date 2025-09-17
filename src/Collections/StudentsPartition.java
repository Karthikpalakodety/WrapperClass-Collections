package Collections;

import java.util.*;
import java.util.stream.Collectors;

class Partition {
    private int id;
    private String name;
    private int marks;

    public Partition(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String toString() {
        return id + " -- " + name + " - Marks : " + marks;
    }
}

public class StudentsPartition {
    private List<Partition> students;

    public StudentsPartition() {
        students = new ArrayList<>();
    }

    public void addPartition(Partition s) {
        students.add(s);
    }
    public Map<Boolean, List<Partition>> partitionByPass(int passMark) {
        return students.stream()
                .collect(Collectors.partitioningBy(s -> s.getMarks() >= passMark));
    }
}
