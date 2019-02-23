package _7_OOP_part_2_composition_encapsulation_polymorphism.composition.computer;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(1200, 1200, 600);
        Case thecase = new Case("Master", "Eizo", "240", dimensions);
//        Resolution resolution = new Resolution(1800, 1200);
        Monitor monitor = new Monitor("WH104", "Dell", 19, new Resolution(1800, 1200));
        Motherboard motherboard = new Motherboard("GIKA78", "Gigabyte", 2, 2, "HHJHK");
        PC pc = new PC(thecase, motherboard, monitor);
        pc.powerUp();
    }
}
