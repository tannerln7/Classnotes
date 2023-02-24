/**
 * Tanner Lane Midterm Practice
 */

public class CylinderTester {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(20,10);
        System.out.println("Cylinder:");
        System.out.println("Radius:" + cylinder.getRadius());
        System.out.println("Height:" + cylinder.getHeight());
        System.out.println("Area:" + cylinder.getArea());
        System.out.println("Volume:" + cylinder.getVolume());
    }
}
