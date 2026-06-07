class Student {
    String name = "Milan";

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating an object
        Student s = new Student();

        // Calling method using the object
        s.display();
    }
}
