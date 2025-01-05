package hexlet.code.games;

import java.util.Map;
import java.util.Random;

public class Calc {
    public static final String GAME_CODE = "calc";
    public static final String GAME_TITLE = "Calc";
    private static final String[] OPERATIONS = {"*", "+", "-"};
    private static final int MIN_BOUND = 0;
    private static final int MAX_BOUND = 256;

    private static int getAnswer(String operation, int a, int b) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            default:
                throw new IllegalArgumentException("Unexpected operation: " + operation);
        }
    }

    public static Map<String, String> getQuestionAnswerPair() {
        int index = new Random().nextInt(0, OPERATIONS.length - 1);
        int a = new Random().nextInt(MIN_BOUND, MAX_BOUND);
        int b = new Random().nextInt(MIN_BOUND, MAX_BOUND);


        String operation = OPERATIONS[index];

        System.out.println("log: " + Calc.getAnswer(operation, a, b));
        System.out.println("log: " + "a: " + a + ", b: " + b);

        return Map.of(
            "question", String.format("%s %s %s", a, operation, b),
            "answer", String.valueOf(Calc.getAnswer(operation, a, b))
        );
    }
}
