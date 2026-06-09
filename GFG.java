class Geeks {
    String name;
    int id;

    // Parameterized constructor
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy constructor
    Geeks(Geeks g) {
        this.name = g.name;
        this.id = g.id;
    }

    // Method to display
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class GFG {
    public static void main(String[] args) {

        // Creating first object
        Geeks g1 = new Geeks("Milan", 115);

        // Creating second object using copy constructor
        Geeks g2 = new Geeks(g1);

        System.out.println("parameterized constructor output:");
        g1.display();

        System.out.println("\ncopy constructor output:");
        g2.display();
    }
}