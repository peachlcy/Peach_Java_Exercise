import java.util.Scanner;

public class e2_14 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches:");
        double height = input.nextDouble();
        double w=weight*0.45359237;
        double h=height*0.0254;
        double BMI=w/(h*h);
        System.out.printf("BMI is %.4f",BMI);
    }
}
