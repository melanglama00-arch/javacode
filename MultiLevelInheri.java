
//parent class
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
//child class
class Dog extends Animal{
    void barks(){
        System.out.println("The dog is barking");
    }

}
//grandchild
class Puppy extends Dog{
    void weep(){
        System.out.println("Puppy is weeping");
    }
}
//main class
public class MultiLevelInheri {
public static void main(String[] args){
    Puppy p = new Puppy();
    p.eat();//inherit from Animal class
    p.barks();//inherit from dog class
    p.weep();//defining its class method
    
}

}
