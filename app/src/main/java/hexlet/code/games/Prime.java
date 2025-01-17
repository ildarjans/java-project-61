package hexlet.code.games;

import java.util.Map;
import java.util.Random;

public class Prime {
    public static final String GAME_CODE = "prime";
    public static final String GAME_TITLE = "Prime";
    private static final int MIN_BOUND = 0;
    private static final int MAX_BOUND = 999;

    private static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

        boolean result = true;
        int div = 2;

        while (result && Math.pow(div, 2) <= num) {
            if (num % div == 0) {
                result = false;
            }

            div++;
        }

        return result;
    }

    public static Map<String, String> getQuestionAnswerPair() {
        int num = new Random().nextInt(MIN_BOUND, MAX_BOUND);

        return Map.of(
            "question", String.valueOf(num),
            "answer", isPrime(num) ? "yes" : "no"
        );
    }
}
