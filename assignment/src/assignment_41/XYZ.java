package assignment_41;


public class XYZ {
    public static void main(String[] args) {
        FullTimeFaculty fullTime1 = new FullTimeFaculty(101, 50000, 2000);
        FullTimeFaculty fullTime2 = new FullTimeFaculty(102, 55000, 2500);

        PartTimeFaculty partTime1 = new PartTimeFaculty(201, 20, 30);
        PartTimeFaculty partTime2 = new PartTimeFaculty(202, 25, 35);

        // Accept input for FullTimeFaculty
        fullTime1.acceptInput();
        fullTime2.acceptInput();

        // Accept input for PartTimeFaculty
        partTime1.acceptInput();
        partTime2.acceptInput();

        // Display faculty details
        System.out.println("\nFaculty Details:");
        fullTime1.display();
        System.out.println();
        fullTime2.display();
        System.out.println();
        partTime1.display();
        System.out.println();
        partTime2.display();
    }
}
