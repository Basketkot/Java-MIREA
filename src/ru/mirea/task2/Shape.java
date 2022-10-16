package ru.mirea.task2;

public class Shape {
    double x;
    double y;
    Shape(double xX, double xY) {
        this.x = xX;
        this.y = xY;
    }

    public double getX() {
            return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "Shape: " + "x=" + x + ", y=" + y;
    }
}

