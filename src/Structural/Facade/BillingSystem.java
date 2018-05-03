package Structural.Facade;

/**
 * Created by FrancescoXX on 07/01/17.
 */
public class BillingSystem {

    public Bill createBill(Integer amount){

        //advanced logic
        return new Bill(amount);
    }
}
