import java.util.Scanner;

public class e8_11 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of a: ");
        double a=input.nextDouble();
        System.out.print("Please enter the number of b: ");
        double b=input.nextDouble();
        System.out.print("Please enter the number of c: ");
        double c=input.nextDouble();
        System.out.print("Please enter the number of d: ");
        double d=input.nextDouble();
        System.out.print("Please enter the number of e: ");
        double e=input.nextDouble();
        System.out.print("Please enter the number of f: ");
        double f=input.nextDouble();
        LinearEquation linearEquation=new LinearEquation(a,b,c,d,e,f);
        if (linearEquation.isSolvable())
            System.out.println("The x is "+linearEquation.getX()+" The y is "+linearEquation.getY());
        else
            System.out.println("The equation has no solution.");
    }
}

class LinearEquation {
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    LinearEquation(double a, double b, double c, double d, double e, double f) {
        setA(a);
        setB(b);
        setC(c);
        setD(d);
        setE(e);
        setF(f);
    }

    boolean isSolvable() {
        if (a * d - b * c != 0)
            return true;
        else
            return false;
    }

    double getX() {
        return (e*d-b*f)/(a*d-b*c);
    }
    double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
}
