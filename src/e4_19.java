import java.util.Scanner;

public class e4_19 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();
        for (int k = 1; k <= lines; k++) {
            if (k == 1) {
                for (int b = 1; b < lines; b++)
                    System.out.print("     ");
                System.out.printf("%5d", k);
                System.out.print("\n");
            } else {
                for (int d = lines - k; d >= 1; d--)
                    System.out.print("     ");
                for (int j = 0; j <= k - 1; j++)
                    System.out.printf("%5.0f", Math.pow(2, j));
                for (int i = k - 2; i >= 0; i--)
                    System.out.printf("%5.0f", Math.pow(2, i));
                System.out.print("\n");
            }
        }
    }
}

