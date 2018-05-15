package Behavioral.ChainOfResponsability;

/**
 * Created by FrancescoXX on 15/05/2018.
 */
public class Client {

    public static void main(String[] args) {

        PaymentCheckoutHandler handler = new PaymentCheckoutHandler();
        CustomerInfoCheckoutHandler customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();

        handler.setNextHandler(customerInfoCheckoutHandler);

        handler.handleCheckout();
    }
}
