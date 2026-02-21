public class CreditCardPayment extends User implements PaymentMethod {

    @Override
    public void pay(double amount){
        System.out.println(amount-10);

    }


    
}
