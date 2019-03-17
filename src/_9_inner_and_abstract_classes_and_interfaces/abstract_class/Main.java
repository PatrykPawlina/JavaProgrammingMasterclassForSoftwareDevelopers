package _9_inner_and_abstract_classes_and_interfaces.abstract_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dog");
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();
        System.out.println("Parrot");
        Parrot parrot = new Parrot("Austalian ringneck");
        parrot.breath();
        parrot.eat();
        parrot.canFly();
        System.out.println("Penguin");
        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.breath();
        penguin.canFly();
        System.out.println("Eagle");
        Eagle eagle = new Eagle("White-tailed Eagle");
        eagle.eat();
        eagle.breath();
        eagle.canFly();
    }
}