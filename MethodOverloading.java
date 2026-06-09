
class Student {

    // Method with one parameter
    void display(String name) {
        System.out.println("Student Name: " + name);
    }

    // Overloaded method with two parameters
    void display(String name, int id) {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        Student s = new Student();

        s.display("Milan");
        System.out.println();

        s.display("Milan", 115);
    }
}
