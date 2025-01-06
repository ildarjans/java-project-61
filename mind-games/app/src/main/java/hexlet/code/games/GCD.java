package hexlet.code.games;

import java.util.Map;
import java.util.Random;

public class GCD {
    public static final String GAME_CODE = "gcd";
    public static final String GAME_TITLE = "GCD";
    private static int gcd(int a, int b) {
        return a % b == 0 ? b : GCD.gcd(b, a % b);
    }

    public static Map<String, String> getQuestionAnswerPair() {
        int a = new Random().nextInt(1, 256);
        int b = new Random().nextInt(1, 256);

        return Map.of(
            "question", String.format("%s %s", a, b),
            "answer", String.valueOf(GCD.gcd(a, b))
        );
    }
}
