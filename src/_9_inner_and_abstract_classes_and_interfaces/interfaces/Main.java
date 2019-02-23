package _9_inner_and_abstract_classes_and_interfaces.interfaces;

public class Main {
    public static void main(String[] args) {
        Telephone timsPhone;
        timsPhone = new DeskPhone(1234546);
        timsPhone.powerOn();
        timsPhone.answer();
        timsPhone.callPhone(1234546);
        timsPhone.dial(457);
        timsPhone.isRinging();

        timsPhone = new MobilePhone(987654321);
        timsPhone.powerOn();
        timsPhone.callPhone(987654321);
        timsPhone.answer();
        timsPhone.dial(789);
        timsPhone.isRinging();
    }
}
