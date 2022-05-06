package calculatorPrograms;

public class returnexample
{
    public int addNumbers(int firstNumber, int secondNumber)
    {

        int result=firstNumber+secondNumber;
        return result; //sout

    }

    public int subNumbers(int firstNumber, int secondNumber)
    {

        int result=firstNumber-secondNumber;
        return result;
    }

    public void mulResult(int ar,int sr)
    {
        int mr=ar*sr;
        System.out.println(mr);
    }

    public static void main(String[] args)   //psvm
    {
        returnexample c = new returnexample();
        int addResult = c.addNumbers(20,10);
       int subResult= c.subNumbers(20,10);
        c.mulResult(addResult, subResult);

    }

}
