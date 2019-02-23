package _6_OOP_part_1_classes_constructors_inheritance.challange.floor;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0)
            this.cost = 0;
        else
            this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
