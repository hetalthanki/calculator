//package calculatorPrograms;

public class ArithmeticCalculator
{
    public void addNumbers(int firstNumber, int secondNumber)
    {

        int result=firstNumber+secondNumber;
        System.out.println(result);  //sout

    }

    public void subNumbers(int firstNumber, int secondNumber)
    {

        int result=firstNumber-secondNumber;
        System.out.println(result);
    }

    public void mulNumbers(int firstNumber, int secondNumber)
    {

        int result=firstNumber*secondNumber;
        System.out.println(result);
    }

    public void divideNumbers(int firstNumber, int secondNumber)
    {
        int result=firstNumber/secondNumber;
        System.out.println(result);

    }
public static void main(String[] args)   //psvm
{
    ArithmeticCalculator c = new ArithmeticCalculator();
    c.addNumbers(20,10);
    c.subNumbers(20,10);
    c.mulNumbers(20,10);
    c.divideNumbers(20,10);
}


}
