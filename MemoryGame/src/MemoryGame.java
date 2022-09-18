import java.util.Scanner;

public class MemoryGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Try to remember the following numbers. The numbers will be shown for 4 seconds.");

        int[] numbers = new int[]{5, 1, 1, 3, 4, 5, 1};
        int[] answers = new int[7];
        int guesses = 0;

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        try {
            Thread.sleep(4000);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }

        System.out.println("");

        for (int i = 0; i < 20; i++) System.out.println(" ");


        for (int i = 0; i < answers.length; i++) {

            System.out.println("Type number " + (i + 1) + ":");
            int answer = scanner.nextInt();

            answers[i] = answer;

            if (answers[i] == numbers[i]) {

                guesses++;

            }

        }


        System.out.println("The numbers were: ");

        for (int number : numbers) {

            System.out.print(number + " ");

        }

        System.out.println(" ");

        System.out.println("Your numbers were: ");

        for (int answer : answers) {

            System.out.print(answer + " ");

        }

        System.out.println(" ");

        System.out.print("You guessed right " + guesses + " numbers.");

    }


}


