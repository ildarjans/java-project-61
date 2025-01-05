package hexlet.code.games;

import java.util.Map;
import java.util.Random;

public class Even {
    private static final int MIN_BOUND = 0;
    private static final int MAX_BOUND = 256;

    public static final String GAME_CODE = "even";
    public static final String GAME_TITLE = "Even";
    public static Map<String, String> getQuestionAnswerPair() {
        int number = new Random().nextInt(MIN_BOUND, MAX_BOUND);

        return Map.of(
            "question", String.valueOf(number),
            "answer", number % 2 == 0 ? "yes" : "no"
        );
    }
}
