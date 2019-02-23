package _3_variables_datatypesaAnd_operators;

public class StringsAndFinishingUpPrimitiveDataTypes {
    public static void main(String[] args) {

        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to: " + myString);
        myString = myString + " \u00A7 2018";
        System.out.println("myString is equal to: " + myString);

        String numberString = "250.55";
        numberString = numberString + " 49,55";
        System.out.println("My result is: " + numberString);

        String lastSting = "10";
        int myInt = 50;
        lastSting += myInt; // lastString jest teraz traktowany jako String
        System.out.println("Result String + int is " + lastSting);

        double doubleNumber = 455.78;
        lastSting += doubleNumber;
        System.out.println("Result String + double is: " + lastSting);
    }
}
