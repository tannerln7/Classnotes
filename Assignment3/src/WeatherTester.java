public class WeatherTester {
    public static void main(String[] args){
        Weather weather = new Weather();
        System.out.println("Default temp: " + weather.getTemp() + "F");
        System.out.println("Default Condition: " + weather.getCond());
        weather.setCond("cloudy");
        System.out.println("New Condition: " + weather.getCond());
        weather.setTemp(95);
        System.out.println("New Temp F and C: " + weather.getTemp() + "F" + " or " + weather.fToC(weather.getTemp()) + "C");
        Weather weather1 = new Weather(62, "rainy");
        System.out.println("Overload Constructor Temp F and C: " + weather1.getTemp() + "F" + " or " + weather1.fToC(weather1.getTemp()) + "C");
        System.out.println("Overload Constructor Condition: " + weather1.getCond());
    }
}
