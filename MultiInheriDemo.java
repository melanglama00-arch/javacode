interface Father{
    void showFather();
}
interface Mother{
    void showMother();

 }
 class Child implements Father, Mother{
    public void showFather(){
        System.out.println("this is a father");
    }
    public void showMother(){
        System.out.println("This is a mother.");
    }
 }

public class MultiInheriDemo {
    public static void main(String[] args){
        Child c = new Child();
        c.showFather();
        c.showMother();
    }
    
}
