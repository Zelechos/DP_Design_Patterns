package exercises.exercise_001.src;

import java.util.ArrayList;
import java.util.List;

public class HashCode {

    private static HashCode instance;
    private List<Character> alphabet;
    private List<Integer> numbers;

    public HashCode() {

    }

    public static HashCode getInstance() {
        if (instance == null) {
            instance = new HashCode();
        }
        return instance;
    }

    public String generateHashCode() {
        int randomNumber = (int) (Math.random() * generateAlphabet().size());
        return alphabet.get(randomNumber).toString();
    }

    private List<Character> generateAlphabet() {
        alphabet = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        return alphabet;
    }

    private List<Integer> generateNumbers() {
        numbers = new ArrayList<>();
        for (int n = 0; n <= 9; n++) {
            numbers.add(n);
        }
        return numbers;
    }
}
