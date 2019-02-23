package _5_control_flow_statements;

public class ParsingValuesFromAString {
    public static void main(String[] args) {
        String numberIntAsString = "2018";
        System.out.println("numberAsString = " + numberIntAsString);
        int intString = Integer.parseInt(numberIntAsString);
        intString += 5;
        System.out.println("numberAsString = " + intString);

        String doubleNumberAsString = "45.789";
        double doubleString = Double.parseDouble(doubleNumberAsString);
        System.out.println(doubleString);
    }
}
