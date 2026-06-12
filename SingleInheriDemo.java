//parent class
class Person{
    String name;
    int age;

    //constructor
    Person(String name, int age){
    this.name = name;
    this.age = age;
    }
    //method to display the details
    void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

    //child class
    class Student extends Person{
         int rollNo;
        //constructor
        Student(String name, int age, int rollNo){
            super(name, age);
            this.rollNo = rollNo;
        }
        //method to display student details
        void displayStudent(){
            displayPerson();//inherit method
            System.out.println("rollNo: " + rollNo);
        }
       
    }


public class SingleInheriDemo {
    public static void main(String[] args){
        Student s1 = new Student("milan", 20, 1125);
        System.out.println("students details");
        s1.displayStudent();

    }
    
}
