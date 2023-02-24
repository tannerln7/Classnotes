/**
 * Tanner Lane
 */
public class Cylinder {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getRadius(){
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public double getArea(){
        double area;
        area = 2 * Math.PI * radius * (radius + height);
        return area;
    }
    public double getVolume(){
        double volume;
        volume = Math.PI * radius * radius * height;
        return volume;
        }
}