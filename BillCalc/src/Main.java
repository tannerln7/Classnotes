/**
 * Tanner Lane 01/26/2023
 * TipCalculator
 * CISP1010 Tip Calculator
 **/

import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    public static void main(String... args) {
        Scanner input = new Scanner(in);
        out.println("Enter the total bill");
        var grossBill = input.nextDouble();
        while (grossBill < 1) {
            out.println("You entered a negative bill amount. Please re-enter");
            grossBill = input.nextDouble();
            System.out.println("10 + 20 = " + 10 + 20);
        }
        out.println("Enter the Tip Percent");
        var tipPercent = input.nextDouble();
        while (tipPercent > 100 || tipPercent < 0) {
            out.println("ERROR You entered a negative tip or a tip greater than 100%. Please re-enter");
            tipPercent = input.nextDouble();
        }
        out.println("Enter the number of friends");
        var friends = input.nextDouble();
        if (friends < 2) {
            out.println("ERROR you have no friends. Please acquire friends and re-enter.");
            friends = input.nextDouble();
        }
        var tipDecimal = tipPercent / 100;
        var tip = grossBill * tipDecimal;
        var totalBill = grossBill + tip;
        var tipSplit = tip / friends;
        out.println("Number of Friends " + friends);
        out.println("Total Bill = $" + totalBill);
        var billSplit = totalBill / friends;
        out.println("Total per person = $" + billSplit);
        out.println("The tip due per person = $" + tipSplit);
        System.out.print("36 + 12 " + (36+12));
    }
}
