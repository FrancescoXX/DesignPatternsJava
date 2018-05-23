package Behavioral.Template;

/**
 * Created by FrancescoXX on 23/05/2018.
 */
public class CheapLoanCalculation extends LoanCalculationAlgorithm {
    @Override
    int getBaseAmount() {
        return 100000;
    }

    @Override
    double getInterest() {
        return 2.4;
    }

    @Override
    int calculateDiscount() {
        return 5000;
    }
}
