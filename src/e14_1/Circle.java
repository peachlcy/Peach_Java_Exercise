package e14_1;

public class Circle extends GeometricObject{
    public double radius=0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }

    public Circle(double radius){
        setRadius(radius);
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return  Math.PI*2*radius;
    }

    public String toString(){
        return "the radius = " + radius+ " the area = " + getArea();
    }


}
