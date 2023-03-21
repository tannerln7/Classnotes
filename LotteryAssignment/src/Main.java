import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        final int lottery = rand.nextInt(90) + 10;
        System.out.println(lottery);
        System.out.println("Enter the 2 digit lottery numbers that you would like to choose.");
        int inputLength = 3;
        int userInput = 0;
        while (inputLength > 2 || userInput < 10 ) {
            Scanner input = new Scanner(System.in);
            userInput = input.nextInt();
            inputLength = String.valueOf(userInput).length();
            if (inputLength > 2 || userInput < 10) {
                System.out.println("sorry that input is invalid.");
            }
        }
        //split into digits
        int lotteryFd = lottery / 10;
        int lotterySd = lottery % 10;
        int userFd = userInput / 10;
        int userSd = userInput % 10;
        //reverse lottery
        int number = lottery, reverse = 0;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        int lotteryRev = reverse;
        //reverse user input
        int number1 = userInput, reverse1 = 0;
        for (; number1 != 0; number1 = number1 / 10) {
            int remainder1 = number1 % 10;
            reverse1 = reverse1 * 10 + remainder1;
        }
        int userRev = reverse1;

        //checks
        if (userInput == lottery) {
            System.out.println("You won $10,000");
        } else if (userRev == lottery) {
            System.out.println("You won $3,000");
        } else if (userFd == lotteryFd || userFd == lotterySd || userSd == lotteryFd || userSd == lotterySd) {
            System.out.println("You won $1,000");
        } else System.out.println("Sorry you did not win.");
    }
}