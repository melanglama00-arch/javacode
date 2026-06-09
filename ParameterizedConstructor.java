class Student{
    String name;
    int id;
    //parameterized constructor
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    //method
    void display(){
        System.out.println("name: " + name + "id: " +id);
    }
}

public class ParameterizedConstructor {
    
    public static void main(String[] args){
        Student s1= new Student("milan", 115);
        s1.display();
    
    }
}
