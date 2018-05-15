package Behavioral.ChainOfResponsability;

/**
 * Created by FrancescoXX on 15/05/2018.
 */
public class CustomerInfoCheckoutHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("Adding extra info to checkout of the customer");

        if (nextHandler !=  null){
            nextHandler.handleCheckout();
        }
    }
}
