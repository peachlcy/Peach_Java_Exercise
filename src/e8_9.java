public class e8_9 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        RegularPolygon regularPolygon1=new RegularPolygon();
        RegularPolygon regularPolygon2=new RegularPolygon(6,4);
        RegularPolygon regularPolygon3=new RegularPolygon(10,4,5.6,7.8);
        System.out.println(regularPolygon1.getArea()+"  "+regularPolygon1.getPerimeter());
        System.out.println(regularPolygon2.getArea()+"  "+regularPolygon2.getPerimeter());
        System.out.println(regularPolygon3.getArea()+"  "+regularPolygon3.getPerimeter());
    }
}

class RegularPolygon {
    int n;
    int side;
    double x;
    double y;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    RegularPolygon(int newN,int newSide) {
        n=newN;
        side=newSide;
        x=0;
        y=0;
    }
    RegularPolygon(int newN,int newSide,double x,double y) {
        n=newN;
        side=newSide;
        this.x=x;
        this.y=y;
    }

    double getArea() {
        return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
    }

    double getPerimeter() {
        return n*side;
    }
}
