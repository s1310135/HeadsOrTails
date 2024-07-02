import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
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
