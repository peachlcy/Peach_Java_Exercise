import java.util.Scanner;

public class e2_21 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double l1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double l2 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        double l3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double s = (l1 + l2 + l3) / 2;
        double area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
        System.out.printf("The area of the triangle is %.1f", area);
    }
}
