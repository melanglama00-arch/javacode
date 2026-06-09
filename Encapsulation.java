class Animal {

    // Private data members
    private String name;
    private int age;

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Animal a = new Animal();

        a.setName("Dog");
        a.setAge(5);

        System.out.println("Name: " + a.getName());
        System.out.println("Age: " + a.getAge());
    }
}