public class Fan {
    public static final char LOW = 'L';
    public static final char MEDIUM = 'M';
    public static final char HIGH = 'H';
    private char speed;
    private boolean fanOn;
    private boolean lightOn;

    public Fan(){
    }
    public Fan(char speed, boolean fanOn, boolean lightOn){
        this.speed = speed;
        this.fanOn = fanOn;
        this.lightOn = lightOn;
    }
    public void setFanOn(boolean fanOn){
        this.fanOn = fanOn;
    }
    public void setSpeed(char speed){
        this.speed = speed;
    }
    public void setLightOn(boolean lightOn){
        this.lightOn = lightOn;
    }
    public char getSpeed(){
        return speed;
    }
    public boolean isFanOn() {
        return fanOn;
    }
    public boolean isLightOn(){
        return lightOn;
    }
}