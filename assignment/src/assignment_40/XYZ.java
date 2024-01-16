package assignment_40;


public class XYZ {
    public static void main(String[] args) {
        TwoBHK flat1 = new TwoBHK(120, 150, 50000, 100);
        TwoBHK flat2 = new TwoBHK(110, 140, 45000, 90);
        TwoBHK flat3 = new TwoBHK(130, 160, 55000, 110);

        // Print flat information using the show method
        flat1.show();
        System.out.println();
        flat2.show();
        System.out.println();
        flat3.show();

        // Print total amount of all flats
        double totalAmount = flat1.price + flat2.price + flat3.price;
        System.out.println("\nTotal Amount of all flats: $" + totalAmount);
    }
}