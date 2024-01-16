package assignment_q_42;

class SchoolStudent extends Student {
    String className;

    // Default constructor
    public SchoolStudent() {
        className = "";
    }

    // Parameterized constructor
    public SchoolStudent(int rollno, double percentage, String className) {
        super(rollno, percentage);
        this.className = className;
    }

    // Override show method
    @Override
    public void show() {
        super.show();
        System.out.println("Class: " + className);
    }
}
