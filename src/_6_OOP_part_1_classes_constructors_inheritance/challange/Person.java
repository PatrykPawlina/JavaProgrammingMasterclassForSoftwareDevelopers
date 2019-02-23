package _6_OOP_part_1_classes_constructors_inheritance.challange;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(-5);
        System.out.println(person.getAge());
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println(person.getFullName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age <= 0) || (age > 100))
            this.age = 0;
        else
            this.age = age;
    }

    public boolean isTeen() {
        return (age > 12) && (age < 20);
    }

    public String getFullName() {
        if ((getFirstName().isEmpty()) && (getLastName().isEmpty()))
            return "";
        else if (getLastName().isEmpty())
            return getFirstName();
        else if (getFirstName().isEmpty())
            return getLastName();
        else
            return getFirstName() + " " + getLastName();
    }
}
