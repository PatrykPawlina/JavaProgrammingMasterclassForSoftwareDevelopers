package _6_OOP_part_1_classes_constructors_inheritance.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Shark", 88, 483, 2, 2, 6);
        fish.move(45);
    }
}
