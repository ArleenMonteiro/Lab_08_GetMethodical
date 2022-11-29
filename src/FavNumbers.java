import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int favInt=0;
        double favDouble=0;
        favInt=SafeInput.getInt(in,"Please enter your favourite int ");
        favDouble=SafeInput.getDouble(in, "Please enter your favourite double ");
        System.out.println("\nYour favourite int value is "+favInt);
        System.out.println("\nYour favourite double value is "+favDouble);

    }
}
