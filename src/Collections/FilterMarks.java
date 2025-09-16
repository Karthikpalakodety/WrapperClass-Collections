package Collections;

public class FilterMarks {
    private String name;
    private int marks;
    public FilterMarks(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "FilterMarks{" + "name='" + name + '\'' + ", marks=" + marks + '}';
    }
}
