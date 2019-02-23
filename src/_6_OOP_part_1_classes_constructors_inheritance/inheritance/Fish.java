package _6_OOP_part_1_classes_constructors_inheritance.inheritance;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
    }
}
