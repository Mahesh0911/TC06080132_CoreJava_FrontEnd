package assignment;
public class Person {
    private String name;
    private int age;

    // Default constructor with age set to 18
    public Person() {
        this.age = 18;
    }

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a person with default age
        Person person1 = new Person();
        person1.name = "John"; // You can also set the name directly
        person1.displayInfo();

        // Creating a person with custom name and age
        Person person2 = new Person("Alice", 25);
        person2.displayInfo();
    }
}
