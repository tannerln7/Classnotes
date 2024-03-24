import java.util.ArrayList;

public class CircleCalc{
    private double radius;
    private double xDegree;
    private double yDegree;
    private double[] pointDegrees = new double[]{1,2,3,4,5,6,7,8,9,10,11,12};

public CircleCalc(double radius, double xDegree, double yDegree){
    this.radius = radius;
    this.xDegree = xDegree;
    this.yDegree = yDegree;
}

public ArrayList<Double> hFinal(){
    ArrayList<Double> pointHeights = new ArrayList<Double>();
    for(int i = 0; i < pointDegrees.length; i++){
        pointHeights.add(this.radius * (Math.sin(Math.toRadians(xDegree)) * Math.cos(Math.toRadians(pointDegrees[i])) + Math.sin(Math.toRadians(yDegree)) * Math.sin(Math.toRadians(pointDegrees[i]))));
    }return pointHeights;
}
}