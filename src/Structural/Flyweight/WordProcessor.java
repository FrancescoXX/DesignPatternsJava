package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FrancescoXX on 21/05/2018.
 */
public class WordProcessor {

    private List<Letter> letters = new ArrayList<>();

    public void addLetter(Letter letter){
        this.letters.add(letter);
    }

    public void printLetters(){
        for (Letter letter : letters) {
            System.out.print(letter.getValue());
        }
    }
}
