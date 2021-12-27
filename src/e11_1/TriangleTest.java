package e11_1;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        System.out.println("222020335220187 赖楚芸 智科一班");
        Scanner input = new Scanner(System.in);
        Triangle triangle=new Triangle(1,1.5,1,"yellow",true);
        System.out.println("The area is : "+triangle.getArea());
        System.out.println("The perimeter is : "+triangle.getPerimeter());
        System.out.println("The color is : "+triangle.getColor());
        System.out.println("The filled is : "+triangle.isFilled());
    }
}
