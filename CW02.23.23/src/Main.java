import java.util.Scanner; //Imports the Java Scanner library

/**
 * Reading input - Scanner
 * printf and Format Specifiers
 * Tanner Lane 02/23/23
 */

public class Main {
    public static void main(String[] args) {
        //obtains scanner object
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of bottles");
        // Program waits until the user types a number and presses the Enter key. **Will not save multiple values**
        int bottles = in.nextInt();
        System.out.println("Number of bottles = " + bottles);
        //use in.nextLine() to save all the characters that are typed - Line is saved as string
        String line = in.nextLine();
        System.out.println(line);

        /*
        Math operations
        */

        double number = 13.686;
        double number2;
        int x = 20;
        int y = (int)number;
        number2 = x;
        System.out.println(number2);
        System.out.println(y);
        System.out.println(Math.round(number));
        System.out.printf("The number is %10.2f, that's all. The other number is %3d\n", number, y);
        //  %10.2f - Format specifier -- 10 spaces 2 decimal places
        //  \n - creates a new line
        //  \ - escape character
        //  f for double (floating number)
        //  d for int (digit)
        //  %d -- Use d with an int
        //  %5d -- 5 Spaces are added

        /*
        Chapter Example
        */

        System.out.print("Please enter the price for a six-pack: ");
        double packPrice = in.nextDouble();

        // Read price per bottle

        System.out.print("Please enter the price for a two-liter bottle: ");
        double bottlePrice = in.nextDouble();

        final double CANS_PER_PACK = 6;
        final double CAN_VOLUME = 0.355; // 12 oz. = 0.355 l
        final double BOTTLE_VOLUME = 2;

        // Compute and print price per liter

        double packPricePerLiter = packPrice / (CANS_PER_PACK * CAN_VOLUME);
        double bottlePricePerLiter = bottlePrice / BOTTLE_VOLUME;

        System.out.printf("Pack price per liter:   %8.2f", packPricePerLiter);
        System.out.println();

        System.out.printf("Bottle price per liter: %8.2f", bottlePricePerLiter);
        System.out.println();
    }

}
