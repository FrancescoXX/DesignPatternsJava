package Behavioral.strategy;

/**
 * Created by FrancescoXX on 21/05/2018.
 */
public class Client {
    public static void main(String[] args) {

        Chess chess = new Chess();
        System.out.println("Calculate next step: " + chess.calculateNextStep());
        chess.setAlgorithm(new DifficultChessAlgorithm());
        System.out.println("Calculate next step: " + chess.calculateNextStep());

    }
}
