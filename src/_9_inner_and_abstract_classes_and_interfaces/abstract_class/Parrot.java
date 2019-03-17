package _9_inner_and_abstract_classes_and_interfaces.abstract_class;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void canFly() {
        System.out.println(getName() + " can't fly very well, " + getName() + " only jumps from branch to branch.");
    }
}
