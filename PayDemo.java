//Interface

interface Payment {
    void pay(double amount);
}

//Credit card payment class
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " made using credit card: " );
    }
}

//UPI Payment class
class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of  Rs. " + amount + " made using UPI.");
    }
}


//main class
public class PayDemo {
    public static void main(String[] args){

        Payment Payment1 = new CreditCardPayment();
        Payment payment2 = new UPIPayment();

        Payment1.pay(5000);
        payment2.pay(2500);
    }
    
}
