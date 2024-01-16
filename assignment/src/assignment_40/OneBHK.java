package assignment_40;

class OneBHK {
    double roomArea;
    double hallArea;
    double price;

    // Default constructor
    public OneBHK() {
    }

    // Parameterized constructor
    public OneBHK(double roomArea, double hallArea, double price) {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }

    // Method to print OneBHK data member information
    public void show() {
        System.out.println("OneBHK Details:");
        System.out.println("Room Area: " + roomArea + " sq. units");
        System.out.println("Hall Area: " + hallArea + " sq. units");
        System.out.println("Price: $" + price);
    }
}


