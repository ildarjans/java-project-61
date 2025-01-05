package hexlet.code.games;

import java.util.Map;

@FunctionalInterface
public interface IGame {
    Map<String, String> getQuestionAnswerPair();
}
