package hexlet.code.games;

import java.util.Map;
import java.util.Random;

public class Even {
    public static final String GAME_CODE = "even";
    public static final String GAME_TITLE = "Even";
    public static Map<String, String> getQuestionAnswerPair() {
        int number = new Random().nextInt(0, 256);

        return Map.of(
            "question", String.valueOf(number),
            "answer", number % 2 == 0 ? "yes" : "no"
        );
    }
}
