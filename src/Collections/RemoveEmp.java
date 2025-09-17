package Collections;

public class RemoveEmp {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public RemoveEmp(String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "RemoveEmp{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
