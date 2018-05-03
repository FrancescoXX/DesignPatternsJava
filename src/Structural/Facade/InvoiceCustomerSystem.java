package Structural.Facade;

/**
 * Created by FrancescoXX on 07/01/17.
 */
public class InvoiceCustomerSystem{

    public void createInvoiceForBill(Bill bill){
        System.out.println("Creating invoice for bill amount: "+bill.getAmount());
    }
}
