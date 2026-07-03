//parent class
class Bank{
    public double interestRate(){
        return 0.0;
    }
}

//child class 1
class SBI extends Bank{
    @Override 
    public double interestRate(){
        return 7.5;
    }
}

//child class 2
class NabilBank extends Bank{
    @Override 
    public double interestRate(){
        return 8.0;
    }
}

public class BankDemo {
    public static void main(String[] args){
        Bank b1 = new SBI();
        Bank b2 = new NabilBank();

        System.out.println("SBI Interst Rate: " + b1.interestRate() + "%");
         System.out.println("NabilBank INterst Rate: " + b2.interestRate() + "%");
}
    }
