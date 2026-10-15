import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Run one test at a time: comment out the others, then screenshot each run.

        // Method A
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Method B
        int anInt = SafeInput.getInt(in, "Enter any integer");
        System.out.println("You entered: " + anInt);

        // Method C
        double aDouble = SafeInput.getDouble(in, "Enter any double");
        System.out.println("You entered: " + aDouble);

        // Method D
        int rangedInt = SafeInput.getRangedInt(in, "Enter an int", 1, 10);
        System.out.println("You entered: " + rangedInt);

        // Method E
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a double", 1.5, 9.5);
        System.out.println("You entered: " + rangedDouble);

        // Method F
        boolean yes = SafeInput.getYNConfirm(in, "Do you like Java?");
        System.out.println("You entered: " + yes);

        // Method G
        String word = SafeInput.getRegExString(in, "Enter 3 lowercase letters", "^[a-z]{3}$");
        System.out.println("You entered: " + word);
    }
}