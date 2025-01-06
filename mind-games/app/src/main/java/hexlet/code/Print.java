package hexlet.code;


public class Print {
    public static void printCondition(String condition) {
        System.out.println(condition);
    }

    public static void printQuestion(String question) {
        System.out.println("question: " + question);
    }

    public static void printYourAnswer() {
        System.out.print("Your answer: ");
    }

    public static void printCorrectAnswer() {
        System.out.println("Correct!");
    }

    public static void printWrongAnswer(String wrongAnswer, String correctAnswer) {
        String template = "'%s' is wrong answer ;(. Correct answer was '%s'.";
        System.out.println(String.format(template, wrongAnswer, correctAnswer));
    }

    public static void printLoseGame(String name) {
        System.out.println("Let's try again, " + name + "!");

    }

    public static void printCongratulations(String name) {
        System.out.println("Congratulations, " + name + "!");
    }
}
