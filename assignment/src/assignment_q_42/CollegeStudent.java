package assignment_q_42;

class CollegeStudent extends Student {
    int semester;

    // Default constructor
    public CollegeStudent() {
        semester = 0;
    }

    // Parameterized constructor
    public CollegeStudent(int rollno, double percentage, int semester) {
        super(rollno, percentage);
        this.semester = semester;
    }

    // Override show method
    @Override
    public void show() {
        super.show();
        System.out.println("Semester: " + semester);
    }
}
