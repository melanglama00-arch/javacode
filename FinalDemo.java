//final class
final class Utility {
    public static int square(int num){
        return num * num;
    }
    public static int cube(int num){
        return num * num* num;

    }
}
//parent class
class Bank {
    //Final Method
    public final double calInt(double amount){
        return amount * 0.08; //8% interst

    }
}
//child class

class SBI extends Bank{
    /*Compiler Error: cannot override final method
    @override
    public double calInt(double amount){
    return amount *0.08} */
}

public class FinalDemo {
    public static void main(String[] args){
        final double PI = 3.14159;
        double radius = 7;
        double area = PI * radius * radius;
        System.out.println("Radius = " + radius);
        System.out.println("Area of circle = "+ area);
        SBI sbi = new SBI();
        double amount = 10000;
        double intrest = sbi.calInt(amount);
        System.out.println("\nAmount = " + amount);
        System.out.println("Interst = "+ intrest);
        int num = 5;
        System.out.println("\nsquare of " + num + "=" + Utility.square(num));
        System.out.println("\ncube of " + num + "=" + Utility.cube(num));
    }
    
}
