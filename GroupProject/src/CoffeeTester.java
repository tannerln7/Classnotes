import java.util.Scanner;
import static java.lang.System.*;
public class CoffeeTester {
    public static void main(String[] args) {
        CoffeeCounter loop = new CoffeeCounter();
        CoffeeCounter Caff = new CoffeeCounter();
        CoffeeCounter deCaff = new CoffeeCounter();
        loop.setLoop(true);
        Scanner input = new Scanner(in);
        out.println("Enter the starting caffeinated ounces");
        Caff.setOunces((int) input.nextDouble());
        out.println("Enter the starting decaffeinated ounces");
        deCaff.setOunces((int) input.nextDouble());
        out.println("The starting amounts are: Decaff - " + deCaff.display() + " & Caff - " + Caff.display());
         while(loop.isLoop()){
            out.println("What coffees would you like to update? 1 = Caffeinated 2 = Decaffeinated 3 = Both");
            Caff.caffChoice((int) input.nextDouble());
                if(Caff.getCaffChoice() == 1) {
                    out.println("Input the ounces of caffeinated used");
                    Caff.increase((int) input.nextDouble());
                }
                else if(Caff.getCaffChoice() == 2) {
                    out.println("input the ounces of decaffeinated used");
                    deCaff.increase((int) input.nextDouble());
                }
                else {
                    out.println("input the ounces of decaffeinated used");
                    deCaff.increase((int) input.nextDouble());
                    out.println("Input the ounces of caffeinated used");
                    Caff.increase((int) input.nextDouble());
                }
            out.println("The new totals are Caff: " + Caff.display() + " and Decaff: " + deCaff.display());
            out.println("Would you like to start again? Enter True of False");
            loop.setLoop(input.nextBoolean());
        }
        out.println("The ending total amounts are Caff: " + Caff.display() + " Decaff: " + deCaff.display());
    }
}