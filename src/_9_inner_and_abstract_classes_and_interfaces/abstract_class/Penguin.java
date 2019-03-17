package _9_inner_and_abstract_classes_and_interfaces.abstract_class;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eat fish.");
    }

    @Override
    public void canFly() {
        System.out.println(getName() + " is funny runs on the ace, " + getName() + " prefer to swimm instead of flying.");
    }
}
