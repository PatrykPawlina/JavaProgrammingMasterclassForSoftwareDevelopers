package _7_OOP_part_2_composition_encapsulation_polymorphism.polymorphism;

class StarWars extends Movie {

    public StarWars() {
        super("StarsWars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}
