package _6_OOP_part_1_classes_constructors_inheritance.challange.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius < 0)
            this.radius = 0;
        else
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
