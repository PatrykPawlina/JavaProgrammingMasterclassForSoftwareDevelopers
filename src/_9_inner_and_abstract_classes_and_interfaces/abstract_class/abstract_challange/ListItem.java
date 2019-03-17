package _9_inner_and_abstract_classes_and_interfaces.abstract_class.abstract_challange;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }
}
