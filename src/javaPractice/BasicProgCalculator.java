package javaPractice;

import java.util.Scanner;

public class BasicProgCalculator {
    public int add(int firstNumber, int secondNumber)
    {
        int result = firstNumber+secondNumber;
        return result;
    }

    public int sub(int firstNumber, int secondNumber)
    {
        int result = firstNumber-secondNumber;
        return result;
    }

    public int mul(int firstNumber, int secondNumber)
    {
        int result = firstNumber*secondNumber;
        return result;
    }

    public int div(int firstNumber, int secondNumber)
    {
        int result = firstNumber/secondNumber;
        return result;
    }

    public static void main(String[] args) {
        BasicProgCalculator obj1 = new BasicProgCalculator();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("enter second number");
        int secondNumber = sc.nextInt();

        int addResult = obj1.add(firstNumber,secondNumber);
        System.out.println("Addition of 2 numbers:"+addResult);

        int subResult = obj1.sub(firstNumber,secondNumber);
        System.out.println("Subtraction of 2 numbers:"+subResult);

        int mulResult = obj1.mul(firstNumber,secondNumber);
        System.out.println("Multiplication of 2 numbers:"+mulResult);

        int divResult = obj1.div(firstNumber,secondNumber);
        System.out.println("Division of 2 numbers:"+divResult);
    }
}
