import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean complete=false;
        double itemPrice=0;
        double totalPrice=0;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "What is the price of your item ", 0.50,9.99);
            totalPrice+=itemPrice;


            complete = SafeInput.getYNConfirm(in, "Do you want to add more items? ");

        }while (complete==true);
        System.out.printf("Your total price is: "+"%.2f",totalPrice);

    }
}