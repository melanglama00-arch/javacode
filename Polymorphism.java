class Animal{

    //compile-time polymorphism (method overloading)
    void sound(){
        System.out.println("animal makes sound");
    }
    void sound(String name){
        System.out.println(name + "makes a sound");
    }
}

class Dog extends Animal {
    //Run-time polymorphism (method overriding)
    @Override
    void sound(){
        System.out.println("dogs barks");
    }
}

public class Polymorphism {
    public static void main(String[] arg){
        //compile-time polymorphosm
        Animal a = new Animal();
        a.sound();
        a.sound("cat");

        //Run-time polymorphism
        Animal d = new Dog();
        d.sound();
    }
    
}
