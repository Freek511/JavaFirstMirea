package ru.mirea.task2.exs3;

public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
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

    @Override
    public String toString() {
        return "{" +
                + x +
                ";" + y +
                '}';
    }
}
