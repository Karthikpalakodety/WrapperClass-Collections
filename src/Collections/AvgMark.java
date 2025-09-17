package Collections;

import java.util.HashMap;
import java.util.Map;

public class AvgMark {
    private Map<Integer, Integer> studentMarks;
    public AvgMark() {
        studentMarks = new HashMap<>();
    }
    public void addMark(int studentId, int marks) {
        studentMarks.put(studentId, marks);
    }
    public double getAverageMarks() {
        return studentMarks
                .values()
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}
