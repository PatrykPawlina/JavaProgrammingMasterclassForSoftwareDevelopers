package _7_OOP_part_2_composition_encapsulation_polymorphism.polymorphism.challange;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake() + "\n");

        Car mitsubishi = new Mitsubishi(6, "Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake() + "\n");

        Car ford = new Ford(4, "Focus");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake() + "\n");
    }
}
