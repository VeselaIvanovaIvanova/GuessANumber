import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int computerNum = randomNumber.nextInt(100);
        int inputNum = 0;
        boolean isValid = true;
        while (true) {
            System.out.print("Guess A Number (1-100): ");
            String input = scanner.nextLine();
            for (int i = 0; i < input.length(); i++) {
                char firstChar = input.charAt(i);
                if (firstChar < 48 || firstChar > 57) {
                    System.out.println("Invalid input.");
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                inputNum = Integer.parseInt(input);
                if (computerNum > inputNum) {
                    System.out.println("Too Low");
                } else if (computerNum < inputNum) {
                    System.out.println("Too High");
                } else if (computerNum == inputNum) {
                    System.out.println("You guessed it!");
                    break;
                }

            }
            isValid = true;
        }
    }
}
