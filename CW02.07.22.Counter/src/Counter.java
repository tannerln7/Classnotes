/**
 * @author tannerln7
 * This class emulates the tally counter
 */
public class Counter {
    //define class -- public class Classname --
    private int number;
    //define method -- public datatype variableName(args) --
    /**
     * The default constructor for the class.
     */
    public Counter(){
    }
    /**
     * The constructor with one parameter
     * @param number parameter for the entered value
     */
    public Counter(int number) {
        this.number = number;
    }
    /**
     * This method emulates the click button by adding one to the instance variable
     */
    public void increment(){
        this.number = number + 1; //use - to de-increment
    }
    /**
     * This method emulates multiple clicks by adding the entered amount
     * @param digit The entered amount to be added
     */
    public void increment(int digit){
        this.number = number + digit; // increment by variable digit value -- use - to de-increment
    }
    /**
     * Sets the instance variable to the entered number
     * @param number
     */
    public void setNumber(int number){
        this.number = number;
    }
    /**
     * Sets the variable t0 0
     */
    public void reset(){
        number = 0;
    }
    /**
     * Displays the instance variable
     * @return
     */
    public int display(){
        return number;
    }
}
