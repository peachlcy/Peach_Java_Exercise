import java.util.Scanner;
import java.util.Random;

public class e5_29 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        int a = numbers();
        int b = numbers();
        System.out.println("You rolled " + a + " + " + b + " = " + (a + b));
        if (a + b == 2 || a + b == 3 || a + b == 12)
            System.out.println("You lose");
        else if (a + b == 7 || a + b == 11)
            System.out.println("You win");
        else {
            while (a > 0) {
                int c = numbers();
                int d = numbers();
                if (c == 7) {
                    System.out.println("You rolled " + c + " + " + d + " = " + (c + d));
                    System.out.println("You lose");
                    break;
                }
                if (c + d == a + b) {
                    System.out.println("You rolled " + c + " + " + d + " = " + (c + d));
                    System.out.println("You win");
                    break;
                }
            }
        }

    }

    public static int numbers() {
        Random rand = new Random();
        int x = rand.nextInt(6) + 1;
        return x;
    }
}