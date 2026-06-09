class Example {
    String name;
    int id;

    Example() {
        this("texas");
        System.out.println("default constructor");
    }

    Example(String name) {
        this("milan", 111);
        System.out.println("name" + name);
    }

    Example(String name, int id) {
        System.out.println("name:" + name + "" + "id" + id);
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        new Example();
    }
}