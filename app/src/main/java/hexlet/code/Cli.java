package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Map;
import java.util.Scanner;

public class Cli {
    private static final Map<String, String> GAME_CODE = Map.of(
            "2", Even.GAME_CODE,
            "3", Calc.GAME_CODE,
            "4", GCD.GAME_CODE,
            "5", Progression.GAME_CODE,
            "6", Prime.GAME_CODE
    );

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - " + Even.GAME_TITLE);
        System.out.println("3 - " + Calc.GAME_TITLE);
        System.out.println("4 - " + GCD.GAME_TITLE);
        System.out.println("5 - " + Progression.GAME_TITLE);
        System.out.println("6 - " + Prime.GAME_TITLE);
        System.out.println("0 - Exit");

        while (true) {
            System.out.print("Your choice: ");
            String value = scanner.next().trim();

            switch (value) {
                case "0":
                    break;
                case "1":
                    Greet.greeting();
                    break;
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                    Engine.playGame(GAME_CODE.get(value));
                    break;
                default:
                    continue;
            }
            scanner.close();
            break;
        }
    }
}

