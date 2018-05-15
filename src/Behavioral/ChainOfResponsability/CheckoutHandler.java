package Behavioral.ChainOfResponsability;

/**
 * Created by FrancescoXX on 15/05/2018.
 */
public abstract class CheckoutHandler {

    protected CheckoutHandler nextHandler;

    public abstract void handleCheckout();

    public void setNextHandler(CheckoutHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
