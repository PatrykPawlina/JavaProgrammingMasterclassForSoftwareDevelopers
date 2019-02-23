package _9_inner_and_abstract_classes_and_interfaces.interfaces.saveable_challange;

import java.util.List;

public interface Saveable {
    List<String> write();

    void read(List<String> savedValue);
}
