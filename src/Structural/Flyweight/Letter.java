package Structural.Flyweight;

/**
 * Created by FrancescoXX on 21/05/2018.
 */
public class Letter {

    private String value;

    public Letter(String value) {
        System.out.println("New letter created with value: " + value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
