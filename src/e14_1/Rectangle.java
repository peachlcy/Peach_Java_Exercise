package e14_1;

public class Rectangle extends GeometricObject{
    public double width=0;
    public double height=0;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(){

    }

    public Rectangle(double height,double width){
        setHeight(height);
        setWidth(width);
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*width*height;
    }

    public String toString(){
        return "the width = " + width+ " the height = " + height+ " the area = " + getArea();
    }
}
