package _9_inner_and_abstract_classes_and_interfaces.abstract_class;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void breath();

    public String getName() {
        return name;
    }
}
