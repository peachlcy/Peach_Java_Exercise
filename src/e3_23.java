import java.util.Scanner;

public class e3_23 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        String a = input.nextLine();
        String numb1 = a.substring(0, a.indexOf(" "));
        String numb2 = a.substring(numb1.length() + 1, a.length());
        double num1 = Double.parseDouble(numb1);
        double num2 = Double.parseDouble(numb2);
        if (num1 < 5 && num2 < 2.5)
            System.out.printf("Point (%.1f, %.1f) is in the rectangle", num1, num2);
        else
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle", num1, num2);

    }
}