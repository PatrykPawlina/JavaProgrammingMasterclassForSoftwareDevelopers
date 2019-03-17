package _9_inner_and_abstract_classes_and_interfaces.abstract_class;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breath() {
        System.out.println(getName() + " breathe in, breathe out, repeat.");
    }
}
