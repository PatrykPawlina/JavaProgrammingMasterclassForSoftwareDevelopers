package _9_inner_and_abstract_classes_and_interfaces.abstract_class;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breath() {
        System.out.println(getName() + " breathe in, breathe out, repeat.");
    }

    @Override
    public void canFly() {
        System.out.println(getName() + " he can fly, " + getName() + " is fast as lightning :)");
    }
}
