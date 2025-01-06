package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("May I have your name?");

        String name = scanner.next().trim();

        System.out.println("Hello, " + name + "!");

        return name;
    }
}
