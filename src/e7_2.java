import java.util.Scanner;


public class e7_2 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        String d = input.nextLine();
        String[] numbers = a.split(" ");
        int[][] num = new int[4][4];
        num[0] = trans(a);
        num[1] = trans(b);
        num[2] = trans(c);
        num[3] = trans(d);
        int number = sumMajorDiagonal(num);
        System.out.print("Sum of the elements in the major diagonal is " + number);
    }


    public static int[] trans(String a) {
        String[] numbers = a.split(" ");
        int len = numbers.length;
        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            int b = Integer.parseInt(numbers[i]);
            num[i] = b;
        }
        return num;
    }

    public static int sumMajorDiagonal(int[][] m) {
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j)
                    num[i] = m[i][j];
            }
        }
        int a = 0;
        for (int i = 0; i < 4; i++) {
            a = num[i] + a;
        }
        return a;
    }
}