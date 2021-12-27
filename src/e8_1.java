public class e8_1 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println(rectangle1.width+" "+ rectangle1.height+" "+rectangle1.getArea()+" "+rectangle1.getPerimeter());
        System.out.println(rectangle2.width+" "+ rectangle2.height+" "+rectangle2.getArea()+" "+rectangle2.getPerimeter());

    }
}

class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter(){
        return 2*(width+height);
    }
}
