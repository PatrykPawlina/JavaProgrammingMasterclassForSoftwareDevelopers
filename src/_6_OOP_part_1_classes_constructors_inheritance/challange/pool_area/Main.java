package _6_OOP_part_1_classes_constructors_inheritance.challange.pool_area;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid coboid = new Cuboid(5, 10, 5);
        System.out.println("rectangle.width = " + coboid.getWidth());
        System.out.println("rectangle.length = " + coboid.getLength());
        System.out.println("rectangle.area = " + coboid.getArea());
        System.out.println("rectangle.height = " + coboid.getHeight());
        System.out.println("rectangle.volume = " + coboid.getVolume());
    }
}
