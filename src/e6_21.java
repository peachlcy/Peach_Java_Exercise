import java.util.Arrays;
import java.util.Scanner;


public class e6_21 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfDrop = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlot = input.nextInt();
        int[][] path = new int[numberOfDrop][numberOfSlot];
        for (int i = 0; i < numberOfDrop; i++) {
            path[i] = num(numberOfSlot);
        }
        for (int i = 0; i < numberOfDrop; i++) {
            for (int j = 0; j < numberOfSlot; j++) {
                if (path[i][j] == 1)
                    System.out.print("L");
                else
                    System.out.print("R");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        picture(path, numberOfDrop, numberOfSlot);

    }

    public static int[] num(int slots) {
        int[] path = new int[slots];
        for (int i = 0; i < slots; i++) {
            double a = Math.random();
            a = Math.floor(a * 100);
            if (a % 2 == 1)
                path[i] = 1;
            else
                path[i] = 0;
        }
        return path;
    }

    public static void picture(int[][] path, int num, int slots) {
        int[] pic = new int[num];
        for (int i = 0; i < num; i++) {
            int a = 0;
            for (int j = 0; j < slots; j++) {
                if (path[i][j] == 1)
                    a = a - 1;
                else
                    a = a + 1;
            }
            pic[i] = a;
        }
        for (int i = 0; i < num; i++) {
            pic[i] = pic[i] + slots / 2;
            if (pic[i] < 0)
                pic[i] = 0;
            else if (pic[i] > slots - 1)
                pic[i] = slots - 1;
        }
        int[] times = time(pic, slots);
        int max = Arrays.stream(times).max().getAsInt();
        int[][] code = new int[max][slots];
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < slots; j++) {
                if (times[j] == 0)
                    code[i][j] = 0;
                else {
                    code[i][j] = 1;
                    times[j] = times[j] - 1;
                }
            }
        }
        for (int i = max - 1; i >= 0; i--) {
            for (int j = 0; j < slots; j++) {
                if (code[i][j] == 0)
                    System.out.print(" ");
                else
                    System.out.print("0");
            }
            System.out.println(" ");
        }
    }

    public static int[] time(int[] pic, int slot) {
        int[] times = new int[slot];
        for (int i : pic) {
            ++times[i];
        }
        return times;
    }

}