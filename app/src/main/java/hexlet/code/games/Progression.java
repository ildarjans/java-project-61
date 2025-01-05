package hexlet.code.games;

import java.util.Map;
import java.util.Random;

public class Progression {
    public static final String GAME_CODE = "progression";
    public static final String GAME_TITLE = "Progression";
    private static final int MIN_LEN = 5;
    private static final int MIN_STEP = 3;
    private static final int MAX_LEN = 12;
    private static final int MAX_STEP = 99;
    private static final int FIRST_NUM_IN_PROGRESSION = 1;
    private static final int MAX_NUM_IN_PROGRESSION = 1000;
    private static final int BOUND_OF_FIRST_HIDDEN_INDEX = 0;


    public static Map<String, String> getQuestionAnswerPair() {
        int len = new Random().nextInt(MIN_LEN, MAX_LEN);
        int step = new Random().nextInt(MIN_STEP, MAX_STEP);
        int first = new Random().nextInt(FIRST_NUM_IN_PROGRESSION, MAX_NUM_IN_PROGRESSION);
        int hidden = new Random().nextInt(BOUND_OF_FIRST_HIDDEN_INDEX, len - 1);

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
