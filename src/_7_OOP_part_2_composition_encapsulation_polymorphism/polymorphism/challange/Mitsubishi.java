package _7_OOP_part_2_composition_encapsulation_polymorphism.polymorphism.challange;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + "  -> accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + "  -> brake()";
    }
}
