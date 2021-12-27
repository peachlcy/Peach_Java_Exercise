import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class e6_17 {
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
        int maxi = 0;
        double trans = 0;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                double max = num[i];
                if (max < num[j]) {
                    maxi = j;
                    max = num[j];
                } else {
                    maxi = i;
                    max = num[i];
                }
                trans = num[i];
                num[i] = num[maxi];
                num[maxi] = trans;

            }
        }
        return num;
    }
}

