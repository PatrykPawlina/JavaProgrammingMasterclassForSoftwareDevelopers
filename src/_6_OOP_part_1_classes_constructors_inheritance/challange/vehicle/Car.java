package _6_OOP_part_1_classes_constructors_inheritance.challange.vehicle;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;
    private int currentGear;

    public Car(String namel, String size, int wheels, int doors, int gear, boolean isManual) {
        super(namel, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }
}
