package Structural.Facade;

/**
 * Created by FrancescoXX on 07/01/17.
 */
public class FinancialSystemFacade {

    //requires all reference of all subsystems
    //its part of the system so knows its complexity

    private BillingSystem billingSystem;
    private InvoiceCustomerSystem invoiceCustomerSystem;

    public void createInvoice(Integer amount){

        Bill bill = billingSystem.createBill(amount);
        invoiceCustomerSystem.createInvoiceForBill(bill);
    }

    public void setBillingSystem(BillingSystem billingSystem) {
        this.billingSystem = billingSystem;
    }

    public void setInvoiceCustomerSystem(InvoiceCustomerSystem invoiceCustomerSystem) {
        this.invoiceCustomerSystem = invoiceCustomerSystem;
    }
}
