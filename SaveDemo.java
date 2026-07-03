//abstract class
abstract class Shape{
    abstract double calculateArea();
}

//circle area
class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        return Math.PI *  radius * radius;

    }
}
//Rectangle class
class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width)
}

public class SaveDemo {
    
}
