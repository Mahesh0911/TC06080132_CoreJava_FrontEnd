package assignment_40;

class TwoBHK extends OneBHK {
    double room2Area;

    // Default constructor
    public TwoBHK() {
    }

    // Parameterized constructor
    public TwoBHK(double roomArea, double hallArea, double price, double room2Area) {
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    // Method to print all data member information
    @Override
    public void show() {
        super.show();
        System.out.println("TwoBHK Details:");
        System.out.println("Second Room Area: " + room2Area + " sq. units");
    }
}
