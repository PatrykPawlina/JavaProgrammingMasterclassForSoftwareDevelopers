package _7_OOP_part_2_composition_encapsulation_polymorphism.composition.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Road vehicle");
        Car car = new Car("Peugeot", 3, 1.4);
        System.out.println(vehicle.getName());
        System.out.println(car.getDoors());
        System.out.println(car.getEngineCapacity());
        System.out.println(vehicle.toString());
        System.out.println(car.toString());
    }
}
