package Behavioral.Template;

/**
 * Created by FrancescoXX on 23/05/2018.
 */
public class Client {

    public static void main(String[] args) {
        LoanCalculationAlgorithm loanCalculationAlgorithm = new ExpensiveLoanCalculation();
        System.out.println(loanCalculationAlgorithm.calculateLoan());

        loanCalculationAlgorithm = new CheapLoanCalculation();
        System.out.println(loanCalculationAlgorithm.calculateLoan());

    }
}
