import java.util.Scanner;

public class e8_12 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the endpoints of the first line segment : ");
        double[] line1=new double[4];
        double[] line2=new double[4];
        for (int i = 0; i < 4; i++) {
            line1[i]=input.nextDouble();
        }
        System.out.print("Enter the endpoints of the second line segment : ");
        for (int i = 0; i < 4; i++) {
            line2[i]=input.nextDouble();
        }
        LineSegment lineSegment1=new LineSegment(line1[0],line1[1],line1[2],line1[3]);
        LineSegment lineSegment2=new LineSegment(line2[0],line2[1],line2[2],line2[3]);
        double k1=lineSegment1.getK();
        double k2=lineSegment2.getK();
        double b1=lineSegment1.getB();
        double b2=lineSegment2.getB();


    }
}
class LineSegment{
    double x1;
    double y1;
    double x2;
    double y2;
    LinearEquation linearEquation;
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    LineSegment(double x1, double y1,double x2,double y2){
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
        linearEquation=new LinearEquation(x1,1,x2,1,y1,y2);
    }
    double getK(){
        return linearEquation.getX();
    }
    double getB(){
        return linearEquation.getY();
    }

}
