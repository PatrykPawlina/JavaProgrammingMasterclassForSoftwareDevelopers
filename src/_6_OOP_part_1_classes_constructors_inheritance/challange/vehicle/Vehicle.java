package _6_OOP_part_1_classes_constructors_inheritance.challange.vehicle;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String namel, String size) {
        this.name = namel;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection = +direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " deegres.");
    }

    public void move(int velocity, int direcion) {
        currentVelocity = velocity;
        currentDirection = direcion;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getNamel() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

