package Behavioral.ChainOfResponsability;

/**
 * Created by FrancescoXX on 15/05/2018.
 */
public class PaymentCheckoutHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("Handling Payment of the customer...");

        if (nextHandler !=  null){
            nextHandler.handleCheckout();
        }
    }
}
