package control_statments;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int number, guess;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number");

        number = (int) ((Math.random() * 100) + 1);

        do {
            System.out.println("Enter the number");
            guess = scanner.nextInt();

            if (number > guess) {
                System.out.println("number is high");
            } else if (number < guess) {
                System.out.println("number is low");
            } else {
                System.out.println("You guessing correct...");
            }
        } while (number != guess);
    }
}
