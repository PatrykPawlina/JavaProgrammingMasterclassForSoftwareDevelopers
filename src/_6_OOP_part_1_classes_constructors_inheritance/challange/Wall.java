package _6_OOP_part_1_classes_constructors_inheritance.challange;

public class Wall {
    private double width;
    private double height;

    public Wall() {
    }

    public Wall(double width, double height) {
        if ((width < 0) && (height < 0)) {
            this.width = 0;
            this.height = 0;
        } else if ((width < 0) && (height > 0)) {
            this.width = 0;
            this.height = height;
        } else if ((width > 0) && (height < 0)) {
            this.height = 0;
            this.width = width;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        Wall wall1 = new Wall(-5, 4);
        Wall wall2 = new Wall(8, -7);
        System.out.println(wall.getWidth() + " " + wall.getHeight());
        System.out.println(wall1.getWidth() + " " + wall1.getHeight());
        System.out.println(wall2.getWidth() + " " + wall2.getHeight());
        System.out.println("Area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
}
