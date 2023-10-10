package lalu_Random_Number;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;  // Minimum number in the range
        int maxRange = 100; // Maximum number in the range
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;

        System.out.println("Welcome to the Number Game!");
        System.out.println("I have selected a random number between " + minRange + " and " + maxRange + ".");
        System.out.println("Can you guess it?");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < minRange || userGuess > maxRange) {
                System.out.println("Please enter a number within the valid range.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
