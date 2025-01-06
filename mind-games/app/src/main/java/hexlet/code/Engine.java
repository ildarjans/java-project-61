package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.IGame;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Map;
import java.util.Scanner;

public class Engine {
    static final int MAX_ROUND = 3;

    private static final Map<String, String> CONDITION = Map.of(
            Even.GAME_CODE, "Answer 'yes' if the number is even, otherwise answer 'no'.",
            Calc.GAME_CODE, "What is the result of the expression?",
            GCD.GAME_CODE, "Find the greatest common divisor of given numbers.",
            Progression.GAME_CODE, "What number is missing in the progression?",
            Prime.GAME_CODE, "Answer 'yes' if given number is prime. Otherwise answer 'no'."
    );

    private static final Map<String, IGame> GAMES = Map.of(
            Even.GAME_CODE, Even::getQuestionAnswerPair,
            Calc.GAME_CODE, Calc::getQuestionAnswerPair,
            GCD.GAME_CODE, GCD::getQuestionAnswerPair,
            Progression.GAME_CODE, Progression::getQuestionAnswerPair,
            Prime.GAME_CODE, Prime::getQuestionAnswerPair
    );

    private static Map<String, String> getQuestionAnswerPair(String type) throws IllegalArgumentException {
        IGame game = GAMES.get(type);

        if (game == null) {
            throw new IllegalArgumentException("Unknown game: " + type);
        }

        return game.getQuestionAnswerPair();
    }

    private static String getCondition(String type) throws IllegalArgumentException {
        if (CONDITION.containsKey(type)) {
            return CONDITION.get(type);
        } else {
            throw new IllegalArgumentException("Invalid game type: " + type);
        }
    }

    private static boolean playRound(String type) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> questionAnswerPair = Engine.getQuestionAnswerPair(type);
        String question = questionAnswerPair.get("question");
        String correctAnswer = questionAnswerPair.get("answer");

        String condition = Engine.getCondition(type);

        Print.printCondition(condition);
        Print.printQuestion(question);
        Print.printYourAnswer();

        String answer = scanner.next().trim();

        if (answer.toLowerCase().equals(correctAnswer)) {
            Print.printCorrectAnswer();

            return true;
        }

        Print.printWrongAnswer(answer, correctAnswer);

        return false;
    }

    public static void playGame(String type) {
        String name = Greet.greeting();

        int round = 0;

        while (round < MAX_ROUND) {
            if (Engine.playRound(type)) {
                round++;
            } else {
                break;
            }
        }

        if (round == MAX_ROUND) {
            Print.printCongratulations(name);
        } else {
            Print.printLoseGame(name);
        }

    }
}
