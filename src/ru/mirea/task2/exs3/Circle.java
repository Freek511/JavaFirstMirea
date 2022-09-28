package ru.mirea.task2.exs3;

public class Circle extends Point {
    private Point center;
    private double radius;

    public Circle(double x, double y, double radius) {
        center = new Point(x, y);
        this.radius = radius;
    }
    public double getX()
    {
        return center.getX();
    }
    public double getY()
    {
        return center.getY();
    }
    public void setX(int x)
    {
        center.setX(x);
    }
    public void setY(int y)
    {
        center.setY(y);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center.toString() +
                ", radius=" + radius +
                '}';
    }
}
