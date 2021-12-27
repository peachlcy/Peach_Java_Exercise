package e14_6;

import e14_1.GeometricObject;

public class Rectangle extends GeometricObject implements Comparable<GeometricObject> {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    /** Return area */
    public double getArea() {
        return width * height;
    }

    @Override
    /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public int compareTo(GeometricObject o) {
        if (Math.abs(this.getArea() - o.getArea()) < 1e-5)
            return 0;
        else if (this.getArea() > o.getArea())
            return 1;
        else
            return -1;
    }

}



