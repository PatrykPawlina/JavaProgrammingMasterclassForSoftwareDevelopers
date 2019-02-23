package _7_OOP_part_2_composition_encapsulation_polymorphism.polymorphism;

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alliens attempt to take over planet earth";
    }
}
