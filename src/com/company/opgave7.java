package com.company;

import java.util.ArrayList;

public class opgave7 {
    public static void main(String[] args) {
        ArrayList<Square> squares = new ArrayList<Square>();
        ArrayList<Circle> circles = new ArrayList<Circle>();
        Square g = new Square(2);
        squares.add(new Square(4));
        Circle q = new Circle(4);
        circles.add(new Circle(2));
        circles.add(q);
        squares.add(g);
        ArrayList<Shape> z = new ArrayList<>();
        z.add(q);
        z.add(g);
        for (Square square : squares) {
            System.out.println(square.getArea(square));
        }
        for (Circle circle : circles){
            System.out.println(circle.getArea(circle));
        }
        for (Shape shape : z) {
            System.out.println(shape.getArea(shape));
        }

    }

}
class Square implements Shape{
    int width;

    public Square (int width){
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int getArea(Square o) {
            return Shape.super.getArea(o);
    }

}
class Circle implements Shape{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea(Circle o) {
        return Shape.super.getArea(o);
    }
}
interface Shape {
    public default int getArea(Square o) {
        return o.getWidth() * o.getWidth();
    }

    public default double getArea(Circle o) {
        return Math.PI * o.getRadius() * o.getRadius();
    }

    public default double getArea(Shape o) {
        if (o instanceof Circle) {
            return Math.PI * ((Circle) o).getRadius() * ((Circle) o).getRadius();
        } else if (o instanceof Square) {
            return ((Square) o).getWidth() * ((Square) o).getWidth();
        } else {
            return 0;
        }
    }
}
