package e11_6;

public class Circle {
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

    public String toString(){
        return "The radius = " + radius;
    }
}
