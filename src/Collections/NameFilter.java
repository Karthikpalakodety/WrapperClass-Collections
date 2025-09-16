package Collections;

public class NameFilter {
    private String name;
    private int marks;
    public NameFilter(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
        public String getName() {
            return name;
        }
        @Override
        public String toString() {
            return "NameFilter{name='" + name + "', marks=" + marks + "}";
        }
    }


