import java.util.Scanner;
public class BirthDateTine
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        int year=SafeInput.getRangedInt(in,"What year were you born?",1950,2010);
        int month=SafeInput.getRangedInt(in,"Which month were you born in?",1,12);
        int day=0;

        switch (month)
        {
            case 2:
                day=SafeInput.getRangedInt(in, "What date were you born on?",1,28);
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day=SafeInput.getRangedInt(in, "What date were you born on?",1,31);
                break;
            case 4: case 6: case 9: case 11:
                day=SafeInput.getRangedInt(in, "What date were you born on?",1,30);
                break;
        }

        int hour=SafeInput.getRangedInt(in, "What hour were born on?",1,24);
        int min=SafeInput.getRangedInt(in,"What was the minute into the hour which you were born on?",0,59);

        System.out.println("You were born on "+month+"/"+day+"/"+year+" at "+hour+":"+min+" hours.");

    }
}
