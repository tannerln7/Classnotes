import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

/*
* Tanner Lane
* Class Notes
* 1/31/23
* CISP1010
 */
public class Main {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Number = " + number); //case sensitive
        double number2; //define a double
        number2 = 5.2; //define variable value
        System.out.println(number2); //display variable
        String name = "Chattanooga";
        System.out.println("City: " + name); //Concatenate a variable
        char letter = 'A'; //define a character
        int width = 10; //define an integer -- cannot surround integer value with quotes
        int number3 = 100;
        String studentName = "Tanner"; //camelCase example.
        String _1numbername = "number name"; //variables cannot start with a number.
        int numberofCharacters = name.length(); //how to run a variable through a method
        System.out.println("Length = " + numberofCharacters);
        System.out.println(name.length());
        //Temp change all characters to uppercase in a string
        String allCaps = name.toUpperCase();
        System.out.println(allCaps);
        System.out.println(name); ////Manipulating a variable by calling does not change the original value of the variable
        String river = "Mississippi";
        System.out.println(river.charAt(4));
        String river2 = river.replace("issipp","our");
        System.out.println(river2);
        //Collectively, methods form the public interface of the class.
    }
}