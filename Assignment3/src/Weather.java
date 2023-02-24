/**
 * @author Tanner Lane
 * This class allows for setting and returning weather forcasts.
 * asdf;lkj;lksdjf;lkj
 */
public class Weather {
    private int temp;
    private String cond;

    /**
     * The default weather constructor for this class. Default values are 70F and Sunny.
     */
    public Weather(){
    temp = 70;
    cond = "sunny";
    }

    /**
     * The weather constructor with two parameters.
     * @param temp Parameter for the entered temperature.
     * @param cond Parameter for the entered condition.
     */
    public Weather(int temp, String cond) {
        this.temp = temp;
        this.cond = cond;

    }

    /**
     * Sets the temperature to the entered value.
     * @param temp The temperature in which to set to.
     */
    public void setTemp(int temp){
        this.temp = temp;
    }
    /**
     * Sets the condition to the entered string.
     * @param cond The condition in which to set to.
     */
    public void setCond(String cond){
        this.cond = cond;
    }

    /**
     * This method converts from Fahrenheit to Celsius.
     * @param f The Fahrenheit to convert.
     * @return The converted Celsius value.
     */
    public int fToC(int f){
        return (f-32)*5/9;
    }
    /**
     *This method returns the stored Temp value.
     * @return The temperature in Fahrenheit.
     */
    public int getTemp() {
        return temp;
    }

    /**
     * This method returns the stored weather condition as a string.
     * @return The weather condition.
     */
    public String getCond() {
        return cond;
    }
}
