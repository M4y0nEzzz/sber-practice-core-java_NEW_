package ru.sber.base.syntax.WEEK_5;

public class Point {
    //Создаем геттеры и сеттеры для полей Х и Y
    private double X;
    private double Y;

    public Point (double X, double Y){
        this.X = X;
        this.Y = Y;
    }
    public double getX(){
        return X;
    }
    public void setX(double X){
        this.X = X;
    }
    public double getY(){
        return Y;
    }
    public void setY(double Y){
        this.Y = Y;
    }

    // Создаем абстрактный класс Figure с полем Point и методами area() и perimeter()
    public abstract class Figure {
        protected Point point;

        public Figure(Point point){
            this.point = point;
        }
        public abstract double area();
        public abstract double perimeter();
    }

    //Создаем круг
    public class Circle extends Figure {
        private double radius;

        public Circle(Point point, double radius) {
            super(point);
            this.radius = radius;
        }
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
        public double perimeter() {
            return  2 * Math.PI * radius;
        }
    }

    //Создаем прямоугольник
    public class Rectangle extends Figure {
        private double length;
        private double width;

        public Rectangle(Point point, double length, double width) {
            super(point);
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }

        @Override
        public double perimeter() {
            return 2 * (length + width);
        }
    }

    //Создаем треугольник
    public class Triangle extends Figure {
        private double A;
        private double B;
        private double C;

        public Triangle(Point point, double A, double B, double C) {
            super(point);
            this.A = A;
            this.B = B;
            this.C = C;
        }

        @Override
        public double area() {
            double P = (A + B + C) / 2;
            return Math.sqrt(P * (P - A) * (P - B) * (P - C));
        }

        @Override
        public double perimeter() {
            return A + B + C;
        }
    }

    //Создаем квадрат
    public class Square extends Rectangle {
        public Square(Point point, double Side) {
            super(point, Side, Side);
        }
    }

    //У НАС ПОЛУЧАЕТСЯ, ЧТО Circle, Rectangle И Triangle - НАСЛЕДНИКИ КЛАССА Figure, А КВАДРАТ - НАСЛЕДНИК КЛАССА Rectangle

    //Создаем список цветов
    enum Color{
        Green, Blue, Red, Purple, Yellow, BLACK
    }

    //Создаем интерфейс и применяем его ко всем нашим фигурам
    interface Drawable {
        void draw();
        void draw(Color color);

        //Круг
        public class Circle implements Drawable{
            @Override
            public void draw(){
                System.out.println("Рисуем круг стандартного цвета");
                draw(Color.BLACK);
            }
            public void draw(Color color){
                System.out.println("Рисуем круг цвета" + color);
            }
        }

        //Прямоугольник
        public class Rectangle implements Drawable{
            @Override
            public void draw(){
                System.out.println("Рисуем прямоугольник стандартного цвета");
                draw(Color.BLACK);
            }
            public void draw(Color color){
                System.out.println("Рисуем прямоугольник цвета" + color);
            }
        }

        //Треугольник
        public class Triangle implements Drawable{
            @Override
            public void draw(){
                System.out.println("Рисуем треугольник стандартного цвета");
                draw(Color.BLACK);
            }
            public void draw(Color color){
                System.out.println("Рисуем треугольник цвета" + color);
            }
        }

        //Квадрат
        public class Square implements Drawable{
            @Override
            public void draw(){
                System.out.println("Рисуем квадрат стандартного цвета");
                draw(Color.BLACK);
            }
            public void draw(Color color){
                System.out.println("Рисуем квадрат цвета" + color);
            }
        }
    }

    public class FigureUtil {

        public static double area(Figure figure) {
            return figure.area();
        }

        public static double perimeter(Figure figure) {
            return figure.perimeter();
        }

        public static void draw(Drawable figure) {
            figure.draw();
        }

        public static void draw(Drawable figure, Color color) {
            figure.draw(color);
        }
    }

    public static class PaintExample {
        public static void main(String[] args) {
            Point point = new Point(0, 0);
            Figure circle = new Circle(point, 5);
            Figure rectangle = new Rectangle(point, 10, 5);
            Figure triangle = new Triangle(point, 3, 4, 5);
            Figure square = new Square(point, 5);

            System.out.println("Нарисован круг с координатами: " + circle.point);
            System.out.println("Нарисован прямоугольник с координатами: " + rectangle.point);
            System.out.println("Нарисован треугольник с координатами: " + triangle.point);
            System.out.println("Нарисован квадрат с координатами: " + square.point);
        }
    }
}
