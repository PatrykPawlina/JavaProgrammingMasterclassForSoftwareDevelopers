package _7_OOP_part_2_composition_encapsulation_polymorphism.composition.vehicle;

public class Car extends Vehicle {
    private int doors;
    private double engineCapacity;

    public Car(String name, int doors, double engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }

    public int getDoors() {
        return doors;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
