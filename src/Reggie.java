import java.util.Scanner;
public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = SafeInput.getRegExString(in, "Please enter your ssn [###-##-####]", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + SSN);

        String MNum = SafeInput.getRegExString(in, "Please enter you UC Student M number [M#####]", "(M|m)\\d{5}");
        System.out.println("Your M number is " + MNum);

        String menu = SafeInput.getRegExString(in, "Would you like to open, save, view, or quit the menu? ", "[OoSsVvQq]");
        if (menu.equalsIgnoreCase("O"))
        {
            System.out.println("You chose to open.");
        }
        else if (menu.equalsIgnoreCase("S"))
        {
            System.out.println("You chose to save.");
        }
        else if (menu.equalsIgnoreCase("V"))
        {
            System.out.println("You chose to view.");
        }
        else if (menu.equalsIgnoreCase("Q"))
        {
            System.out.println("You chose to quit.");
        }
    }
}