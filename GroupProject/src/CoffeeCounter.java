/**
 * Tanner Lane et al.
 * final
 * Group project Coffee Counter
 */
public class CoffeeCounter {
    private int amount;

    private boolean loop;
    private int caffChoice;

    /**
     * The default constructor.
     */
    public CoffeeCounter() {
    }

    /**
     * This method sets the starting value for the instance variable.
     * @param amount number - Running total of the instance variable.
     */
    public void setOunces(int amount) {
        this.amount = amount;
    }
    /**
     * This method adds the entered value to the instance variable.
     * @param increase number - The amount to add to the instance variable
     */
    public void increase(int increase) {
        this.amount = amount + increase;
    }
    /**
     * This method returns the instance variables current value.
     * @return - Returns the instance variable
     */
    public int display() {
        return amount;
    }

    /**
     * This method is for starting and stopping the input loop. While loop = true, the loop will continue. Only accepts boolean inputs.
     * @param loop Boolean - Sets whether the loop should continue or not.
     */
    public void setLoop(boolean loop){
        this.loop = loop;
    }

    /**
     * This method returns the variable. While loop = true, the loop will continue.
     * @return Boolean - Returns whether the loops should continue or not.
     */
    public boolean isLoop() {
        return loop;
    }
    public void caffChoice(int caffChoice) {
        this.caffChoice = caffChoice;
    }
    public int getCaffChoice(){
        return caffChoice;
    }
}

