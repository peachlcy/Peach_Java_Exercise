import java.util.Scanner;


public class e6_20 {
    public static int calculate = 0;

    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        int[] num = {100, 100, 100, 100, 100, 100, 100, 100};
        serach(num, 0);
        System.out.println(calculate);
    }

    public static void serach(int[] num, int depth) {
        if (depth > 1) {
            for (int i = 0; i < depth - 1; i++) {
                if (num[depth - 1] == num[i] || num[depth - 1] == num[i] + (depth - i - 1) || num[depth - 1] == num[i] - (depth - i - 1)) {
                    num[depth - 1] = 100;
                    return;
                }
            }
            if (depth == 8) {
//                for (int i : num) {
//                    System.out.print(i + " ");}
                picture(num);

                calculate += 1;
                System.out.println();
                return;
            }
        }
        for (int i = 0; i < 8; i++) {
            num[depth] = i;
            serach(num, depth + 1);
        }

    }

    public static void picture(int[] num) {
        int len = num.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print("|");
                if (num[i] == j)
                    System.out.print("Q");
                else
                    System.out.print(" ");
            }
            System.out.print("|\n");
        }
    }
}