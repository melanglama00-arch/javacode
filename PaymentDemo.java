interface Payment{
    void makePayment(double amount);
}
class CreditCard implements Payment{
    @Override
    public void makePayment(double amount){
        System.out.println("Payment of $ " + amount + " made using Credit Card");
    }
}
class UPI implements Payment{
    @Override
    public void makePayment(double amount){
        System.out.println("Payment of $ " + amount + " made using the UPI");
    }
}


public class PaymentDemo {
    public static void main(String args[]){
        Payment creditCard = new CreditCard();
        Payment upi = new UPI();

        creditCard.makePayment(100.0);
        upi.makePayment(2000);
    }
    
}
