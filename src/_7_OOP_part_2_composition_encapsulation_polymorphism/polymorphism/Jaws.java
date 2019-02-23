package _7_OOP_part_2_composition_encapsulation_polymorphism.polymorphism;

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats a lot of people";
    }
}
