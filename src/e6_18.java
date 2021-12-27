import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class e6_18 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        String num = input.nextLine();
        String[] numbers = num.split(" ");
        double[] number = sort(num(numbers));
        int len = number.length;
        for (int i = 0; i < len; i++) {
            System.out.print(number[i] + " ");
        }
    }

    public static double[] num(String[] number) {
        int len = number.length;
        double[] num = new double[len];
        for (int i = 0; i < len; i++) {
            double b = Double.parseDouble(number[i]);
            num[i] = b;
        }
        return num;
    }


    public static double[] sort(double[] num) {
        int len = num.length;
        double trans = 0;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (num[i] < num[j]) {
                    trans = num[i];
                    num[i] = num[j];
                    num[j] = trans;
                }

            }
        }

        return num;
    }
}

