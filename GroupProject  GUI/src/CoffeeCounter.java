/**
 * Tanner Lane et al.
 * Group project Coffee Counter
 */
public class CoffeeCounter {
    private int amount;

    /**
     * The default constructor.
     */
    public CoffeeCounter() {
    }

    /**
     * This method adds the entered value to the instance variable.
     *
     * @param increase number - The amount to add to the instance variable
     */
    public void increase(int increase) {
        this.amount = amount + increase;
    }

    /**
     * This method returns the instance variables current value.
     *
     * @return - Returns the instance variable
     */
    public int display() {
        return amount;
    }
}

