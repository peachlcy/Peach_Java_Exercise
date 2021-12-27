import java.util.Arrays;
import java.util.Scanner;


public class e7_9 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        int r = 0;
        int c = 0;
        int[][] checkerboard = new int[3][3];
        print(checkerboard);
        while (1 > 0) {
            System.out.print("Enter a row (1, 2, or 3) for player X : ");
            r = input.nextInt();
            System.out.print("Enter a column (1, 2, or 3) for player X : ");
            c = input.nextInt();
            play(checkerboard, r, c, 1);
            print(checkerboard);
            if (!win(checkerboard))
                break;
            System.out.print("Enter a row (1, 2, or 3) for player O : ");
            r = input.nextInt();
            System.out.print("Enter a column (1, 2, or 3) for player O : ");
            c = input.nextInt();
            play(checkerboard, r, c, 2);
            print(checkerboard);
            if (!win(checkerboard))
                break;
        }
    }

    public static void play(int[][] checkerboard, int r, int c, int palyer) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (palyer == 1)
                    checkerboard[r][c] = 1;
                if (palyer == 2)
                    checkerboard[r][c] = 2;
            }
        }
    }

    public static void print(int[][] checkerboard) {
        for (int i = 0; i < 3; i++) {
            System.out.print("-------------\n");
            for (int j = 0; j < 3; j++) {
                if (checkerboard[i][j] == 1)
                    System.out.print("| X ");
                else if (checkerboard[i][j] == 2)
                    System.out.print("| O ");
                else
                    System.out.print("|   ");
            }
            System.out.print("|");
            System.out.println(" ");
        }
        System.out.println("-------------");
    }

    public static boolean win(int[][] checkerboard) {
        int[] a = {1, 1, 1};
        int[] b = {2, 2, 2};
        int[] b1 = new int[3];
        int[] b2 = new int[3];
        int[] b3 = new int[3];
        int[] c1 = new int[3];
        int[] c2 = new int[3];
        int[] c3 = new int[3];
        int[] d1 = new int[3];
        int[] d2 = new int[3];
        for (int i = 0; i < 3; i++) {
            b1[i] = checkerboard[0][i];
            b2[i] = checkerboard[1][i];
            b3[i] = checkerboard[2][i];
            c1[i] = checkerboard[i][0];
            c2[i] = checkerboard[i][1];
            c3[i] = checkerboard[i][2];
            for (int j = 0; j < 3; j++) {
                if (i == j)
                    d1[i] = checkerboard[i][j];
                if (i == 2 - j)
                    d2[i] = checkerboard[i][j];
            }
        }
        if (Arrays.equals(b1, a) || Arrays.equals(b2, a) || Arrays.equals(b3, a) || Arrays.equals(c1, a) || Arrays.equals(c2, a)
                || Arrays.equals(c3, a) || Arrays.equals(d1, a) || Arrays.equals(d2, a)) {
            System.out.print("X player won");
            return false;
        } else if ((Arrays.equals(b1, b) || Arrays.equals(b2, b) || Arrays.equals(b3, b) || Arrays.equals(c1, b) || Arrays.equals(c2, b)
                || Arrays.equals(c3, b) || Arrays.equals(d1, b) || Arrays.equals(d2, b))) {
            System.out.print("O player won");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (b1[i]==0||b2[i]==0||b3[i]==0)
                return true;
        }
        System.out.print("It is a draw");
         return false;
    }
}