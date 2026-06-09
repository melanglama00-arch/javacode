class Base {
    String name;
    int id;

    // Default constructor
    Base() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Base(String name, int id) {
        this.name = name;
        this.id = id;

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class SuperCon extends Base {

    // Default constructor
    SuperCon() {
        this("ram", 123);
        System.out.println("Derived class constructor called");
    }

    // Parameterized constructor
    SuperCon(String name, int id) {
        super(name, id);
    }

    public static void main(String[] args) {

        SuperCon sc = new SuperCon();

        // Display object details
        sc.display();
    }
}