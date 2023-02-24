import org.w3c.dom.css.Rect;

import java.awt.Rectangle;
public class Main {
    public static void main(String[] args) {
        //syntax of an object -- objectName.methodName(argument1, argument2...)
        Rectangle box = new Rectangle(); //default size 0,0,0,0
        System.out.println(box);
        Rectangle box2 = new Rectangle(5, 10, 20, 25); //define box sizes
        System.out.println(box2);
        double x = box2.getX(); //getX returns a double, not int, check api to find data types
        System.out.println("x= " + x); //return X value as a variable
        System.out.println("y= " + box2.getY()); //Directly print Y value
        box.translate(50, 50); //change box sizes by adding values together. Other values stay the same
        System.out.println("box1: " + box);
        System.out.println("box2: " + box2);
        box2.translate(10,20);
        System.out.println("Box2:" + box2);
        System.out.println(new Rectangle(30,30,30,30)); //classes can be nested inside each other
        //******************************/
        Rectangle b1 = new Rectangle(20,30,40,50);
        Rectangle b2 = b1; //setting objects or classes etc. equal to each other makes their values with each other
        System.out.println("b2= " + b2);
        b2.translate(10,10);
        System.out.println("b1= " + b1);
        System.out.println("b2= " + b2);
        //*******************************/
        int number1 = 50;
        int number2 = number1;
        number2 = 70;
        System.out.println("number1= " + number1); //Primitive data types (int, boolean, etc) are independent of each-other and do not change
        System.out.println("number2= " + number2);
    }
}