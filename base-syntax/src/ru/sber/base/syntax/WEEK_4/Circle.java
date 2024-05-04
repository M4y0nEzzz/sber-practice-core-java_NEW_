package ru.sber.base.syntax.WEEK_4;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "Blue");
        System.out.println(circle.toString());
    }
}