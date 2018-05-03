package Structural.Facade;

/**
 * Created by FrancescoXX on 07/01/17.
 */
public class Client {
    public static void main(String[] args) {

        BillingSystem billingSystem = new BillingSystem();
        InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();
        FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade();
        financialSystemFacade.setBillingSystem(billingSystem);
        financialSystemFacade.setInvoiceCustomerSystem(invoiceCustomerSystem);

        financialSystemFacade.createInvoice(1000);
    }
}
