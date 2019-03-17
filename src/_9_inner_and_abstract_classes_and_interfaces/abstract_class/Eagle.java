package _9_inner_and_abstract_classes_and_interfaces.abstract_class;

public class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is predatory, hunting for smaller birds and rodents.");
    }

    @Override
    public void canFly() {
        super.canFly();
    }
}
