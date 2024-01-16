public class pattern {
    public static void main(String[] args) {
        int limit = 10;

        // pattern 1 : printing "*" pattern
        for (int i = 0; i < limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // pattern 2 : printing number pattern
        for (int i = 0; i < limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}