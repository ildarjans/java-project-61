package hexlet.code.games;

import java.util.Map;
import java.util.Random;

public class Progression {
    public static final String GAME_CODE = "progression";
    public static final String GAME_TITLE = "Progression";

    public static Map<String, String> getQuestionAnswerPair() {
        int len = new Random().nextInt(5, 12);
        int step = new Random().nextInt(2, 5);
        int first = new Random().nextInt(1, 100);
        int hidden = new Random().nextInt(0, len - 1);

        String[] progression = new String[len];

        for (int i = 0; i < len; i++) {
            int current = first + (i * step);

            progression[i] = String.valueOf(current);
        }

        String answer = progression[hidden];

        progression[hidden] = "..";

        return Map.of(
            "question", String.join(" ", progression),
            "answer", answer
        );
    }
}
