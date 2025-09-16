package Collections;

import java.util.Objects;

public class StudentById {
    private int id;
    private String name;

    public StudentById(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "StudentById{id=" + id + ", name='" + name + "'}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentById)) return false;
        StudentById that = (StudentById) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
