import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;

        //System.out.println("Random number is " + randomNumber);
        int tryCount = 0;
        while (true) {

            System.out.println("Enter your guess (1-100):");

            Scanner scanner = new Scanner(System.in);

            int playerGuess = scanner.nextInt();

            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct!");
                System.out.println("It took you " + tryCount + "tries");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("No! The number is higher!");
            } else {
                System.out.println("No! The number is lower!");
            }

        }
    }
}
