package _3_variables_datatypesaAnd_operators;

import java.util.Scanner;

public class PrimitiveDataTypes_Float_And_Double {
    public static void main(String[] args) {
        // width if int  = 32 (4 bytes)
        int myIntValue = 5 / 3;
        // width if float  = 32 (4 bytes)
        float myFloatValue = 5f / 3;
        // width if double  = 64 (8 bytes)
        double myDoubleValue = 5 / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        System.out.println("\n" + "----------------Chellange----------------");

        System.out.println("\n" + "Challenge - Conversion pounds to kilograms");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number of Pounds and I will convert it to the number of Kilograms: ");
        System.out.println("Number Of Kilograms = " + conversionOfPoundsIntoKilograms(scanner.nextDouble()));
    }

    public static double conversionOfPoundsIntoKilograms(double pounds) {
        return Math.round(pounds * 0.45359237 * 100) / 100.0;
    }
}

