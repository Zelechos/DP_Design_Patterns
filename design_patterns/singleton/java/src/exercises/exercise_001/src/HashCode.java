package exercises.exercise_001.src;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HashCode {

    private static HashCode instance;
    private List<Character> alphabet;
    private List<Integer> numbers;

    private final int FLAG = 0;

    public HashCode() {

    }

    public static HashCode getInstance() {
        if (instance == null) {
            instance = new HashCode();
        }
        return instance;
    }

    public String generateHashCode() throws InterruptedException {

        StringBuilder hashCode = new StringBuilder();
        CopyOnWriteArrayList<String> hashCodeList = new CopyOnWriteArrayList<>();
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(24);
        for (int i = 0; i < 4; i++) {
            int randomIndexNumber = (int) (Math.random() * generateNumbers().size());
            int randomIndexCharacter = (int) (Math.random() * generateAlphabet().size());
            hashCodeList.add(alphabet.get(randomIndexCharacter).toString());
            hashCodeList.add(numbers.get(randomIndexNumber).toString());
        }
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        hashCodeList.forEach(hashCode::append);
        return hashCode.toString();
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
