package Behavioral.Template;

/**
 * Created by FrancescoXX on 23/05/2018.
 */
public abstract class LoanCalculationAlgorithm {

    public int calculateLoan() {
        return (int) (getBaseAmount() * getInterest() - calculateDiscount());
    }

    abstract double getInterest();

    abstract int getBaseAmount();

    abstract int calculateDiscount();
}
