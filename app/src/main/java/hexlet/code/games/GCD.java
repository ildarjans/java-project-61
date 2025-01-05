package hexlet.code.games;

import java.util.Map;
import java.util.Random;

public class GCD {
    public static final String GAME_CODE = "gcd";
    public static final String GAME_TITLE = "GCD";
    private static final int MIN_BOUND = 1;
    private static final int MAX_BOUND = 256;

    private static int gcd(int a, int b) {
        return a % b == 0 ? b : GCD.gcd(b, a % b);
    }

    public static Map<String, String> getQuestionAnswerPair() {
        int a = new Random().nextInt(MIN_BOUND, MAX_BOUND);
        int b = new Random().nextInt(MIN_BOUND, MAX_BOUND);

        return Map.of(
            "question", String.format("%s %s", a, b),
            "answer", String.valueOf(GCD.gcd(a, b))
        );
    }
}
