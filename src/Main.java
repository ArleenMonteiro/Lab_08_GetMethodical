import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

/*
        double salary = SafeInput.getDouble(in , "enter your salary");
        System.out.println(salary);

 */

        double tax = SafeInput.getRangedDouble(in, "Ennter your tax:", 0.50, 9.99);
        System.out.println("You said your tax was: " + tax);


        String msg = SafeInput.getNonZeroLenString(in, "enter your name");
        System.out.println("msg is " + msg);


        /*
        String ssn = SafeInput.getRegExString(in, "enter your ssn ###-##-####", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println(ssn);

         */
        /*
        boolean isRaining = SafeInput.getYNConfirm(in, "is it raining");
        System.out.println("it is raining" + isRaining);

         */

    }
}