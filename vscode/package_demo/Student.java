package package_demo;

public class Student {
    private int id;
    public String name;
    public int marks;

    public Student() {
        id = 101;
        name = "abc";
        marks = 10;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
