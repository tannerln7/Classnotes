public class FanTester {
    public static void main(String[] args){
        Fan fan = new Fan();
        fan.setLightOn(true);
        fan.setSpeed(Fan.HIGH);
        fan.setFanOn(true);
        System.out.println("Room");
        System.out.printf("The fan is on:        %b%n", fan.isFanOn());
        System.out.printf("The speed is:         %c%n", fan.getSpeed());
        System.out.printf("The light is on:      %b%n", fan.isLightOn());
    }
}