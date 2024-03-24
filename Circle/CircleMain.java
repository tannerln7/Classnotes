import java.util.ArrayList;
import java.util.Scanner;

public class CircleMain {
    double radius;
    double xDegree;
    double yDegree;
    
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double radius = in.nextDouble();
    double xDegree = in.nextDouble();
    double yDegree = in.nextDouble();
    CircleCalc circleCalc = new CircleCalc(radius, xDegree, yDegree);
    ArrayList<Double> pointHeights = circleCalc.hFinal();
    for(int i = 0; i < pointHeights.size(); i++){
        System.out.println(pointHeights.get(i).toString());
    }
    in.close();
}
}