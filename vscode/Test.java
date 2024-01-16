
import java.util.Scanner;
import package_demo.Student;

public class Test {
    public static void main(String[] args) {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id :");

        int id1 = sc.nextInt();
        st.setId(id1);

        st.name = "abc";
        st.marks = 40;
        System.out.println(st.getId() + " " + st.name + " " + st.marks);
        sc.close();
    }
}
