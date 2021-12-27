import java.util.Scanner;

public class e4_17 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();
        String blank = " ";
        for (int k = 1; k <= lines; k++) {
            if (k == 1) {
                for (int b = 1; b < lines; b++)
                    System.out.print("    ");
                System.out.printf("%4d", k);
                System.out.print("\n");
            } else {
                for (int d = lines - k; d >= 1; d--)
                        System.out.print("    ");
                for (int i = k; i >= 1; i--)
                    System.out.printf("%4d", i);
                for (int j = 2; j <= k; j++)
                    System.out.printf("%4d", j);
                System.out.print("\n");
            }
        }
    }
}




