package Collections;

import java.util.Objects;

public class ListToSets {
    private int id;
    private String name;
    public ListToSets(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListToSets)) return false;
        ListToSets that = (ListToSets) o;
        return id == that.id && Objects.equals(name, that.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public String toString() {
        return "ListToSets{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

