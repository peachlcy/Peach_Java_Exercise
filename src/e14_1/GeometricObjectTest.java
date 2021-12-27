package e14_1;

public class GeometricObjectTest {
    public static void main(String[] args) {
        System.out.println("222020335220187 赖楚芸 智科一班");
        Circle circle1=new Circle(1);
        Circle circle2=new Circle(3);
        System.out.println("The max is "+Max.max(circle1,circle2));
        Rectangle rectangle1=new Rectangle(1,2);
        Rectangle rectangle2=new Rectangle(2,3);
        System.out.println("The max is "+Max.max(rectangle1,rectangle2));
    }

}
