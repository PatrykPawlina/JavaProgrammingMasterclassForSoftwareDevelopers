package _3_variables_datatypesaAnd_operators;

public class PrimitiveDataTypes_Byte_Short_Int_And_Long {
    public static void main(String[] args) {

        System.out.println("Byte");

        // byte has a width of 8
        byte myByteMinValue = -128;
        System.out.println(Byte.MIN_VALUE);

        byte myByteMaxValue = 127;
        System.out.println(Byte.MAX_VALUE);
        byte myTotalByte = (byte) (myByteMinValue / 2);
        System.out.println("My total byte = " + myTotalByte);

        System.out.println("\n" + "Short");

        // short has a width of 16
        short myShortMinValue = -32_76;
        System.out.println(Short.MIN_VALUE);

        short myShortMaxValue = 32_767;
        System.out.println(Short.MAX_VALUE);

        System.out.println("\n" + "int");

        //int has a width of 32
        int myMinValue = -2_147_438_648;
        System.out.println(Integer.MIN_VALUE);

        int myMaxValue = 2_147_483_647;
        System.out.println(Integer.MAX_VALUE);

        int myTotalInt = myMinValue / 2;
        System.out.println("My total int = " + myTotalInt);

        System.out.println("\n" + "Long");

        //int has a width of 64
        long myLongMinValue = 100L; // example
        System.out.println(Long.MIN_VALUE);

        long myLongMaxValue = 200L; // example
        System.out.println(Long.MAX_VALUE);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000 + 10 * (byteValue + shortValue + intValue);
        System.out.println("Long total = " + longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("Short total = " + shortTotal);
    }
}
