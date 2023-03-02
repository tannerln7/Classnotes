public class RectangularPrism {
    private double height;
    private double length;
    private double width;
    public RectangularPrism(){}
    public RectangularPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getLength(){
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double surfaceArea(){
        double surfaceArea;
        surfaceArea = 2*((width * length) + (height  * length) + (height * width));
        return surfaceArea;
    }
    public double volume(){
        double volume;
        volume = width * height * length;
        return volume;
    }
}