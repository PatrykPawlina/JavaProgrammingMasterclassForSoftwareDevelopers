package _3_variables_datatypesaAnd_operators;

public class OperatorsInJava {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result -= 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result *= 10;
        System.out.println(previousResult + " x 10 = " + result);

        previousResult = result;
        result /= 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result %= 3;
        System.out.println(previousResult + " % 3 = " + result);

        result += result;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not Alien !!! ");

        int topScore = 80;
        if (topScore <= 100)
            System.out.println("You got a high score !!!");

        int secondTopScore = 60;
        if (topScore > secondTopScore && secondTopScore > 100)
            System.out.println("Greater then second top score and less than 100");

        if (topScore > 90 || secondTopScore <= 90)
            System.out.println("One of these tests is true");

        int myValue = 50;
        if (myValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = false;
        boolean wasCar = isCar;
        if (wasCar)
            System.out.println("WasCar is true");
        System.out.println("WasCar is false");

        System.out.println("\n" + "-----------------Chellange------------------");

        double firstValue = 20;
        double secondValue = 80;
        firstValue += secondValue;
        firstValue *= 25;
        firstValue %= 40;
        if (firstValue <= 20)
            System.out.println("Total was over the limit");
        System.out.println("Total resul is: " + firstValue);
    }
}
