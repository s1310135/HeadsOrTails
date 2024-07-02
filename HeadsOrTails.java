import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you?");
        System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        Random random = new Random();
        int heads = 0;
        int tails = 0;

        System.out.println("Tossing a coin...");

        for (int round = 1; round <= 3; round++) {
            if (random.nextBoolean()) {
                heads++;
                System.out.println("Round " + round + ": Heads");
            } else {
                tails++;
                System.out.println("Round " + round + ": Tails");
            }
        }

        System.out.println("Heads: " + heads + ", Tails: " + tails);
    }
}
