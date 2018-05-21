package Behavioral.strategy;

/**
 * Created by FrancescoXX on 21/05/2018.
 */
public class Chess {

    private ChessAlgorithm algorithm = new EasyChessAlgorithm();

    public int calculateNextStep(){
        return algorithm.calculateNextStep();
    }

    public void setAlgorithm(ChessAlgorithm algorithm) {
        this.algorithm = algorithm;
    }
}
